
public class TestW1D1_1 {

	public static void main(String[] args) {

		Integer i = new Integer (42);   
		Long l = new Long (42);   
		Double d = new Double (42.0);   
		System.out.println(i ==1);
//		System.out.println(i == d);
		System.out.println(d == 1);
		System.out.println(i.equals (d));
		System.out.println(d.equals (i));
		System.out.println(i.equals (42));
		
		System.out.println(i == 42 );
		
		byte s1 = 100;  
		byte s2 = 'a';  
//		byte sum = (byte)(s1 + s2);//should cast by (byte)
		int s3 = s1;
		int s4 = 42;
		byte s5 = (byte)s4;

		long f1 = 10L;  
		float f2 = 10.0f;  
		//f1 = 10.0; default double
		System.out.println(f1);
		System.out.println(f2);
	}
}
