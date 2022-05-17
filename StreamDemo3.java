package stream_problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo3 {
	
	public static List<String> getBookBasedOnBookName(HashMap<String,String> books)
	{
		List<String> titles = books.entrySet().stream().filter(e -> e.getKey().startsWith("978-0"))
				  .map(Map.Entry::getValue)
				  .collect(Collectors.toList());
		return titles;
	}

	public static void main(String[] args) {
		
			HashMap<String,String> books = new HashMap<>();
			books.put("978-0232142321", "Design patterns software");
			books.put("978-184738949", "java 8 lambdas");
			books.put("978-083748237","effective java");
			books.put("978-90009088", "atomic habits");
			books.put("978-05676776","wings of fire");
			System.out.println(getBookBasedOnBookName(books));
	}

}
