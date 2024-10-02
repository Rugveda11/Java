package com.demo;

public class JavaMemoryModelDemo {
	//This volatile keyword ensures that the change to "eat" variable is 
	//visible to other threads 
	//Volatile usage is not compulsory but it definitely ensures 
	//consistent behaviour amongst threads on large environments
	//It might happen that without this keyword you program will go
	//into an infinite loop
	//Without volatile keyword , JMM might keep on using the same cached copy
	//where eat=false and may never know that its been set to true
	private static volatile boolean eat = false;
public static void main(String[] args) {
	 threadVisibilityExample();
}

private static void threadVisibilityExample() {
    Thread thread = new Thread(() -> {
    	System.out.println("eat is :: "+eat);
        while (!eat) {
            System.out.println("Stop eating");
        }
        System.out.println("Eating stopped!");
    }); 
    thread.start();

    // Sleep for 1 second before setting the flag
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    eat = true;
    System.out.println("Now eat is true so you can eat");
}
}
