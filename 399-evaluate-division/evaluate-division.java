class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for(int i = 0; i < equations.size(); i++){
            List<String> eq = equations.get(i);
            String a = eq.get(0);
            String b = eq.get(1);
            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());

            double val = values[i];
            graph.get(a).put(b, val);
            graph.get(b).put(a, 1 / val);

        }

        int n = queries.size();
        double[] result = new double[n];
        for(int i = 0; i < n; i++){
            List<String> query = queries.get(i);
            String a = query.get(0);
            String b = query.get(1);
            if(!graph.containsKey(a)){
                result[i] = -1;
                continue;
            }
            Set<String> visited = new HashSet<>();
            result[i] = getPathDistance(graph, a, b, visited);
        }
        return result;
    }
    double getPathDistance(Map<String, Map<String, Double>> graph, String start, String destination, Set<String> visited){
        visited.add(start);
        if(start.equals(destination))
            return 1;
        for(String s: graph.get(start).keySet()){
            if(!visited.contains(s)){
                double dist = getPathDistance(graph, s, destination, visited);
                if(dist != -1)
                    return dist * graph.get(start).get(s);
            }
        } 
        return -1;
    }
}