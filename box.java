
public class box {
	private int l,b,h;
	public box() {
		l=10; b=8; h=4;
		
	}
	public box(int L,int B,int H)
	{
		l=L; b=B; h=H;
	}
	public static void main (String []args) {
		box b1 = new box();
		box b2 = new box(20,15,5);
		System.out.println(b1.l);
		System.out.println(b2.l);
		
	}

}
