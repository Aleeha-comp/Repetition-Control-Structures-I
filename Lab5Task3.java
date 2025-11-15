import java.util.*;

public class Lab5Task3{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	int i = 0;
	int count = 0;
	
	System.out.println("Enter n integers : ");
	while (i < n){
	  int number = input.nextInt();

	  if (number == 0){
	    count++;
	  }
	   i++;
	}
	System.out.println("Number of zeros : " + count);
	}
}
	