import java.util.*;
public class MaxFreq {
	public static void main(String[] args) {
		int n=10,c=0, max;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[n];
		System.out.println("Enter the elements of array:");
		for(int i = 0; i < n; i++)
		{	
			a[i] = sc.nextInt();
		}
		max = a[0];
		for(int i = 0; i < n; i++)
		{
			if(max < a[i])
			max = a[i];
		}
		for(int i = 0; i < n; i++)
		{
			if(max == a[i])
				c=c+1;
		}
		System.out.println(c);

	}
}
