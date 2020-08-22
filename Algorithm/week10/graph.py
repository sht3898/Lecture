from class_graph import Graph


def diet_bfs(graph, start_node):
    queue = list()
    queue.append(start_node)
    visited = set()
    visited.add(start_node)
    print('Visit ', start_node)

    while len(queue) > 0:
        visiting = queue.pop(0)
        for neighbor in graph.vert_list[visiting]:
            if neighbor not in visited:
                visited.add(neighbor)
                print('Visit ', neighbor)
                queue.append(neighbor)


def diet_dfs(graph, start_node):
    stack = list()
    visited = set()
    stack.append(start_node)

    while len(stack) > 0:
        visiting = stack.pop()
        if visiting not in visited:
            visited.add(visiting)
            print('Visit ', visiting)
            for neighbor in graph.vert_list[visiting]:
                stack.append(neighbor)


def main():
    g = Graph()
    for i in range(7):
        g.add_vertex(i)
    g.add_edge(0, 1)
    g.add_edge(0, 4)
    g.add_edge(0, 5)
    g.add_edge(1, 2)
    g.add_edge(1, 6)
    g.add_edge(2, 3)
    g.add_edge(3, 0)
    g.add_edge(4, 1)
    g.add_edge(5, 2)

    g1 = Graph()
    for i in range(6):
        g1.add_vertex(i)
    g1.add_edge(0, 1)
    g1.add_edge(0, 2)
    g1.add_edge(1, 2)
    g1.add_edge(1, 4)
    g1.add_edge(2, 3)
    g1.add_edge(3, 4)
    g1.add_edge(3, 5)

    g2 = Graph()
    for i in range(6):
        g2.add_vertex(i)
    g2.add_edge(0, 1)
    g2.add_edge(0, 2)
    g2.add_edge(1, 3)
    g2.add_edge(2, 3)
    g2.add_edge(3, 4)
    g2.add_edge(3, 5)

    g3 = Graph()
    for i in range(6):
        g3.add_vertex(i)
    g3.add_edge(0, 1)
    g3.add_edge(0, 3)
    g3.add_edge(1, 2)
    g3.add_edge(2, 4)
    g3.add_edge(2, 5)
    g3.add_edge(3, 2)
    g3.add_edge(3, 5)

    print("[ G diet_Bfs ]")
    diet_bfs(g, 0)
    print("[ G diet_Dfs ]")
    diet_dfs(g, 0)

    print("")
    print("[ G1 diet_Bfs ]")
    diet_bfs(g1, 0)
    print("[ G1 diet_Dfs ]")
    diet_dfs(g1, 0)

    print("")
    print("[ G2 diet_Bfs ]")
    diet_bfs(g2, 0)
    print("[ G2 diet_Dfs ]")
    diet_dfs(g2, 0)

    print("")
    print("[ G3 diet_Bfs ]")
    diet_bfs(g3, 0)
    print("[ G3 diet_Dfs ]")
    diet_dfs(g3, 0)


if __name__ == '__main__':
    main()