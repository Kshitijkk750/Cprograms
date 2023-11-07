package ads_Graph;

import java.util.Stack;

public class Dfs_Graph {

		static final int v=5;
		
		public void dfs(int arr[][],int source) {
			
			Stack<Integer> s= new Stack<>();
			boolean isVisited[]= new boolean[v];
			
			s.push(source);
			isVisited[source]= true;
			
			while(!s.empty()) {
				int node = s.pop();
				System.out.println("visited node :"+ node);
				
				for(int index=0; index<v; index++) {
					if(arr[node][index]==1 && isVisited[index]==false) {
						
						s.push(index);
						isVisited[index]=true;
					}
				}
			}
			
			
		}
	public static void main(String[] args) {

		int arr[][]= {
				{0,1,1,1,0},{1,0,0,1,1},
				{1,0,0,1,0},{1,1,1,0,1},
				{0,1,0,1,0}
		};
		int k[][]= {
				{0,1,1,0,0},{1,0,0,1,1},
				{1,0,0,0,1},{0,1,0,0,1},
				{0,1,1,1,0}
		};
		int source= arr.length;
		
		Dfs_Graph obj= new Dfs_Graph();
		
		obj.dfs(arr, 0);
	}

}
