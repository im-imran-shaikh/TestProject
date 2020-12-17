package in.learnjavaskill;

import java.util.function.BiFunction;

public class BiFunctionTest
{

	static BiFunction<Integer, Integer, Boolean> isTwoNumberEqual = 
				(number1, number2) -> number1 == number2;
	
	public static void main(String[] args)
	{
		System.out.println(isTwoNumberEqual.apply(1, 10));

	}

}
