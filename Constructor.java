import java.util.Scanner;

public class Constructor
{


   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
      
       System.out.println("Enter the initial balance: ");
       float b = sc.nextFloat();
       
       System.out.println("Enter the rate of Interest: ");
       float r = sc.nextFloat();
       
       Account acc = new Account(b,r);
       
        while(true)
       {
       System.out.println("Choose an option: ");
       System.out.println("1. Deposit\n 2. Withdraw\n 3. Compound Interest\n 4. Balance Amount");
       float option = sc.nextFloat();
       
       
       if(option == 1){
          System.out.println("Enter the amount you want to deposit: "); 
          float d = sc.nextFloat();
          acc.deposit(d);
       }
       
       else if(option == 2){
          System.out.println("Enter the amount you want to withdraw: "); 
          float w = sc.nextFloat();
          acc.withdraw(w);
       }
       
       else if(option == 3){
            System.out.println("Enter the time period in years: ");
            float t = sc.nextFloat();
            acc.compound_int(t);
            System.out.println("The Compound interest is: " + acc.compound_int(t));  
       }
       else if(option == 4){
            System.out.println("Your final balance is: " + acc.principle); 
       }
       
       System.out.println("Do you want to continue?: 1 for yes, 0 for no");
       int cont = sc.nextInt();
       if(cont == 0)
          break;
      }
  }
}

class Account{
     float principle;
     float rate_of_interest;
     
     Account(float p, float r){
         principle = p;
         rate_of_interest = r;
     }
     
     public void deposit(float amount){
          principle = principle + amount; 
     }
     
     public void withdraw(float amount){
          principle = principle - amount; 
     }
     
     public double compound_int(float time){
          double compound_int = principle*(Math.pow((1 + rate_of_interest/100),time));
          return compound_int;
     }
}


