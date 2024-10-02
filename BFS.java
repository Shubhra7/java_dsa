// Link: https://bit.ly/3bn84K8
import java.util.*;

public class BFS {

    public static ArrayList<Integer> bfsOfGraph(int v,
    ArrayList<ArrayList<Integer>> adj){

        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[v];
        Queue <Integer> q = new LinkedList<>();

        q.add(0);
        vis[0]=true;

        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);

            // Checking the adjacent to visited or not
            for(Integer it: adj.get(node)){
                
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(it);
                }
            }
            
        }
        // System.out.println(bfs);
        return bfs;

    }


    public static void main(String[] args) {
        int v=5, e=4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        adj.add(new ArrayList(Arrays.asList(1,2,3)));
        adj.add(new ArrayList(Arrays.asList()));
        adj.add(new ArrayList(Arrays.asList(4)));
        adj.add(new ArrayList(Arrays.asList()));
        adj.add(new ArrayList(Arrays.asList()));
        
        System.out.println(adj);

        ArrayList<Integer> ans = bfsOfGraph(v,adj);

        System.out.println(ans);
        String ka="";
        for(Integer i : ans){
            ka += " " + i;
        }
        System.out.println("The answer of bfs is: "+ka);

        
    }
    
}
