package programmers;

public class pro181856 {

	public static void main(String[] args) {
		int[] arr1 = {100, 17, 84, 1};
		int[] arr2 = {55, 12, 65, 36};
		int answer = 0;
		
		int rs = 0;
		int ps = 0;
		
		for(int num : arr2) {
			ps += num;
		}
		if (arr1.length > arr2.length || (arr1.length == arr2.length && rs > ps)) {
            answer = 1;
        } else if (arr1.length < arr2.length || (arr1.length == arr2.length && rs < ps)) {
            answer = -1;
        } else {
            answer = 0;
        }
		System.out.print(answer);

	}

}
