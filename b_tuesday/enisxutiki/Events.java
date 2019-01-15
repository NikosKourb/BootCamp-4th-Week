package enisxutiki;

import java.util.ArrayList;

public class Events {
	
	private ArrayList<Childhood> childhood=new ArrayList<Childhood>();
	private ArrayList<Teenager> teenager=new ArrayList<Teenager>();
	private ArrayList<Adult> adult=new ArrayList<Adult>();

	
	public Events() {}
	
	public void addChildHoodElement(Childhood e) {
		childhood.add(e);
	}
	
	
	public void addTeenagerElement(Teenager e) {
		teenager.add(e);
	}
	
	public void addAdultElement(Adult e) {
		adult.add(e);
	}
	
	public void addElement(int type,Object e) {
		//type=0,Childhood
		//type=1,Teenager
		//type=2,Adult
		
		switch(type) {
		case 0:childhood.add((Childhood) e); break;//addChildHoodElement(e); break;
		case 1:teenager.add((Teenager) e); break;//addTeenagerElement(e); break;
		case 2:adult.add((Adult) e); break;//addAdultElement(e); break;
		}
		
	}
	
	
	
	public String readElement(int type,int index) {
		String value="";
		switch(type) {
		case 0:
			value="Element["+index+"]"+": Age= "+this.childhood.get(index).age+",Description= "+this.childhood.get(index).description;
			break;
		case 1:
			value="Element["+index+"]"+": Age= "+this.teenager.get(index).age+",Description= "+this.teenager.get(index).description;
			break;
		case 2:
			value="Element["+index+"]"+": Age= "+this.adult.get(index).age+",Description= "+this.adult.get(index).description;
			break;
		}
		return value;
	}
	
	
	
	public void deleteElement(int type,int index) {
		// type=0,Childhood
		// type=1,Teenager
		// type=2,Adult

		switch (type) {
		case 0:childhood.remove(index);break;
		case 1:teenager.remove(index);break;
		case 2:adult.remove(index);break;
		}

	}
	
	
	
	public void UpdateElement(int type,int index,Object element) {
		switch (type) {
		case 0:
			childhood.set(index, (Childhood) element);
			break;
		case 1:
			teenager.set(index, (Teenager) element);
			break;
		case 2:
			adult.set(index, (Adult) element);
			break;
		}
	}

	
	public void deleteChildhoodIndex(int index) {
		childhood.remove(index);
	}
	
	public void deleteTeenagerIndex(int index) {
		teenager.remove(index);
	}
	
	public void deleteAdultIndex(int index) {
		adult.remove(index);
	}


}
