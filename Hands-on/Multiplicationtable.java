//WAP to print any multiplication table by using exception handling and call Thread, Sleep Method

package HandsOn;

public class Multiplicationtable extends Thread 
{
	public void run() 
	{
		System.out.println("Multiplication Table of 4");
		try 
		{
			int num=4;
			for(int i=1;i<=10;i++) {
				Thread.sleep(1000);  //Sleep the main method for one second
				System.out.println(num*i);  //Printing Multiplication Table
			}
		}
		catch(Exception e) {
		System.out.println(e);
	}

}
public static void main(String[]args) {
	Multiplicationtable M = new Multiplicationtable();
	M.start();
	
}
	
}