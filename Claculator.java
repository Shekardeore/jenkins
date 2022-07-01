package GIT;

import java.util.Scanner;

public class Claculator {
	public static void main(String[] args)
	{
		//Scanner s = new Scanner(System.in);
		int n1=20;
               int n2=10;
		int ans=1;
	
		
		//do {
			System.out.println("1.Addition\t 2.Subtraction\t 3.mul\t 4.Division\t 5.exit");
			//System.out.println("Enter your choice");
			//choice =s.nextInt();
			
			//switch(1)
			//{
//			case 1:
				System.out.println("enter the numbers");
		            
				c=n1+n2;
				System.out.println(n1+" + "+n2+"="+c);
				//break;
			//case 2:
			
				if (n1>n2)
				{
					c=n1-n2;
				}
				else
				{
				c=n1-n2;
				}
				
				System.out.println(n1+" - "+n2+"="+c);
				//break;
			//case 3:
				System.out.println("enter the numbers");
				
				c=n1*n2;
				System.out.println(n1+" * "+n2+"="+c);
				//break;
			//case 4:
				System.out.println("enter the numbers");
			
				if (n2==0)
				{System.out.println("dinoinator notnequal to 0");
				}
				else {
					
				c=n1/n2;
				}
				System.out.println(n1+" / "+n2+"="+c);
				//break;
			//case 5:
				//System.exit(0);
				//break;
				
			//default:
				//System.out.println("Wrong choice!!");
				
			//}
			//System.out.println("Do you want to contine(1/0)");
			//ans=s.nextInt();
			
		//}while(ans!=0);
	}

}
