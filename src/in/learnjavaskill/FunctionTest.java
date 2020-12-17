package in.learnjavaskill;

import java.util.function.Function;

public class FunctionTest
{

	private void testFunction()
	{
		int finalNumber = addNumberBy10.andThen(addNumberBy20)
										.apply(10);
		
		System.out.println("Final Number = " + finalNumber);
	}
	
	Function<Integer, Integer> addNumberBy10 = number -> number + 10;
	
	Function<Integer, Integer> addNumberBy20 = number -> number + 20;
	
	public static void main(String[] args)
	{
		FunctionTest functionTest = new FunctionTest();
		functionTest.testFunction();
	}

}
