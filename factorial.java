import java.util.*;
public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n,fact =1;
		System.out.println("eneter no.");
		n= sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is:-"+fact);

	}

}
