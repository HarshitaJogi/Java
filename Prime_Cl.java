import java.util.*;
import java.io.*;
public class Prime_Cl
{
	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter the number to be checked: ");
		String s = System.console().readLine();
		int n = Integer.parseInt(s);
		String Result = "Number is prime";
		for(int i=2; i<n; i++){
		    if(n%i==0){
		       Result = "Number is not prime";
		    }
		    
		}
		System.out.println(Result);
    }
}