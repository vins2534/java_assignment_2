package Assignment_2;

import java.util.*;

public class Main 
{
	
	public static void main(String[] args) 
	{
		
		Input inp = new Input();
		
		int[] data = inp.inputData();
		
		Parts part = new Parts();
		
		part.part1(data);
		
		
		int indexVal = part.part2(data);
		System.out.println("The index value of the first number which has the smallest distance to it's next neighbor is: " + indexVal);
		
		ArrayList<Integer> arrayList = part.part3();
		
		System.out.println("Array List: " + arrayList);
		
	}

}
