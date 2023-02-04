import java.util.Scanner;


class Date{
  public static void main(String[] args){
  
  Scanner sc = new Scanner(System.in);
  
  Polymorphism_Date orignal = new Polymorphism_Date();
  

  
  System.out.println("Enter your choice: ");
  int ch = sc.nextInt();
  
  switch(ch){
  
    case(1):
     System.out.println("Enter the Year: ");
     int y1 = sc.nextInt();
     
     System.out.println("Enter the Month: ");
     int m1 = sc.nextInt();
     
     System.out.println("Enter the Date: ");
     int d1 = sc.nextInt();
     
     orignal.year = y1;
     orignal.month = m1;
     orignal.date = d1;
     
     orignal.Display(1);
     break;
     
     
     case(2):
     System.out.println("Enter the Year: ");
     int y2 = sc.nextInt();
     
     System.out.println("Enter the Month: ");
     int m2 = sc.nextInt();
     
     System.out.println("Enter the Date: ");
     int d2 = sc.nextInt();
     
     System.out.println("Enter the Hour: ");
     int h2 = sc.nextInt();
     
     System.out.println("Enter the Minute: ");
     int mi2 = sc.nextInt();
     
     orignal.year = y2;
     orignal.month = m2;
     orignal.date = d2;
     orignal.hrs = h2;
     orignal.min = mi2;
     
     orignal.Display(2);
     break;
     
     
     case(3):
     System.out.println("Enter the Year: ");
     int y3 = sc.nextInt();
     
     System.out.println("Enter the Month: ");
     int m3 = sc.nextInt();
     
     System.out.println("Enter the Date: ");
     int d3 = sc.nextInt();
     
     System.out.println("Enter the Hour: ");
     int h3 = sc.nextInt();
     
     System.out.println("Enter the Minute: ");
     int mi3 = sc.nextInt();
     
     System.out.println("Enter the Second: ");
     int second3 = sc.nextInt();
     
     orignal.year = y3;
     orignal.month = m3;
     orignal.date = d3;
     orignal.hrs = h3;
     orignal.min = mi3;
     orignal.sec = second3;
     
     orignal.Display(3);   
     break;
  }
  
  }
}

class Polymorphism_Date{
    int year;
    int month;
    int date;
    int hrs;
    int min;
    int sec;
    
    Polymorphism_Date(){
      date = 1;
      month = 1;
      year = 2000;
      hrs = 00;
      min = 00;
      sec = 00;
    }
    
    public void setDate(int y, int mon, int d){
       year = y;
       month = mon;
       date = d;
    }
    
    public void setDate(int y, int mon, int d, int h, int mi){
       year = y;
       month = mon;
       date = d;
       hrs = h;
       min = mi;
    }
    
    public void setDate(int y, int mon, int d, int h, int mi, int s){
       year = y;
       month = mon;
       date = d;
       hrs = h;
       min = mi;
       sec = s;
    }
    
    public void Display(int c){
      switch(c){
      
        case(1):
          System.out.println(date + "/" + month + "/" + year);
          break;
          
        case(2):
          System.out.println(date + "/" + month + "/" + year + ";" + hrs + ":" + min);
          break;
          
        case(3):
          System.out.println(date + "/" + month + "/" + year + ";" + hrs + ":" + min + ":" + sec);
          break;
      }
             
    }
     
}

