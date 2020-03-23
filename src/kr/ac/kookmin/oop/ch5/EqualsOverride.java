package kr.ac.kookmin.oop.ch5;

public class EqualsOverride {
	private String name;
	public EqualsOverride(String name) {
		this.name = name;
	}
	
	public String getName() {return name;}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof EqualsOverride) {
			EqualsOverride eo = (EqualsOverride) obj;
			if(this.name.equals(eo.getName())) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		EqualsOverride eo1 = new EqualsOverride(new String("leeky"));
		EqualsOverride eo2 = new EqualsOverride(new String("leeky"));
		
		System.out.println(eo1.getName());
		System.out.println(eo2.getName());
		
		System.out.println(eo1 == eo2);
		System.out.println(eo1.equals(eo2));
	}

}
