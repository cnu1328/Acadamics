
public class Wrapper {

	public static void main(String[] args) {
		int a = 10;
		
		Integer b = Integer.valueOf(a);
		
		Integer c = a;
		
		//int c = b.intValue();
		
		System.out.println(a + " " + b + " " + c);


		int e = c.intValue();
		int d = c;
		System.out.println(d + " " + e + " " + c);
		
		char ch = 'a';

		Character ch1 = ch;

		char ch2 = ch1;

		System.out.println(ch + " "+ ch1 + " " + ch2);

		System.out.println("Integer Max value : " + Integer.MAX_VALUE);
		System.out.println(Character.isDigit('1'));
		System.out.println(Boolean.logicalAnd(true, false));
		System.out.println(ch + " "+ ch1 + " " + ch2);

	}

}
