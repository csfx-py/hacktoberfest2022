import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    //bfs algorithm
    public static void main(String[] args){
        int[][] graph = {
            {0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 1, 1, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 1, 1, 1, 1, 1, 0}
        };
        int[] visited = new int[graph.length];
        int start = 0;
        int end = 9;
        bfs(graph, visited, start, end);
    }
    public static void bfs(int[][] graph, int[] visited, int start, int end){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        visited[start] = 1;
        while (!queue.isEmpty()){
            int current = queue.remove();
            if (current == end){
                System.out.println("Found");
                return;
            }
            for (int i = 0; i < graph.length; i++){
                if (graph[current][i] == 1 && visited[i] == 0){
                    queue.add(i);
                    visited[i] = 1;
                }
            }
        }
        System.out.println("Not found");
    }
}
