package ArithmeticCalculator01;
import java.util.Scanner;

public class ArithmeticCalculator001 {

	public static void main(String[] args) {

				int a,b;
				char op;
				Scanner scan=new Scanner (System.in);
				System.out.println("Enter the first value=");
				a=scan.nextInt();
				System.out.println("Enter the operator");
				op=scan.next().charAt(0);
				System.out.println("Enter the second value=");
				b=scan.nextInt();
				if(op=='+')
				{
					System.out.println("Addition of" +a+ "and" +b+ "=" + (a+b));	
				}
				else if(op=='-')
				{
					System.out.println("Subtraction of" +a+ "and" +b+ "=" + (a-b));	
				}
				else if(op=='*')
				{
					System.out.println("Multiplication of " +a+ "and"  +b+ "="+(a*b));
				}
				else if(op=='/')
				{
					System .out.println("Division of" + a+ "and" + b+ "="+(a/b));
				}
				else
				{
					System.out.println("Invalid Input babe");
				}
						
					
			
			}
			

		


	}


