package enixutiki_2;//An interface is a contract that restricts you if you implement it in a class
                    //It doesn't have an constructor because it cannot create an object (instantiate)

 public interface Runnable {//<----it can also be default,abstract 
                            //     but NOT private or protected
	 
	 
	 //A void or static method MUST ALWAYS returns something
	 String Run();
	 void Looks();
	 void Freeze();
	 
	 abstract House aNewHouse(Dog d,Rat r);
	 
//	 default House aHouseWithGames() {
//		 return null;
//	 }
//	 
//	 void Runnable();//<----Doesn't show ERROR
//	
//	
//	default String play() {
//		int i=10;
//		int j=20;
//		int k=0;
//		k=i+j;
//		return "dsadvfd";
//	}
//	
//	default int playSomething() { //<----------This method does not show ERROR!!!
//		int i=10;
//		int j=20;
//		int k=0;
//		k=i+j;
//		
//		return k;
//	}
//		
//	default House aHouseToPlayWith() {//<-----It doesn't matter what type of variable 
//		return null;                  //      a method returns 
//	}                                 //      (as long as there is a class for it)
//	
//	
//	default void playOnce() {  //<--------When a method is default it needs to have a body
//		
//	};
//	
//	abstract void playTwice();
//	
//	void play3Times();//<----When i have just 'void' in a method then it is ABSTRACT!!!
//	                      //     and has the same signature as the method above it
//	
//	
}
