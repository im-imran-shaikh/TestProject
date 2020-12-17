package in.learnjavaskill;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestArrayListAndLinkedList
{
	public void testLinkedList()
	{
		List<Integer> checkLinkedList = new LinkedList<>();
		IntStream.iterate(0, i -> i+1)
				.limit(10)
				.forEach(i -> checkLinkedList.add(i));
		
		checkLinkedList.stream()
						.filter(number -> number >= 5)
						.forEach( System.out :: println );
						
		
		
		
		System.out.println("-------------------------------");
		
		List<String> Null = new ArrayList<>();
		Null.add(null);
		Null.add(null);
		Null.add("value1");
		Null.add("value2");
		Null.add("value3");
		Null.add(null);
		
		 Null.stream()
				.filter(value -> value != null )
				.collect(Collectors.toList())
				.stream()
				.forEach(System.out :: println);;
		
		
		
		System.out.println(Null.size());
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TestArrayListAndLinkedList testArrayListAndLinkedList = new TestArrayListAndLinkedList();
		testArrayListAndLinkedList.testLinkedList();
	}

}
