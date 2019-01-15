package enisxutiki;

import java.util.ArrayList;

public class TheEvents {

	public TheEvents() {}
	
	public TheEvents(float age,String description) {}
	
	public static void main(String[] args) {
		
		Events myEvents=new Events();
		myEvents.addElement(0, (Object)(new Childhood(2,"GGGGGGG")));
		System.out.println(myEvents.readElement(0, 0));
		//myEvents.deleteElement(0,0);
		Childhood c1=new Childhood(1,"TTTTTTTY");
		
		myEvents.UpdateElement(0, 0, (Object)c1);
		System.out.println(myEvents.readElement(0, 0));
		
//		Childhood c=new Childhood();
//		Teenager t=new Teenager();
//		Adult a=new Adult();
//		
//		/*Childhood[] childs=new Childhood[50];
//		childs[0].age=11;
//		childs[0].description="snow";*/
//		
//		ArrayList<Childhood> cc=new ArrayList();//a list that we haven't stated what it holds 
//		ArrayList<Childhood> dd=new ArrayList<>();
//		//ArrayList<Childhood> ee=new ArrayList<Childhood>();
//		
		
		/*cc[0].age=11;
		dd[0].age=11;
		ee[0].age=11;*/
		
		//scenario 1
	/*	c.age=11;
		c.description="snow";
		cc.add(c);
		//cc.set(0, c);
		
		c=new Childhood();
		c.age=8;
		c.description="pokemon";
		cc.add(c);
		*/
		
		/*//scenario 2
		Childhood x=new Childhood();
		x.age=7;
		x.description="OOOOO";
		cc.add(new Childhood());//I do it so that i do not create a reference but a new object
		cc.set(cc.size()-1,x);
		
		
		x=new Childhood();
		x.age=5;
		x.description="AAAAAA";
		cc.add(new Childhood());//I do it so that i do not create a reference but a new object
		cc.set(cc.size()-1,x);//needs new object x
		
		
		//scenario 3
		
		cc.add(new Childhood(11,"&&&&&&"));
		cc.add(new Childhood(12,"SSSSS"));
		cc.add(new Childhood(3,"OOOOO"));
		cc.add(new Childhood(6,"######"));
		System.out.println(cc.get(2).readElement(2));

		

		x = new Childhood();
		x.age = 5;
		x.description = "AAAAAA";
		cc.add(new Childhood());// I do it so that i do not create a reference but a new object
		cc.set(cc.size() - 1, x);
		
		t.age=17;
		t.description="....";
		
		a.age=222;
		a.description="new mariage";
		
		//System.out.println(cc.toString());
		System.out.println(cc.get(2));*/
		//System.out.println(c);//theevents.Childhood@6a6824be after the @ shows the place in the RAM memory where the object is stored
		//System.out.println(c.age+" "+cc.get(0));
	}

}
