import matplotlib.pyplot as plt
import networkx as nx
import sys

#제공그래프
'''WDGRAPH02 = {
    'a': {'b': 8, 'd': 9, 'f': 11},
    'b': {'c': 10},
    'c': {'e': 2},
    'd': {'c': 1, 'f': 3},
    'e': {'g': 4},
    'f': {'g': 8, 'h': 8},
    'g': {'h': 7},
    'h': {'d': 12, 'e': 5}
}'''

#창작그래프
WDGRAPH02 = {
    'a': {'b': 3, 'd': 7, 'e': 5},
    'b': {'c': 12, 'd': 4},
    'c': {'d': 8, 'f': 14, 'h': 10},
    'd': {'e': 5},
    'e': {'f': 7, 'g': 9},
    'f': {'g': 6, 'h': 2},
    'g': {'h': 1},
    'h': {'b': 13}
}


def dijkstra(wdgraph, start_node):
    qnode = set()
    dist = dict()
    prev = dict()

    for node in wdgraph.keys():
        dist[node] = float('inf')
        prev[node] = None
        qnode.add(node)

    dist[start_node] = 0

    while len(qnode) != 0:
        udist = sys.maxsize
        unode = None
        for node in qnode:
            if dist[node] < udist:
                udist = dist[node]
                unode = node
        qnode.remove(unode)

        for nbr in wdgraph[unode]:
            alt = dist[unode] + (wdgraph[unode])[nbr]
            if alt < dist[nbr]:
                dist[nbr] = alt
                prev[nbr] = unode

    return dist, prev


def main():
    print("Hyuntaek's Dijkstra")
    print(dijkstra(WDGRAPH02, 'a'))

    graph = nx.DiGraph()
    data = dict()

    for key1 in WDGRAPH02.keys():
        for key2 in WDGRAPH02[key1].keys():
            u = key1
            v = key2
            weight = WDGRAPH02[u][v]
            graph.add_edge(u, v, weight=weight)
            data[(u, v)] = weight

    path = list()
    prev = dijkstra(WDGRAPH02, 'a')[1]
    for v in prev:
        if prev[v] is not None:
            path.append((prev[v], v))
    non_path = list(set(graph.edges) - set(path))

    position = nx.spring_layout(graph)
    nx.draw_networkx_nodes(graph, position)
    nx.draw_networkx_labels(graph, position)
    nx.draw_networkx_edges(graph, position, edgelist=non_path, alpha=0.5)
    nx.draw_networkx_edges(graph, position, edgelist=path, alpha=0.8, edge_color='blue', width=2)
    nx.draw_networkx_edge_labels(graph, position, edge_labels=data)

    plt.title("Hyuntaek's Dikjstra")
    plt.axis('off')
    plt.show()


if __name__ == '__main__':
    main()
