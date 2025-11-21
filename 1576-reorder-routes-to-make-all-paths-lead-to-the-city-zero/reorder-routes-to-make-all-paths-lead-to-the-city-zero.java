class Solution {
    public int minReorder(int n, int[][] connections) {
        List<Integer> adjList[] = new ArrayList[n];
        for(int i = 0; i < n; i++){
            adjList[i] = new ArrayList<>();
        }

        HashSet<String> originalPath = new HashSet<>();

        for(int i = 0; i < connections.length; i++){
            int a = connections[i][0];
            int b = connections[i][1];

            originalPath.add(a + "->" + b);

            // System.out.println("[" + a + "," + b + "]");

            adjList[a].add(b);
            adjList[b].add(a);
        }
        boolean[] visited = new boolean[n];
        return dfs(0, adjList, originalPath, visited);
    }
    int dfs(int node, List<Integer> adjList[], HashSet<String> originalPath, boolean[] visited){
        visited[node] = true;
        int changes = 0;
        for(int next : adjList[node]){
            if(!visited[next]){
                // System.out.println("[" + node + "," + next + "]");
                if(originalPath.contains(node + "->" + next))
                    changes ++;
                changes += dfs(next, adjList, originalPath, visited);
            }
             
        }
        return changes;
    }
}