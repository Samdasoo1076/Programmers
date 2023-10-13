package programmers;

import java.util.*;

public class pro181837 {

	public static void main(String[] args) {
		String[] order = {"iceamericano", "americanoice"};
		int answer = 0;
		
	      int money = 0;
	        String[] m4500 = {"iceamericano", "americanoice","hotamericano", "americanohot", "americano", "anything"};
	        String[] m5000 = {"icecafelatte", "cafelatteice","hotcafelatte", "cafelattehot", "cafelatte"};
	        
	        for(int i = 0 ; i < order.length; i++){
	            boolean tf = Arrays.asList(m4500).contains(order[i]);
	            
	            if(tf == true){
	                money += 4500;
	            } else {
	                money += 5000;
	            }
	        }
	}

}
