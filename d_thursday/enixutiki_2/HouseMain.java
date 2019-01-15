package enixutiki_2;

public class HouseMain {

	public HouseMain() {}

	public static void main(String[] args) {
		
		House h1=new House();
		Garden g1=new Garden();
		Animal d1=new Dog();//<---can ONLY have the variables of the SuperClass
		Dog d2=new Dog(); //<----can have the variables of both the super and subclass
		Animal r1=new Rat();//<---can ONLY have the variables of the SuperClass
		
		Rat r4= (Rat)((Animal)(new Dog()));//<-----upcasting the Rat r4 to an Animal
		                                   //      and then directly downcasting it to a Dog
		
		float a=11.3F;//or 'f'
		int b=(int)a;
		
		System.out.println(d1.Run());
		System.out.println(d2.Run());
	
	}

}
