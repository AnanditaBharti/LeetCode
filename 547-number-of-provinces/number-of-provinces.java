class Solution {
    public int findCircleNum(int[][] isConnected) {
        Queue<Integer> notVisited = new LinkedList<>();
        int n = isConnected.length;
        for(int i = 0; i < n; i++)
            notVisited.add(i);
        int provinces = 0;
        while(!notVisited.isEmpty()){

            int currCity = notVisited.remove();
            provinces ++;

            HashSet<Integer> visited = new HashSet<>();
            visited.add(currCity);

            Queue<Integer> neighbours = new LinkedList<>();
            neighbours.add(currCity);

            while(!neighbours.isEmpty()) {
                currCity = neighbours.remove();
                int[] connectedCities = isConnected[currCity];
                for(int i = 0; i < n; i++){
                    if(connectedCities[i] == 1 && !visited.contains(i)){
                        neighbours.add(i);
                        notVisited.remove(Integer.valueOf(i));
                        visited.add(currCity);
                    }
                }
            }
        }
        return provinces;
    }
}