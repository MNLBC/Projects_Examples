
public class TestW1D1_4 {

	public static void stringReplace(String text) {
		text = text.replace('j', 'i');
	}

	public static void bufferReplace(StringBuffer text) {
//		text = text.append("C");
		text = new StringBuffer("C");//
	}

	public static void main(String[] args) {
		String textString = new String("java");
		StringBuffer textBuffer = new StringBuffer("java");

		stringReplace(textString);
		bufferReplace(textBuffer);

		System.out.println(textString + textBuffer);
	}
}
