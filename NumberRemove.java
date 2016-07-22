package pro;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

	public class NumberRemove {

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			int digits;
			System.out.println("enter the number");
			int number=scanner.nextInt();
			System.out.println("enter the number of digits to be removed");
			digits=scanner.nextInt();
			int n=number;
			int rem=0;
			int count=0;
		    while(n!=0){
		    	rem=n%10;
		    	count++;
		    	n=n/10;
		    }
		    int[] array=new int[count];
		    for(int i=count-1;i>=0;i--)
		    {
		    	if(number!=0)
		    	{
		    		rem=number%10;
		    		array[i]=rem;
		    		number=number/10;
		    	}
		    }
		    Arrays.sort(array);
		    int[] arrays=new int[count];
		    for(int i=0;i<digits;i++)
		    {
		    	arrays[i]=array[i];
		    }
		    for(int i=0;i<digits;i++)
		    {
		    	System.out.print(arrays[i]);
		    }
		    
		    
			scanner.close();
		}

	}

