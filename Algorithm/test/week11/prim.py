import matplotlib.pyplot as plt
import networkx as nx

#제공그래프
'''WUGRAPH01 = {
    'a': {'b': 7, 'd': 5},
    'b': {'a': 7, 'c': 8, 'd': 9, 'e': 7},
    'c': {'b': 8, 'e': 5},
    'd': {'a': 5, 'b': 9, 'e': 15, 'f': 6},
    'e': {'b': 7, 'c': 5, 'd': 15, 'f': 8, 'g': 9},
    'f': {'d': 6, 'e': 8, 'g': 11},
    'g': {'e': 9, 'f': 11}
}'''

#창작그래프
WUGRAPH01 = {
    'a': {'b': 3, 'd': 6},
    'b': {'a': 3, 'c': 2, 'd': 9},
    'c': {'b': 2, 'f': 7},
    'd': {'a': 6, 'b': 9, 'e': 4},
    'e': {'d': 4, 'f': 11, 'g': 5},
    'f': {'c': 7, 'e': 11, 'g': 8},
    'g': {'e': 5, 'g': 8}

}


def prim(wugraph):
    mst = dict()
    added_node = set()
    remained_node = set()

    for node in wugraph.keys():
        mst[node] = dict()

    for node in wugraph.keys():
        remained_node.add(node)

    started_node = list(wugraph.keys())[0]

    added_node.add(started_node)
    remained_node.remove(started_node)

    while len(remained_node) > 0:
        (src, dst, dist) = search_min(wugraph, added_node, remained_node)
        (mst[src])[dst] = dist
        (mst[dst])[src] = dist

        added_node.add(dst)
        remained_node.remove(dst)
    return mst


def search_min(wugraph, an, rn):# added node, remained node
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


def main():
    print("Prim 출력")
    print(prim(WUGRAPH01))

    graph = nx.DiGraph()
    data = dict()

    for key1 in WUGRAPH01.keys():
        for key2 in WUGRAPH01[key1].keys():
            u = key1
            v = key2
            weight = WUGRAPH01[u][v]
            graph.add_edge(u, v, weight=weight)
            data[(u, v)] = weight

    path = list()
    prev = prim(WUGRAPH01)
    for u in prev:
        for v in prev[u]:
            if prev[u][v] is not None:
                path.append((u, v))
    non_path = list(set(graph.edges)-set(path))

    position = nx.spring_layout(graph)
    nx.draw_networkx_nodes(graph, position)
    nx.draw_networkx_labels(graph, position)
    nx.draw_networkx_edges(graph, position, edgelist=non_path, alpha=0.5)
    nx.draw_networkx_edges(graph, position, edgelist=path, alpha=0.8, edge_color='blue', width=2)
    nx.draw_networkx_edge_labels(graph, position, edge_labels=data)

    plt.title("Hyuntaek's Prim")
    plt.axis('off')
    plt.show()


if __name__ == '__main__':
    main()
