package aes;

class dijkstra{
	static int n;
    
    static int[][] w;
    static int[] dist;
    static boolean[] visit;
 
    public dijkstra(int n){
        this.n = n;
        w = new int[n+1][n+1];
        
        dist = new int[n+1];
        visit = new boolean[n+1];
        
        for(int i=1;i<n+1;i++)
            dist[i] = Integer.MAX_VALUE;  
    }
    public void input(int i,int j,int w){
        this.w[i][j] = w;
        this.w[j][i] = w;
    }
 
    public void run(int start) {
        dist[start] =0;
        visit[start] =true;
         
        for(int i = 1; i < n+1; i++){
            if(!visit[i] && w[start][i] !=0){
                dist[i] = w[start][i];
            }
        }
         
        for(int a = 0; a < n-1; a++){
            int min = Integer.MAX_VALUE;
            int min_index = -1;
             
            for(int i = 1; i < n+1; i++){
                if(!visit[i] && dist[i] != Integer.MAX_VALUE 
                		&& dist[i] < min){
                    min = dist[i];
                    min_index = i;
                    
                }
            }
             
            visit[min_index] = true;
            
            for(int i = 1; i < n+1; i++){
                if(!visit[i] && w[min_index][i] != 0
                	&& dist[i] > dist[min_index] + w[min_index][i])
                       dist[i] = dist[min_index] + w[min_index][i];
             }
        }
        
        for(int i=1;i<n+1;i++)
            System.out.print(dist[i]+"-");
    }
}
