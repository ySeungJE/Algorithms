
public class Combination {
	static int num;
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		int output[] = new int [arr.length];
		boolean visited[] = new boolean [arr.length];
		int n = arr.length;
		num =0;
		comb(arr, output, visited, 0, n, 2);
		
	}
	
	static void comb(int[] arr, int[] output, boolean[] visited, int start, int n, int r) {
	    if (r == 0) {
	    	for(int i =0 ; i < visited.length; i++) {
	    		if(visited[i]) {
	    			System.out.print(arr[i]+" ");
	    		}
	    	}
	    	System.out.println();
	        return;
	    }
	    for (int i=start; i<n; i++) {
	        if (visited[i] != true) {
	            visited[i] = true;
	            //output[start] = arr[i];
	            comb(arr, output, visited, i + 1, n, r-1);       
	            visited[i] = false;;
	        }
	    }
	}
}
