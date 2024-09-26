package test;

/**
 * This class shows the use of == , .equals()
 * == is used for comparing memory reference
 * .equals is used for comparing contents of object
 */
public class EqualsMethodTest {
public static void main(String[] args) {
	
	//== cannot be used for object comparison
	String helloApple = "hi Apple";
	String helloApple2 = new String("hi Apple");
	Apple apple = new Apple();
	Banana banana = new Banana();
	int apple1 = 1;
	int apple2 = 1;
	//.equals() is used for object comparison
	if(apple.equals(banana))
	{
		System.out.println(apple);
	}
	else
	{
		System.out.println("apple and banana objects are different");
	}
	
	//== is used for string , int , float (value) etc comparison
	//here since we create a new object for helloApple 2 using
	//new keyword , JVM allocates seperate memory to helloApple2
	//now these two strings are unequal if you use ==
	if(helloApple==helloApple2)
	{
		System.out.println(helloApple);
	}
	else
	{
		System.out.println("apple and banana are different");
	}
	//here since we create a new object for helloApple 2 using
		//new keyword , JVM allocates seperate memory to helloApple2
		//now these two strings are equal if you use .equals
	if(helloApple.equals(helloApple2))
	{
		System.out.println(helloApple);
	}
	else
	{
		System.out.println("apple and banana are different");
	}
	
	//== for int comparison , you cannot use equals();
	if(apple1==apple2)
	{
		System.out.println("Both apples are equal");
	}
	
	
	
}
}
