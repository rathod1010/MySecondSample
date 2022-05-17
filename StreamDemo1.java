package stream_problems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
		
	public static List<Integer> addGraceMarks(List<Integer> marks)
	{
		//marks>=55 add 5 marks and return list of marks
		List<Integer> graceMarks =marks.stream().filter(n->n>=55).map(m->m+5).collect(Collectors.toList());
		return graceMarks;
	}
	
	public static int getMaxMarks(Collection<Integer> marks)
	{
		//return highest marks
		
		return marks.stream().max(Integer::compare).get();
		//max(a,b->a>b?1:-1).get();
	}
	
	
	public static List<Integer> sortMarks(List<Integer> marks)
	{
		return marks.stream().sorted().collect(Collectors.toList());
	}
	
	public static Set<Integer> filterNumberToSet(List<Integer> number)
	{
		return number.stream().filter(n->n>35).map(n->n).collect(Collectors.toSet());
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(50);
		list.add(70);
		list.add(80);
		list.add(34);
		list.add(55);
		List<Integer> finalMarks = addGraceMarks(list);
		System.out.println("Marks above 55 adding grace with 5 marks");
		finalMarks.forEach(a->System.out.println(a));
		System.out.println("=============================");
		System.out.println("Sorting of marks");
		sortMarks(list).forEach(b->System.out.println(b));
		System.out.println("=============================");
		System.out.println("Maximun marks");
	   System.out.println(getMaxMarks(list));
	   
		System.out.println("=============================");
		filterNumberToSet(list).forEach(n->System.out.println(n));
		System.out.println("=============================");
		
		
	}

}
