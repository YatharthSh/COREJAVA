import java.util.*;
public class reverse {
	public static void main(String[] args) {
		int no , rev = 0,r,a;
		Scanner s= new Scanner(System.in);
		System.out.println("Eneter any no.");
		no = s.nextInt();
		a = no;
		while(no>0) {
			r = no%10;
			rev = rev*10+r;
			no = no/10;
		}
		System.out.println("reverse"+rev);
		System.out.println();
		
	}
}
