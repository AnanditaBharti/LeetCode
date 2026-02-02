class Solution {
    public int orangesRotting(int[][] grid) {
        Set<String> freshOranges = new HashSet<>();
        Queue<int[]> rottenOranges = new LinkedList<>();

        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1)
                    freshOranges.add(i + "," + j);
                else if(grid[i][j] == 2)
                    rottenOranges.add(new int[]{i, j});
            }
        }

        int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        int minutes = 0;
        while(!rottenOranges.isEmpty()){
            if(freshOranges.isEmpty())
                return minutes;
            minutes ++;
            int size = rottenOranges.size();
            for(int i = 0; i < size; i++){
                int[] cell = rottenOranges.remove();
                for(int[] dir: directions){
                    int row = cell[0] + dir[0];
                    int col = cell[1] + dir[1];
                    if(row > -1 && row < m && col > -1 && col < n && freshOranges.contains(row + "," + col)){
                        freshOranges.remove(row + "," + col);
                        rottenOranges.add(new int[]{row, col});
                    }
                }
            }
        }
        if(freshOranges.isEmpty())
            return minutes;
        return -1;
    }
}