
public class StringBuilderString {

	public static void main(String[] args) {
		String s1="Afsha";
		StringBuilder sb1=new StringBuilder("Kiran");
		s1.concat("Ansari");
		sb1.append(" Yadav");
		System.out.println(s1);
		System.out.println(sb1);
		System.out.println("String is Immutable and String Builder is not Immutable");
	}

}
