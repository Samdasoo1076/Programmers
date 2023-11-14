package programmers;

public class pro120875 {

	public static void main(String[] args) {
        int answer = 0;
        int[][] dots  = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int xDiff1 = dots[1][0] - dots[0][0];
        int yDiff1 = dots[1][1] - dots[0][1];
        int xDiff2 = dots[3][0] - dots[2][0];
        int yDiff2 = dots[3][1] - dots[2][1];

        if (Math.abs(xDiff1 * yDiff2) == Math.abs(xDiff2 * yDiff1)) {
        	answer = 1;
        } else {
        	answer = 0;
        }
        System.out.println(answer);
	}

}
