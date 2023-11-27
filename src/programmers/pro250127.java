package programmers;

public class pro250127 {
	
	public int func1(int humidity, int val_set) {
		if(humidity < val_set) 
			return humidity;
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
		return 3;
	}
	
	public static void main(String[] args) {
		String mode_type = "auto";
		int humidity = 23;
		int val_set = 45;
		int answer = 0;
		
		if(mode_type.equals("auto")) {
			answer = func2;
		} else if(mode_type.equals("target")) {
			answer = func1;
		} else if(mode_type.equals("minimum")) {
			answer = func3;
		}
	}

}
