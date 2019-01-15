package enisxutiki;

public class Childhood {

	public float age;
	public String description;
	
	
	public Childhood() {}
	
	public Childhood(float age,String description) {
		this.age=age;
		this.description=description;
	}
	public String readElement(int index) {
		return "Element["+index+"]"+": Age= "+this.age+",Description= "+this.description; 
	}
	
	
	public String toString() {
		return "The age was: "+age+" and the event was: "+description;
	}

}
