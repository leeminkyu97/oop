package kr.ac.kookmin.oop.ch5;

public class Box<T> {
	private T type;
	
	public T getType() {
		return type;
	}
	
	public void setType(T type) {
		this.type = type;
	}
	
	public static void main(String[] args) {
		Box<String> boxString = new Box<String>();
		Box<Integer> boxInteger = new Box<>();
		
		boxString.setType("Stringgeneric");
		boxInteger.setType(123);
		
		Integer myInteger = 123;
		System.out.println(myInteger);
		myInteger.toString();
		myInteger.hashCode();
	}

}
