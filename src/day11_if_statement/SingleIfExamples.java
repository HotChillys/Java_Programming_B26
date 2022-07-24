package day11_if_statement;

public class SingleIfExamples {
    public static void main(String[] args) {

        if (false) {
            System.out.println("Hello World"); //if statement is false, so it won't print

        }

        System.out.println("Second Line"); //normal statement, nothing to do with if statement

        if (true) {
            System.out.println("Today is monday"); //if statement is true, so it will print

        }

        int score = 60;
        if (score >= 75) {
            System.out.println("You passed the exam");
        }

        if (score < 75) {
            System.out.println("failing");
        }

        int year = 2022;
        boolean lockdown = year == 2020 || year == 2021;
        if (lockdown) {
            System.out.println("stay at home");
            System.out.println("practice java");
            System.out.println("wear mask");
        }

        if (!lockdown) {
            System.out.println("party");
            System.out.println("practice java");
            System.out.println("maybe travel");
        }


    }
}
