import java.util.Scanner;

public class file{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("enter no first: ");
		float A = input.nextFloat();

		System.out.print("enter no second: ");
		float B = input.nextFloat();

		float Product = A*B;
		System.out.println("product is: " + Product);
	}
}