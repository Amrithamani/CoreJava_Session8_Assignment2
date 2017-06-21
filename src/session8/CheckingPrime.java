package session8;

import java.util.Scanner;

class MyThread extends Thread {

	// Inheriting run method in thread class
	
	public void run() {

		System.out.println("Checking in thread class");
		//prints Checking in thread class
		
		//thread to check prime number
		
		try {

			//check number is prime or not
			
			if (CheckingPrime.input > 1 && CheckingPrime.input % 2 != 0) {

				System.out.println("Number is  prime");
				
				//prints Number is  prime

			} else {

				System.out.println("Number is not Prime.");
				
				//prints Number is not Prime.

			}

		} catch (Exception ex) {

		}

	}

}

class MyThread1 implements Runnable {

	// overriding run method implementing Runnable interface
	
	@Override
	public void run() {

		System.out.println("Checking in Runnable interface");
		//Prints Checking in Runnable interface
		
		try {

			//check number is prime or not
			
			if (CheckingPrime.input > 1 && CheckingPrime.input % 2 != 0) {

				System.out.println("Number is  prime");
				//prints Number is  prime

			} else {

				System.out.println("Number is not Prime.");
				//prints Number is not Prime.

			}

		} catch (Exception ex) {

		}

	}

}

public class CheckingPrime {

	//initializing static variable
	
	public static int input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating instance object for scanner
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number");
		//prints Enter the number

		input = in.nextInt();
		//initiating user input

		in.close();
		//closing Scanner object
		
		// creating instance object for MyThread extending Thread class

		Thread t = new MyThread();

		t.start();
		// starts execution of MyThread
		
		// creating instance object for MyThread1 which implements Runnable interface
	
		Thread t1 = new Thread(new MyThread1());
		
		t1.start();
		// starts execution of MyThread1

	}

}
