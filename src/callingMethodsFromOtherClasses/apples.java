package callingMethodsFromOtherClasses;

import java.util.Scanner; //imports a Scanner class to allow the user to input data from the keyboard

public class apples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //This is the equivalent of doing cin in C++
		
	//----------------------------------------------------------------------------------
		tuna tunaObjectName = new tuna(); //create a new object of class tuna
		tunaObjectName.simpleMessageMethod(); //in the class tuna,
		//use a method called simpleMessageMethod
	//----------------------------------------------------------------------------------
		
		tuna tunaObjectName2 = new tuna(); //create a new object of class tuna
		System.out.println("Enter your name here: "); //displays this message to prompt user to do something
		String name = input.nextLine(); //we have a variable called name
		//we want this variable to be equal to anything we type in so if different users use the program
		//it doesn't just type the same message.
		tunaObjectName2.simpleMessageMethodWithParameters(name); //in the class tuna,
		//use a method called simpleMessageMethodWithParameters that takes an argument of name

	}

}
