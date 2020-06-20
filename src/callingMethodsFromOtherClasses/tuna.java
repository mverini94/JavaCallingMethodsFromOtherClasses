package callingMethodsFromOtherClasses;

public class tuna {

	public void simpleMessageMethod() {
		System.out.println("This is another class that we are calling from main.\n\n");
	}
	
	public void simpleMessageMethodWithParameters(String name) //anything in parameters is an argument
	{
		System.out.println("Hello " + name);
	}
}
