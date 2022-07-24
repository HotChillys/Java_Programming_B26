package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] names = {"Mike", "Joe", "Ana", "Ali", "Joanna"};
        int [] score = {80, 54, 100, 66, 94};
        char [] grades = new char[5];

        for (int i = 0; i < grades.length; i++) {

            if (score[i] >= 85 && score[i] < 100) {
                grades[i] = 'A';
            } else if (score[i] >= 75 && score[i] < 85) {
                grades[i] = 'B';
            } else if (score[i] >= 65 && score[i] < 75) {
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }
        }


        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " | " + score[i] + " | " + grades[i]);
        }









    }
}
// TODO: 2022-03-14 Challenge: Accept all the
//information with Scanner 