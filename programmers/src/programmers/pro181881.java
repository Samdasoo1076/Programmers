package programmers;

public class pro181881 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 100, 99, 98};
		 int answer = 0;
	        int count = 0;
	        int[] beforArr = new int[arr.length];
	        while(count != arr.length) {
	            count = 0;
	            beforArr = arr.clone();
	            for(int i = 0; i < arr.length; i++) {
	            if(arr[i] % 2 == 0 && arr[i] >= 50) {
	                arr[i] /= 2;
	            }else if(arr[i] % 2 != 0 && arr[i] < 50) {
	                arr[i] = arr[i] * 2 + 1;
	            }
	            if(arr[i] == beforArr[i] ) count++;
	        }
	            answer++;
	        }
	        System.out.print(answer);
	}

}
