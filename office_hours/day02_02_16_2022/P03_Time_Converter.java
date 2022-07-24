package day02_02_16_2022;

public class P03_Time_Converter {
    public static void main(String[] args) {

        /*
        2.Create class named "TimeConverter" and make a main method

						- Write a Java program to convert time from second to hours/min/day format
						- Input Seconds : 3695


							Expected Output:
							inputSeconds is 3695
							1 hours 1 minutes 35 seconds

         */

        int inputSecond = 3695;
        int hours, minutes, seconds;

        hours = inputSecond / 3600;  //hours = 1;
        minutes = inputSecond % 3600 / 60;
        seconds = inputSecond % 60;

        System.out.println(hours+ " hours " + minutes  + " minutes " + seconds+ " second");









    }
}
