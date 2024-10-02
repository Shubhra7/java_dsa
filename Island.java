import java.util.ArrayList;
import java.util.Arrays;

public class Island {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 1, 1, 0, 1, 0, 1},
            {1, 1, 0, 0, 1, 0, 1},
            {1, 0, 0, 1, 1, 0, 0}
        };
        

        System.out.println(grid);

        int row = grid.length;
        int col = grid[0].length;
        int [][]vis = new int[row][col];
        int cnt=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(vis[i][j]==0 && grid[i][j]==1){
                    bfs(i,j,vis,grid);
                    cnt +=1;
                }
            }
        }
        System.out.println("The number of island is: "+cnt);
    }

}
