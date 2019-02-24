/* 
 * the repository URL : https://github.com/AidouSasuto/CSE360-Assignment2-Calculator/blob/master/cse360assign2/src/cse360assign2/Calculator.java
 */

package cse360assign2;
import java.util.Scanner;

public class Calculator {
	
private int total;
private String history;
private String menu;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	public void divide (int value) {
		total = total / value;
		history = history + " / " + value;
	}
	
	public String getHistory () {
		return history;
	}
	
	/*public String menu()
	{
		menu = "1. + for add \n2. - for subtraction \n3. *for mutiplication \n4. / for divide \n5. any other input keys for quit calculator and show result and calculation history";
		return menu;
	}*/
	public void menu()
	{
		System.out.println("1. + for add \n2. - for subtraction \n3. *for mutiplication \n4. / for divide \n5. any other input keys for quit calculator and show result and calculation history");
		System.out.print("\n\n\t Please choose your calculating method:  ");
	}
	
	public static void main(String []args)
	{
		Scanner in = new Scanner (System.in);
		Calculator zichang = new Calculator();
		int flag = 1;
		char receive = ' ';
		int value;
		while(flag == 1)
		{
			zichang.menu();
			receive = in.next().charAt(0);
			switch(receive) 
			{
				case '+': 
				System.out.print("\ninput your number :  ");
				value = in.nextInt();
				System.out.println();
				zichang.add(value);
				break;
				
				case '-': 
				System.out.print("\ninput your number :  ");
				value = in.nextInt();
				System.out.println();
				zichang.subtract(value);
				break;
				
				case '*': 
				System.out.print("\ninput your number :  ");
				value = in.nextInt();
				System.out.println();
				zichang.multiply(value);
				break;
				
				case '/': 
				System.out.print("\ninput your number :  ");
				value = in.nextInt();
				System.out.println();
				zichang.divide(value);
				break;
				
				default: flag = 2;
				break;
			}//end of switch		
		}//end of while
		System.out.println("\n\nThe result is : " + zichang.getTotal() + "\nThe history is : \n" + zichang.getHistory());	
	}
	
}//end of class
