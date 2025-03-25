package wordnet;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class DirectedGraph {
    private Map<Integer, Set<Integer>> adjacencyList;

    public DirectedGraph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(int from, int to) {
        if(!adjacencyList.containsKey(from)) {
            adjacencyList.put(from, new HashSet<>());
        }
        adjacencyList.get(from).add(to);
    }

    private void dfs(int curr, Set<Integer> visited) {
        if(visited.contains(curr)) {
            return;
        }
        visited.add(curr);
        Set<Integer> neighbors = adjacencyList.get(curr);
        if (neighbors != null) {
            for (int neighbor : neighbors) {
                dfs(neighbor, visited);
            }
        }
    }

    public Set<Integer> descendants(int start) {
        Set<Integer> visited = new HashSet<>();
        dfs(start, visited);
        return visited;
    }

    public Set<Integer> descendants(Set<Integer> starts) {
        Set<Integer> visited = new HashSet<>();
        for (int start : starts) {
            dfs(start, visited);
        }
        return visited;
    }
}
