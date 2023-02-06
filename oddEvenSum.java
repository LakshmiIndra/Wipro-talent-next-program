import java.util.Scanner;
public class oddEvenSum {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
	    if (a+b%2==0)
	    {
	    	System.out.println("The sum of"+a+"and"+b+"is even");
	    }
	    else
	    {
	    	System.out.println("The sum of"+a+"and"+b+"is odd");
	    }

	}

}
