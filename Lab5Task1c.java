import java.util.*;

public class Lab5Task1c{
	static final int SENTINAL = -1;

	public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Part 3
        System.out.print("Enter list of numbers :");
        int number = input.nextInt();
        int sum = 0;
        int count = 0;

        while (number != SENTINAL){
            sum = sum + number;
            count++;
            number = input.nextInt();
        }
        System.out.println("Sum = " + sum);
    }
}
