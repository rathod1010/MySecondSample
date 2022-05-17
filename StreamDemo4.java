package stream_problems;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo4 {

	public static int countEmptyString(List<String> listOfString)
	{
		//this method will take list of string objects which check number of empty string objects into list
		return (int)listOfString.stream().filter(m->m.isEmpty()).count();
	}
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("");
		list.add("rathod");
		list.add("raj");
		list.add("");
		list.add("kumar");
		System.out.println(countEmptyString(list));
		
		

	}

}
