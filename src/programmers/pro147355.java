package programmers;

public class pro147355 {

	public static void main(String[] args) {
		String t = "3141592";
		String p = "271";
		int answer = 0;
		
		int len = p.length();
		long num = Long.parseLong(p);
		int rs = 0;
		
		for(int i = 0; i < t.length() - len + 1; i++) {
			long diff = Long.parseLong(t.substring(i, i + len));
			if(diff <= num) {
				rs++;
			}
		}
		answer = rs;
		System.out.println(rs);
		

	}

}
