package programmers;

public class pro120887 {

	public static void main(String[] args) {
		int i = 1;
		int j = 13;
		int k = 1;
		String strK = String.valueOf(k);
		int answer = 0;
		int rs = 0;
		
		for(int p = i; p <= j; p++) {
			String value = String.valueOf(p);
			if(value.contains(strK)) {
				String[] array = value.split("");
				for(String alpha : array) {
					if(alpha.equals(strK)) {
						rs++;
					}
				}
				
			}
		}
		System.out.println(rs);
	}

}
