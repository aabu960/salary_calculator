import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// first i declared my variables here
      int hourly_rate;
      int worked_hour;
        int Welfare;
        double VAT;
        double bonus;
        double Gross_salary;
double Deductions;
    double    Final_Salary;

hourly_rate = 200;

Welfare= 50;
VAT = 17.5;

//Calculating Gross Salary

            Scanner info = new Scanner(System.in);
            //Enter hours worked by lecturer
        System.out.println("*******************************************");
     System.out.print("Enter worked hour : ");
      worked_hour= info.nextInt() ;
      if (worked_hour >20){
   bonus = 30;


Gross_salary = (hourly_rate * worked_hour) + bonus;
          System.out.println("*******************************************");


          System.out.println("Gross Salary is : " + Gross_salary);
          System.out.println("*******************************************");


      }else {
          Gross_salary = (hourly_rate * worked_hour) ;
          System.out.println("*******************************************");


          System.out.println("Gross Salary is : " + Gross_salary);

      }
      //Calculating deductions
        System.out.println("*******************************************");

        Deductions = VAT + Welfare;
        System.out.println("Deductions is : " + Deductions);

        //Calculating final salary
        System.out.println("*******************************************");

        Final_Salary = Gross_salary - Deductions;
        System.out.println("Final Salary : " + Final_Salary);

        System.out.println("*******************************************");

    }


    }

