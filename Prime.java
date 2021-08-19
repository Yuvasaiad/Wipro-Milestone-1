import java.util.*;
public class Prime {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   int number=sc.nextInt();
		   int flag=0;
		   for(int i=2;i<=number/2;i++)
		   {
		       if(number%i==0)
		       {
		           flag=1; 
		           break;
		       }
		   }
		   if(flag==0)
		   {
		       System.out.println("The given number is prime number");
		   }
		   else{
		       System.out.println("The given number is not prime number");
		   }


	}

}
