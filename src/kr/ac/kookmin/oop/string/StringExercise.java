package kr.ac.kookmin.oop.string;

public class StringExercise {
	public static void main(String[] args) {
		String input = "oop, python, c++";
		String[] courses = input.split(",");
		for (String course : courses) {
			System.out.println(course);
		}
		
		String name = "object oriented programming";
		char thirdChar = name.charAt(2);
		System.out.println(thirdChar);
		
		int indexOfProgram = name.indexOf("programming");
		System.out.println(indexOfProgram);
		System.out.println(name.indexOf("software"));
		System.out.println(name.length());
		System.out.println(name.substring(7, 15));
		System.out.println(name.toUpperCase());
		System.out.println("KOOKMIN UNIV".toLowerCase());
		
		String s = "bacad";
		String s2 = "a";
		System.out.println(s.indexOf("a"));
		
		String s1 = "다나다";
		char c = s1.charAt(2);
		boolean bool = s1.charAt(0) == s1.charAt(2);
		System.out.println(c);
		System.out.println(bool);
	}
}