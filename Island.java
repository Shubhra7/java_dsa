import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


public class Island {

    static class Pair{
        int first, second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    static void bfs(int ro,int co, 
    int [][]vis, int [][]grid){
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(ro,co));
        int n= grid.length;
        int m= grid[0].length;

        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();

            // For checking the neighbours
            for(int delrow=-1; delrow<=1; delrow++){
                for(int delcol=-1; delcol<=1; delcol++){
                    int nrow = row + delrow;
                    int ncol = col + delcol;
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m 
                    && grid[nrow][ncol]==1 && vis[nrow][ncol]==0){
                        vis[nrow][ncol]=1;
                        q.add(new Pair(nrow, ncol));
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 1, 1, 0, 1, 0, 1},
            {1, 1, 0, 0, 1, 0, 1},
            {1, 0, 0, 1, 1, 0, 0}
        };
        

        int row = grid.length;
        int col = grid[0].length;
        int [][]vis = new int[row][col];
        int cnt=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                // Checking visited or not and make bfs
                if(vis[i][j]==0 && grid[i][j]==1){
                    bfs(i,j,vis,grid);
                    cnt +=1;
                }
            }
        }
        System.out.println("The number of island is: "+cnt);
    }

}
