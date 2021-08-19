import java.util.Scanner;
public class LengthOfTrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		x=x*1000;
		float ans=(float)x/(float)3600;
		System.out.println(ans*y);


	}

}
