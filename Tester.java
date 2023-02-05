import java.util.*;
class Tester{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SalariedEmployee [] emp;
        emp= new SalariedEmployee[5];
        String name;
        int id,age=0;
        double empSalary;
        

            for (int i=0;i<5;i++){
                System.out.println("Enter name: ");
                name= sc.nextLine();
                System.out.println("Enter id: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter age: ");
                age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter salary; ");
                empSalary= sc.nextDouble();
                sc.nextLine();
                emp[i]= new SalariedEmployee(name, id, age, empSalary);
                int isPermanent=0;
                System.out.println("is he a permenant employee?");
                isPermanent=sc.nextInt();
                sc.nextLine();
                if(isPermanent==1) emp[i].setEmpSalary(empSalary);
            }
            double max_salary=0;


            int index=0;
            for(int i=0;i<5;i++){
                if(emp[i].getSalary()>max_salary) {
                    max_salary=emp[i].getSalary();
                    index=i;
                }
            }

            System.out.println(emp[index].getName());
            System.out.println(emp[index].getId());
            System.out.println(emp[index].getAge());
            System.out.println(emp[index].getSalary());


        



    }
}
class Employee{
    private String name;
    private int id;
    private int age;

    Employee(){}
    Employee(String name,int id,int age){
        this.name=name;
        this.age=age;
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }


}

class SalariedEmployee extends Employee{
    private double empSalary;
    SalariedEmployee(){

    }
    SalariedEmployee(String name, int id, int age, double empSalary){
        super();
        setAge(age);
        setId(id);
        setName(name);

    }
    void setEmpSalary(Double salary){
        this.empSalary=salary+2000;

    }
    public double getSalary(){
        return empSalary;
    }


}

