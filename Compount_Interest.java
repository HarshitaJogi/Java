import java.util.*;
import java.util.Calendar; import java.util.Date;
 class Compound_Interest{

	public static void main(String[] args){

	int noOfDays=0;
	Scanner sc = new Scanner(System.in); System.out.println("Enter the number of days"); 
	noOfDays=sc.nextInt();
	SBI s = new SBI(); s.calculateAmount(noOfDays,10000); 
	ICICI i=new ICICI(); i.calculateAmount(noOfDays, 12500); 
	AXIS a = new AXIS(); a.calculateAmount(noOfDays, 20000);

	} 
}


class Bank{

  double amt=0;
  double rate_of_interest=0;

  public double get_rate_of_interest(int noOfDays){

     return rate_of_interest; 
 }

}


class SBI extends Bank{

    public double get_rate_of_interest(int noOfDays){
	    if(noOfDays>=7&&noOfDays<=14){ 
	    	return 3.00;
	    }
	    else if(noOfDays>=15&&noOfDays<=30){ 
	    	return 3.00;
	    }
	    else if(noOfDays>=31&&noOfDays<=45){ 
	    	return 3.00;
	    }
	    else if(noOfDays>=46&&noOfDays<=90){ 
	    	return 4.05;
	    }
	    else if(noOfDays>=91&&noOfDays<=120){ 
	    	return 4.10;
	    }
	    else if(noOfDays>=121&&noOfDays<=180){ 
	    	return 4.10;
	    }
	    else{
	       return 2.00;
	    } 
	}

	public void calculateAmount(int noOfDays,double amt){
		System.out.println("SBI");
		double famt=0;
		double roi; 
		roi=get_rate_of_interest(noOfDays); 
		System.out.println("Rate of interest is: "); 
		System.out.println(roi);
		double y=(float)noOfDays/365;
 
    //int y=noOfDays/365; famt=amt*Math.pow((1+roi/100),y); System.out.println("Final amount is: "); System.out.println(famt);
	}
}


class ICICI extends Bank{

	public double get_rate_of_interest(int noOfDays){

		if(noOfDays>=7&&noOfDays<=14){ 
			return 3.10;
		}
		else if(noOfDays>=15&&noOfDays<=30){ 
			return 3.20;
		}
		else if(noOfDays>=31&&noOfDays<=45){ 
			return 3.50;
		}
		else if(noOfDays>=46&&noOfDays<=90){ 
			return 4.50;
		}
		else if(noOfDays>=91&&noOfDays<=120){ 
			return 4.70;
		}
		else if(noOfDays>=121&&noOfDays<=180){ 
			return 4.90;
		}
		else{
		    return 2.00;
		} 
	}
	public void calculateAmount(int noOfDays,double amt){ 
		System.out.println("ICICI");
		double famt=0;
		double roi;
		roi=get_rate_of_interest(noOfDays); 
		System.out.println("Rate of interest is: "); 
		System.out.println(roi);
		double y=(float)noOfDays/365;
		//int y=noOfDays/365; famt=amt*Math.pow((1+roi/100),y); System.out.println("Final amount is: "); System.out.println(famt);
	}
 
}


class AXIS extends Bank{

	public double get_rate_of_interest(int noOfDays){

		if(noOfDays>=7&&noOfDays<=14){ 
			return 3.15;
		}
		else if(noOfDays>=15&&noOfDays<=30){ 
			return 3.15;
		}
		else if(noOfDays>=31&&noOfDays<=45){ 
			return 3.45;
		}
		else if(noOfDays>=46&&noOfDays<=90){ 
			return 4.05;
		}
		else if(noOfDays>=91&&noOfDays<=120){ 
			return 4.70;
		}
		else if(noOfDays>=121&&noOfDays<=180){ 
			return 5.00;
		}
		else{
		     return 2.00;
		} 
	}

	public void calculateAmount(int noOfDays,double amt){ 
		System.out.println("AXIS");
		double famt=0;
		double roi;
		roi=get_rate_of_interest(noOfDays); 
		System.out.println("Rate of interest is: "); 
		System.out.println(roi);
		double y=(float)noOfDays/365;
		//int y=noOfDays/365; famt=amt*Math.pow((1+roi/100),y); System.out.println("Final amount is: "); System.out.println(famt);
	} 
}