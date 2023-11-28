package programmers;

public class pro250127 {
	
	public int func1(int humidity, int val_set) {
		if(humidity < val_set) 
			return 3;
		return 1;
	}
	
	public int func2(int humidity) {
		if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        else if(humidity <= 10) 
        	return 5;
		return humidity;
		
	}
	
	public int func3(int humidity, int val_set) {
		if(humidity < val_set)
			return 1;
		return 0;
	}
	
	public int solution(String mode_type, int humidity, int val_set) {
		int answer = 0;
		
		if (mode_type.equals("auto")) {
            answer = func2(humidity);
        } else if (mode_type.equals("target")) {
            answer = func1(humidity, val_set);
        } else if (mode_type.equals("minimum")) {
            answer = func3(humidity, val_set);
        }
		
		return answer;
	}

	public static void main(String[] args) {
		pro250127 solution = new pro250127();
		
		String mode_type = "minimum";
		int humidity = 10;
		int val_set = 34;
		
		int result = solution.solution(mode_type, humidity, val_set);
		
		System.out.println(result);
		
		
	}
}
