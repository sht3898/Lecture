import sys
import matplotlib.pyplot as plt
import networkx as nx


def dijkstra(wdgraph, start_node):
    qnode = set()
    dist = dict()
    prev = dict()

    # FILL_HERE : initialize variables(multi lines)
    for v in wdgraph:
        dist[v] = 99999999999999
        prev[v] = None
        qnode.add(v)
    # FILL_HERE : set distance 0 from start node to start node
    dist[start_node] = 0

    while len(qnode) != 0:
        udist = sys.maxsize
        unode = None
        for node in qnode:
            if dist[node] < udist:
                udist = dist[node]
                unode = node
        # FILL_HERE: remove node from queue
        qnode.remove(unode)
        # (Most important!) FILL_HERE: compute new distance(multi lines)
        for v in wdgraph[unode]:
            alt = dist[unode] + wdgraph[unode][v]
            if alt < dist[v]:
                dist[v] = alt
                prev[v] = unode

    return dist, prev


def prim(wugraph):
    mst = dict()
    added_node = set()
    remain_node = set()

    for node in wugraph.keys():
        mst[node] = dict()
    # initialize remain_node
    for node in mst:
        remain_node.add(node)

    import random
    start_node = random.choice(list(wugraph.keys()))

    # handle start_node
    added_node.add(start_node)
    remain_node.remove(start_node)

    # compute new distance, and remain_node
    while len(remain_node) != 0:
        dist = search_min(wugraph, added_node, remain_node)
        mst[dist[1]][dist[0]] = dist[2]
        mst[dist[0]][dist[1]] = dist[2]
        added_node.add(dist[1])
        remain_node.remove(dist[1])

    return mst


def search_min(wugraph, an, rn):
    src_node = None
    dst_node = None
    dist = float('inf')
    for src in an:
        for dst in wugraph[src]:
            if dst in rn:
                if (wugraph[src])[dst] < dist:
                    dist = (wugraph[src])[dst]
                    src_node = src
                    dst_node = dst

    return src_node, dst_node, dist


WUGRAPH01 = {
    'a': {'b': 7, 'd': 5},
    'b': {'a': 7, 'c': 8, 'd': 9, 'e': 7},
    'c': {'b': 8, 'e': 5},
    'd': {'a': 5, 'b': 9, 'e': 15, 'f': 6},
    'e': {'b': 7, 'c': 5, 'd': 15, 'f': 8, 'g': 9},
    'f': {'d': 6, 'e': 8, 'g': 11},
    'g': {'e': 9, 'f': 11}
}


WDGRAPH02 = {
    'a': {'b': 8, 'd': 9, 'f': 11},
    'b': {'c': 10},
    'c': {'e': 2},
    'd': {'c': 1, 'f': 3},
    'e': {'g': 4},
    'f': {'g': 8, 'h': 8},
    'g': {'h': 7},
    'h': {'d': 12, 'e': 5}
}


def main():
    print("Dijkstra, Start A")
    print(dijkstra(WDGRAPH02, 'a'))
    print("Prim")
    print(prim(WUGRAPH01))
    graph = nx.DiGraph()
    data = dijkstra(WDGRAPH02, 'a')

    for key in data.__getitem__(0).keys():
        u = key
        v = data.__getitem__(1)[u]
        weight = data.__getitem__(0)[u]
        graph.add_edge(u, v, weight=weight)

    path = list()
    for key in data.__getitem__(0).keys():
        u = key
        v = data.__getitem__(1)[u]
        para = u, v
        path.append(para)

    non_path = list(set(graph.edges) - set(path))

    position = nx.spring_layout(graph)
    nx.draw_networkx_nodes(graph, position)
    nx.draw_networkx_labels(graph, position)
    nx.draw_networkx_edges(graph, position, edgelist=non_path, alpha=0.5)
    nx.draw_networkx_edges(graph, position, edgelist=path, alpha=0.8, edge_color='blue', width=2)
    # nx.draw_networkx_edge_labels(graph, position, edge_labels=data.__getitem__(1))

    plt.title("Hyuntaek Suh's Dijkstra")
    plt.axis('off')
    plt.show()


if __name__ == '__main__':
    main()