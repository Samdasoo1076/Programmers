package programmers;

public class pro12950 {

	public static void main(String[] args) {
		 int[][] arr1 = {{1}, {2}};
		 int[][] arr2 = {{3}, {5}};
		 int[][] answer = new int[arr1.length][arr1[0].length];
		   for(int i=0; i<arr1.length; i++){
		       for(int j=0; j<arr1[i].length; j++){
		          answer[i][j]+=arr1[i][j];
		       }
		   }
		       for(int i=0; i<arr2.length; i++){
		       for(int j=0; j<arr2[i].length; j++){
		          answer[i][j]+=arr2[i][j];
		          System.out.print(answer[i][j]);
		       }
		   }
		       	
	}

}
