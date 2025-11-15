import java.util.Scanner;

public class Lab5Task4{
	public static void main(String[] args){
	Scanner console = new Scanner(System.in);
	
	int length = 0;
	int num;
	System.out.println("Enter a number: ");

	while (true){
	  num = console.nextInt();

	  if (num == 0){
	    break;
	  }
	length++;
	}
	System.out.println("The length of the sequence is : " + length);

	}
}
	