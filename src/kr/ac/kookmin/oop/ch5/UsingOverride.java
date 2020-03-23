package kr.ac.kookmin.oop.ch5;

public class UsingOverride {

	public static void main(String[] args) {
		Shape start, last, obj;
		
		//자료구조의 linked list와 비슷
		
		start = new Line();	//start가 Line
		last = start;		//last가 Line
		obj = new Rect();	//obj가 Rect
		last.next = obj;	//last의 next 변수가 Rect
		last = obj;			//last가 Rect
		obj = new Line();	//obj가 Line
		last.next = obj;	//last의 next 변수가 Line
		last = obj;			//last가 Line
		obj = new Circle();	//obj가 Circle
		last.next = obj;	//last의 next 변수가 Circle
		
		Shape p = start;	//p가 Line
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}

}
