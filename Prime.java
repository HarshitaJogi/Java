import java.util.Scanner;
public class Prime
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be checked: ");
		int n = sc.nextInt();
		String Result = "Number is prime";
		for(int i=2; i<n; i++){
		    if(n%i==0){
		       Result = "Number is not prime";
		    }
		    
		}
		System.out.println(Result);
	}
}