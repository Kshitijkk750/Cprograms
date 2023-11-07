package ads_Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs_ADS {
	int v=5;
	public void bfs(int arr[][],int source) {
		
		Queue<Integer> q= new LinkedList<>();
		
		boolean isVisited[]= new boolean[v];
		
		q.add(source);
		isVisited[source]= true;
		
		while(!q.isEmpty()) {
			
			int node= q.poll();
			System.out.println("Visited node :"+ node);
			
			for(int index=0;index<v;index++) {
				if(arr[node][index]==1 && isVisited[index]==false) {
					
					q.add(index);
					isVisited[index]= true;
					
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int arr[][]= {
					{0,1,1,1,0},{1,0,0,1,1},
					{1,0,0,1,0},{1,1,1,0,1},
					{0,1,0,1,0}
			};
			int source= arr.length;
			
			Bfs_ADS obg= new Bfs_ADS();
			
			obg.bfs(arr, 0);
			
					
	}

}
