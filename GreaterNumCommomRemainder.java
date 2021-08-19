import java.util.*;
public class GreaterNumCommomRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	     int number1 = sc.nextInt();
	     int number2 = sc.nextInt();
	     int number3 = sc.nextInt();
	     int gcdNumbers = GreaterNumCommomRemainder.findGCD(number1, number2, number3);
	     System.out.println(gcdNumbers);

	}
	public static int findGCD(int x, int y)
	  {
	     if(y == 0)
	     {
	        return x;
	     }
	     else
	     {
	        return findGCD(y, x % y);
	     }
	  }
	  public static int findGCD(int x, int y, int z)
	  {
	     return findGCD(findGCD(x, y), z);
	  }


}
