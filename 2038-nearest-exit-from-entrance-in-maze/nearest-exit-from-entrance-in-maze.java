class Solution {
    boolean isExit(char[][] maze, int[] currPosition){
        if(currPosition[0] - 1 == -1 || currPosition[0] + 1 == maze.length || currPosition[1] - 1 == -1 || currPosition[1] + 1 == maze[0].length)
            return true;
        return false;
    }
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(entrance);
        maze[entrance[0]][entrance[1]] = '+';
        int steps = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int[] currPosition = queue.remove();
                if(steps != 0 && isExit(maze, currPosition))
                    return steps;
                // maze[currPosition[0]][currPosition[1]] = '+';

                int nextX = currPosition[0] - 1;
                int nextY = currPosition[1];
                if(nextX >= 0 && maze[nextX][nextY] == '.'){
                    queue.add(new int[]{nextX, nextY});
                    maze[nextX][nextY] = '+';
                }

                nextX = currPosition[0];
                nextY = currPosition[1] - 1;
                if(nextY >= 0 && maze[nextX][nextY] == '.'){
                    queue.add(new int[]{nextX, nextY});
                    maze[nextX][nextY] = '+';
                }

                nextX = currPosition[0] + 1;
                nextY = currPosition[1];
                if(nextX < maze.length && maze[nextX][nextY] == '.'){
                    queue.add(new int[]{nextX, nextY});
                    maze[nextX][nextY] = '+';
                }

                nextX = currPosition[0];
                nextY = currPosition[1] + 1;
                if(nextY < maze[0].length && maze[nextX][nextY] == '.'){
                    queue.add(new int[]{nextX, nextY});
                    maze[nextX][nextY] = '+';
                }
            }
            steps ++;
            
        }
        return -1;
    }
}