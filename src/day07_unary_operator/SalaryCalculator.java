package day07_unary_operator;

public class SalaryCalculator {
    public static void main(String[] args) {

/*
create a class SalaryCalculator
add a main method
declare and assign these variables:

   salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

Sample date:
   100000 (salary)
   0.08 (state tax rate)
   0.21 (federal tax rate)

Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
 */

      double salary = 100_000;

      double stateTaxRate = 0.08; //8%
      double fedTaxRate = 0.21;  // 21%
      double totalTaxRate = stateTaxRate + fedTaxRate;

      double stateTax = salary * stateTaxRate;
      double federalTax = salary * fedTaxRate;
      double totalTax = stateTax + federalTax;

      double salaryAfterTax = salary - totalTax;


        System.out.println("tax rate: " + totalTaxRate+ "%");
        System.out.println("total salary: $" + salary);
        System.out.println("state tax: $" + stateTax);
        System.out.println("federal tax: $" + federalTax);
        System.out.println("total tax: $" + totalTax);
        System.out.println("salary after tax: $" + (salary - totalTax));




        System.out.println(salaryAfterTax);




    }

    public static class Pizza {
        public static void main(String[] args) {

            /*
            create a class Pizza
    add a main method
    declare and assign these variables:

       type of pizza,  the number of slices,  the number of people eating

    calculate how many slices each person will get
    calculate how many slices are left over

    Sample print statement:

       We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
             */

            String type = "cheese pizza";
            byte numSlice = 8;
            byte numPeople = 4;

           // System.out.println("We ordered "+type+" with "+numSlice+" slices,"+numPeople+" people ate "+(numSlice/numPeople)+" slices each with " +(numSlice-(numPeople*(numSlice/numPeople)))+ " left over.");

    double sliceEachPersonGets = numSlice / numPeople;
    double slicesLeft = numSlice- sliceEachPersonGets * numPeople;

            System.out.println("We ordered " +type+" with "+numSlice+" slices, " +numPeople+ " people ate "+sliceEachPersonGets+ " slices each with "+slicesLeft+ " left over." );




        }
    }
}
