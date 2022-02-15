public class Dupli_Combination {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		int output[] = new int [arr.length];
		boolean visited[] = new boolean [arr.length];
		int n = arr.length;
		perm(arr, output, visited, 0, n, 2,0);
		
	}
	
	static void perm(int[] arr, int[] output, boolean[] visited, int start, int n, int r,int depth) {
	    if (depth == r) {
	    	for(int i =0 ; i < depth; i++) {
	    		//if(visited[i]) {
	    			System.out.print(output[i]+" ");
	    	//	}
	    	}
	    	System.out.println();
	        return;
	    }
	    for (int i=start; i<n; i++) {
	     //   if (visited[i] != true) {
	            //visited[i] = true;
	            output[depth] = arr[i];
	            perm(arr, output, visited, i, n, r,depth+1);       
	           // visited[i] = false;;
	      //  }
	    }
	}
}