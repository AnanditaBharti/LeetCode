class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        # i=0
        # j=0
        # while(True):
        #     while(j<grid[0].length and grid[i][j]==0):
                # j+=1
        peri=0
        for i in range(0,len(grid)):
            for j in range(0,len(grid[0])):
                if(grid[i][j]==1):
                    peri+=4
                    if((i-1>=0) and grid[i-1][j]==1):
                        peri-=2
                    if((j-1>=0) and grid[i][j-1]==1):
                        peri-=2
        return peri
            