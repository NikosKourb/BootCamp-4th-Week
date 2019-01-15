package enixutiki_2;

public abstract class Animal implements Runnable{
	
	public String Something;//<-------Field NOT a property or attribute so it does not require getters-setters
	                        //        if it was private it would need getters-setters in order to access it
	public String state;

	public Animal() {}

	@Override
	public abstract String Run();

	@Override
	public abstract void Looks();

	@Override
	public abstract void Freeze();
	
	
}
