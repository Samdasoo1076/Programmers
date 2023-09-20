package programmers;

public class pro12948 {

	public static void main(String[] args) {
		String phone_number = "01033334444";
		String answer = "";
		
		String s = phone_number.substring(0,phone_number.length()-4).replaceAll("[0-9]","*");
        String t = phone_number.substring(phone_number.length()-4,phone_number.length());
	
        answer = s + t;
        System.out.println(answer);
	}

}
