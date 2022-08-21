
import java.util.Scanner;
public class code9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
 			System.out.print("Enter your age  :-  ");
			int age=sc.nextInt();
			System.out.println();
			if(age>=18)
				System.out.println("You can Vote");
			else
				System.out.println("You can't Vote");		
		}
	}
