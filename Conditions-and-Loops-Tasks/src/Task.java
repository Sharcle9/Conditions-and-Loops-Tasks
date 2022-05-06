import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Task {

	static Scanner scanner = new Scanner(System.in);
	
	public static void sum() 
	{
		System.out.print("Enter the start num: ");
		int start = scanner.nextInt();
		System.out.print("\nEnter the end num: ");
		int end = scanner.nextInt();
		System.out.print("\nResult: " + (start + end)*(end - start + 1)/2);
	}
	
	public static void reverse()
	{
		System.out.print("Enter the number: ");
		int start = scanner.nextInt();
		String s = Integer.toString(start);
		String result = "";
		for(int i = s.length() - 1; i >= 0; i --)
		{
			result += s.charAt(i);
		}
		System.out.print("\nResult: " + result);
	}
	
	public static void table()
	{
		System.out.print("Enter the number: ");
		int n = scanner.nextInt();
		System.out.println();
		
		for(int i = 1; i <= 10; i ++)
		{
			System.out.println(n + " * " + i + " = " + (n*i));
		}
	}
	
	public static int[] sort(int[] array) // bubble sort
	{
		int end = array.length;
		
		if(array.length == 1) return array;
		
		
		while(end > 0)
		{
			for(int i = 0; i < end - 1; i++)
			{
				if(array[i] >= array[i + 1])
				{
					int t = array[i + 1];
					array[i + 1] = array[i];
					array[i] = t;
				}
			}

			end --;
		}
		
		return array;
	}
	
	public static int[] remove(int[] array, int index)
	{
		int[] copy = new int[array.length - 1];

		for (int i = 0, j = 0; i < array.length; i++) {
		    if (i != index) {
		        copy[j++] = array[i];
		    }
		}
		
		return copy;
	}
	
	public static int[] findDuplicates(int[] array)
	{
		int[] result = {};
		for(int i = 0; i < array.length; i++) 
		{ 
			for(int j = i + 1 ; j < array.length; j++) 
			{ 
				if (array[i] == (array[j])) 
				{ 
					boolean isInResult = false;
					for(int k = 0 ; k < result.length; k++)
					{
						if(result[k] == array[i]) {
							isInResult = true;
							break;
						}
					}
					if(!isInResult)
					{
						result = Arrays.copyOf(result, result.length + 1);
						result[result.length - 1] = array[i];
					}
				}
			}
		}

		return result;
			
	}
	
	public static String[] findCommon(String[] array1, String[] array2)
	{
		String[] result = {};
		for(int i = 0; i < array1.length; i++) 
		{ 
			for(int j = 0; j < array2.length; j++) 
			{ 
				if (array1[i].equals((array2[j]))) 
				{ 
					boolean isInResult = false;
					for(int k = 0 ; k < result.length; k++)
					{
						if(result[k].equals(array1[i])) {
							isInResult = true;
							break;
						}
					}
					if(!isInResult)
					{
						result = Arrays.copyOf(result, result.length + 1);
						result[result.length - 1] = array1[i];
					}
				}
			}
		}
		return result;
	}
	
	public static int secondLargest(int[] array)
	{
		int end = array.length;
		int s = 2;
		
		while(s > 0)
		{
			for(int i = 0; i < end - 1; i++)
			{
				if(array[i] >= array[i + 1])
				{
					int t = array[i + 1];
					array[i + 1] = array[i];
					array[i] = t;
				}
			}
			s--;
			end --;
		}
		
		return array[end];
	}
	
	public static int findIndex(int[] array, int val) 
	{
		int result = -1;
		for(int i = 0; i < array.length; i++) 
		{
			if(array[i] == val) result = i;
		}
		return result;
	}
	
	public static int[] twoSum(int[] nums, int target) 
	{
    	int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
        {
        	if(map.containsKey(target - nums[i]))
        	{
        		result[0] = nums[i];
        		result[1] = target - nums[i];
        	}
        	else map.put(nums[i], i);
        }
        return result;
      }
	
	public static void company() 
	{
		System.out.println("What is your current salary?");

		double salary = scanner.nextInt();

		System.out.println("What is your year of service?");

		int yos = scanner.nextInt();

		if(yos >= 5)
		{
			System.out.println("Your bonus amount is $" + (salary * 0.05) + ".");
		}
		else
		{
			System.out.println("Your bonus amount is $0.");
		}
	}
	
	public static void checkSquare()
	{
		System.out.println("Enter the length:");

		double l = scanner.nextInt();

		System.out.println("Enter the width:");

		double w = scanner.nextInt();

		if(w == l)
		{
			System.out.println("It is a square.");
		}
		else
		{
			System.out.println("It is not a square");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] a = {10, 56, 98, 0, 42, 6, 10, 6, 10};
		String[] b = {"aaa", "abb", "aaaa", "dfhdf"};
		String[] c = {"aaaq", "abb2", "aaaa", "dfhdf"};
		System.out.println(secondLargest(a));
	}
}
