package kr.ac.kookmin.oop.string;

public class StringEquality {
	public static void main(String[] args) {
		String name = "object oriented programming";
		String sbj1 = new String("object oriented programming");
		String sbj2 = "open source software";
		boolean isSbj1Same = name.equals(sbj1);
		boolean isSbj2Same = name.equals(sbj2);
		boolean equalCheck = name == sbj1;
		System.out.println("isSbj1Same : " + isSbj1Same + ", isSbj2Same: " + isSbj2Same + ", equal check: " + equalCheck);
		
		String class1 = "Java Programming";
		String class2 = "Java Programming";
		String class3 = new String("Java Programming");
		String class4 = new String("Java Programming");
		System.out.println(class1 + " " + class2 + " " + class3);
		System.out.println(class1 == class2); //t
		System.out.println(class1 == class3); //f
		System.out.println(class3 == class4); //f
		System.out.println(class1.equals(class3)); //t
		
		String[] names = new String[2];
		names[0] = "abc";
		String[] names2 = new String[2];
		names2[0] = new String("abc");
		boolean ab = names[0].charAt(0) == names2[0].charAt(0);
		System.out.println(ab); //t
	}
}