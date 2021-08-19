import java.util.*;
public class DiffBetTwoDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=36; 
		int r=0,t=n,diff=0; 
		while(t>0) {
			r=(r*10)+(t%10); 
			t/=10;
		} 
		diff=Math.abs((n/10%10)-(n%10));
		System.out.println(r-diff);


	}

}
