public class DFS {
    //dfs algorithm
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
        dfs(graph, visited, start, end);
    }
    public static void dfs(int[][] graph, int[] visited, int start, int end){
        visited[start] = 1;
        if (start == end){
            System.out.println("Found");
            return;
        }
        for (int i = 0; i < graph.length; i++){
            if (graph[start][i] == 1 && visited[i] == 0){
                dfs(graph, visited, i, end);
            }
        }
    }
}
