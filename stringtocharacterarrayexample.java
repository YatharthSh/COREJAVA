
public class stringtocharacterarrayexample {

	public static void main(String[] args) {
		String strorig = "Hello World";
		char [] stringArray;
		stringArray = strorig.toCharArray();
		
		for(int index =0; index < stringArray.length;index++)

			System.out.println(stringArray[index]);
	}

}
