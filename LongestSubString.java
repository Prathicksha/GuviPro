import java.util.Scanner;

	public class LongestSubString {

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter a string");
			String string=scanner.next();
			for(int i=0;i<string.length();i++){
				if(string.charAt(i)<string.charAt(i+1))
				{
					System.out.println("the Longest substring is "+string.substring(i+1));
					break;
				}
			}
		
			scanner.close();

		}

	}

