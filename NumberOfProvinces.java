import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfProvinces {

    private static void dfs(int node,
    ArrayList<ArrayList<Integer>> adjLs,int vis[]){
        vis[node]=1;
        for(Integer it: adjLs.get(node)){
            if(vis[it] == 0){
                dfs(it,adjLs,vis);
            }
        }
    }

    public static int numProvinces(
        ArrayList<ArrayList<Integer>> adj, int v){

            ArrayList<ArrayList<Integer>> adjLs = new ArrayList<ArrayList<Integer>>();

            for(int i=0;i<v;i++){
                adjLs.add(new ArrayList<Integer>());
            }

            for(int i=0;i<v;i++){
                for(int j=0;j<v;j++){
                    if(adj.get(i).get(j) == 1 && i!=j){
                        adjLs.get(i).add(j);
                        adjLs.get(j).add(i);
                    }
                }
            }

            int vis[] = new int[v];
            int cnt = 0;
            for(int i=0;i<v;i++){
                cnt ++;
                dfs(i,adjLs,vis);
            }
            return cnt;
        }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1,0,1)));
        arr.add(new ArrayList<>(Arrays.asList(0,1,0)));
        arr.add(new ArrayList<>(Arrays.asList(1,0,1)));

        System.out.println("The adjacent List: "+arr);
        int v=3;
        int count = numProvinces(arr,v);

        System.out.println("The number of provinces is: "+count);
    }
    
}
