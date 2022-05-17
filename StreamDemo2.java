package stream_problems;

import java.util.HashMap;

public class StreamDemo2 {
	
	
	public static int countNumberOfLocation(HashMap<Integer,String> empp)
	{
    
		int e=(int)empp.values().stream().distinct().count();
		return e;
	}

	public static void main(String[] args) {
		
		HashMap<Integer,String> emp = new HashMap<>();
		emp.put(1,"Hyderabd");
		emp.put(2,"banglore");
		emp.put(3,"chennai");
		emp.put(4,"chennai");
		emp.put(5,"pune");
		System.out.println(countNumberOfLocation(emp));
	

	}

}

