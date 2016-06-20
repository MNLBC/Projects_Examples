public class Swap {

	public static void main(String args[]) {
		Animal a = new Animal("Lion");

		System.out.println("Before Modify: " + a);
		modify(a);
		System.out.println("After Modify: " + a);
	}

	public static void modify(Animal animal) {
		animal.setName("Tiger");
	}

}

class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}