package day12_03_22_2022;

public class ArmstrongNumber {
    /*
    Write a method that can check if a number is Armstrong number

				Note: if I have a 3-digit number, then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.

                print all the armstrong numbers with three digit
				Armstrong numbers are     === 153 370 371 407 === for 3 digits

				 153   ==  (1*1*1)+(5*5*5)+(3*3*3)
                             1       125      27  == 153
     */
    public static void armstrong(int nums) {


        int a = 1;
        int b = 0;
        int c = 0;
        int sum = 0;

        for (int i = 1; i < 10; i++) {
            a = i * 100;
            for (int j = 0; j < 10; j++) {
                b = j * 10;
                for (int k = 0; k < 10; k++) {
                    c = k;
                    sum = a + b + c;
                    int totalA = (a/100) * (a/100) * (a/100);
                    int totalB = (b/10) * (b/10) * (b/10);
                    int totalC = c * c * c;
                    if (totalA + totalB + totalC == sum) {
                        System.out.println(sum);
                    }
                }
            }


        }

    }



}
