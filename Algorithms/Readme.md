Views:
top view
left view
bottom
right view

vertical order traversal
DFS for tree, graph
BFS/level order traversal for tree, graph
Djikstra's algo

Some Algorithms Related to Graph Theory:
1. Depth-first search - DFS 
2. Breadth-first search - BFS 
3. Kruskal's algorithm 
4. Prim's algorithm
5. **Dijkstra's algorithm** - single source shortest path algo -> shortest distance from source to all other vertices.
We can find shortest path using Breadth First Search (BFS) searching algorithm. This algorithm works fine,
but the problem is, it assumes the cost of traversing each path is same, that means the cost of each edge is same. 
Dijkstra's algorithm helps us find the shortest path where the cost of each path is not the same.

Dijkstra proposed, instead of going for First come, first serve method, if we update the nearest nodes first, 
then it'll take less updates. If we processed node 2 before, then node 3 would have been updated before, and after 
updating node 4 accordingly, we'd easily get the shortest distance! The idea is to choose from the queue, the node, 
that is closest to the source. So we will use Priority Queue here so that when we pop the queue, it will bring us the
closest node u from source. How will it do that? It'll check the value of d[u] with it.
Dijkstra's Algorithm won't work when there's a negative edge. So, we use Bellman-Ford algo

procedure dijkstra(G, source):
Q = priority_queue()
distance[] = infinity // distances from source to each vertex
Q.enqueue(source)
distance[source] = 0
while Q is not empty
    u <- nodes in Q with minimum distance[]
    remove u from the Q
    for all edges from u to v in G.adjacentEdges(v) do
        if distance[u] + cost[u][v] < distance[v]
            distance[v] = distance[u] + cost[u][v] 
            Q.enqueue(v)
        end if 
    end for
end while 
Return distance

6. Bellman–Ford algorithm
7. Ford–Fulkerson algorithm
8. Nearest neighbour algorithm

