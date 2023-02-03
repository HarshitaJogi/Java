import java.io.*;
import java.util.*;
public class Prime_Range
{
	public static void main(String[] args) throws IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.println("Enter the first number of the Range: ");
		String s1 = br.readLine();
		int n1 = Integer.parseInt(s1);
		System.out.println("Enter the second number of the Range: ");
		String s2 = br.readLine();
		int n2 = Integer.parseInt(s2);

		for(int i=n1; i<=n2; i++){

			boolean isPrime = true;
			for(int j=2; j<i; j++){
				if(i%j==0){
		        isPrime = false;
		       }
		       
			} 
			if(isPrime){
		       	System.out.println(i);
		       }    

		}
		
	}
}