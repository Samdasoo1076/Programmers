package programmers;

public class pro120863 {

	public static void main(String[] args) {
		String polynomial = "3x + 7 + x";
		String answer = "";
		  int xNum = 0; int num = 0;

	        for (String s : polynomial.split(" ")) {
	            if (s.contains("x")) // x가 있으면
	                xNum += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
	            else if (!s.equals("+"))
	                num += Integer.parseInt(s);
	        }
	        
	       answer = (xNum != 0 ? xNum > 1 ? xNum + "x" : "x" : "") 
	        		+ (num != 0 ? (xNum != 0 ? " + " : "") 
	                + num : xNum == 0 ? "0" : "");
	       
	       System.out.print(answer);

	}

}
