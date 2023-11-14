package programmers;

public class pro181864 {

	public static void main(String[] args) {
		String myString = "ABBAA";
		String pat = "AABB";
		int answer = 0;
		String rs = "";
		
		for(int i = 0; i < myString.length(); i++) {
			if("A".equals(myString.substring(i, i+1))) {
				rs += "B";
			} else {
				rs += "A";
			}
		}
		if(rs.contains(pat)) {
			answer = 1;
		}
		System.out.println(answer);

	}

}
