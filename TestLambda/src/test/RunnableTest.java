package test;

public class RunnableTest {
	public static void main (String[] args) {
	     System.out.println("=== RunnableTest ===");
	     
	     // Anonymous Runnable
//	     Runnable r1 = new Runnable(){
//	  
//	       @Override
//	       public void run(){
//	         System.out.println("Hello world old style!");
//	       }
//	     };
	  
	    // Lambda Runnable
	    Runnable r2 = () -> System.out.println("Hello world with Lambda!");
	    /*
	     * _______________________________________________________________
	     * Questo blocco di codice corrisponde al primo commentato--------|
	     * ovvero Anonymous Runnable, ovvero una classe anonima innestata-|
	     * dunque attraverso le LAMBDA functions riusciamo a creare ------|
	     * blocchi di codice più agevolmente risparmiando un sacco di ----|
	     * righe di codice------------------------------------------------|
	     * _______________________________________________________________|
	     */
//	    r1.run();
	    r2.run();   
	}

}
