
public class TestW1D1_5 {

	public static void add3(Integer i) {
		int val = i.intValue();
		val += 3;
		i = new Integer(val);
	}

	public static void main(String args[]) {
		Integer i = new Integer(0);
		add3(i);
		System.out.println(i.intValue());
		

		int m = 5;
		t1(m);
		System.out.println(m);
		
		String s1 = "abc";
		t2(s1);
		System.out.println(s1);
		
		int[] arr = { 1, 2, 3, 4 };
		t3(arr);
		System.out.println(arr[0]);
	}

	public static void t1(int n) {
		n = 10;
	}

	public static void t2(String s) {
		s = "123";
	}

	public static void t3(int[] array) {
		array[0] = 2;
	}
}
