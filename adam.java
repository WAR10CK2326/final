import java.util.Scanner;
import java.util.Arrays;
class adam {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("please enter your annual salary : ");
    int annual_salary = input.nextInt();
    double monthly_rate = annual_salary / 12;
    double daily_rate = monthly_rate / 22;
    double hourly_rate = daily_rate / 8;

    System.out.printf("\nyour Monthly Rate is : %.2f", monthly_rate);
    System.out.printf("\nyour Daily Rate is : %.2f", daily_rate);
    System.out.printf("\nyour Hourly Rate is : %.2f", hourly_rate);

    double tax, tax_deduction, annual_tax_deduction = 0;

    if ((annual_salary >= 250000) && (annual_salary <= 400000)) {
      tax = annual_salary-250000;
      tax_deduction = tax * .20;
      annual_tax_deduction = tax_deduction;
      System.out.printf("\nyour Annual tax is : %.2f", annual_tax_deduction);
    }
    else if ((annual_salary >= 400000) && (annual_salary <= 800000))  {
      tax = annual_salary-400000;
      tax_deduction = tax * .25 + 30000;
      annual_tax_deduction = tax_deduction;
      System.out.printf("\nyour Annual tax is : %.2f", annual_tax_deduction);
    }
    else if ((annual_salary >= 800000) && (annual_salary <= 2000000)) {
      tax = annual_salary-800000;
      tax_deduction = tax * .30 + 130000;
      annual_tax_deduction = tax_deduction;
      System.out.printf("\nyour Annual tax is : %.2f", annual_tax_deduction);
    }
    else if ((annual_salary >= 2000000) && (annual_salary <= 8000000))  {
      tax = annual_salary-2000000;
      tax_deduction = tax * .32 + 490000;
      annual_tax_deduction = tax_deduction;
      System.out.printf("\nyour Annual tax is : %.2f", annual_tax_deduction);
    }
    else if (annual_salary >= 8000000)  {
      tax = annual_salary-8000000;
      tax_deduction = tax * .35 + 2410000;
      annual_tax_deduction = tax_deduction;
      System.out.printf("\nyour Annual tax is : %.2f", annual_tax_deduction);
    }

    double monthly_tax_deduction = annual_tax_deduction / 12;
    double net_pay = monthly_rate - monthly_tax_deduction;

    System.out.printf("\nyour Monthly Tax Deduction is : %.2f", monthly_tax_deduction);
    System.out.printf("\nyour Net Pay is : %.2f ", net_pay);






  }
}