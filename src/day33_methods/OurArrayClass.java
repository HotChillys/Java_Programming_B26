package day33_methods;

public class OurArrayClass {
    /*
    all will accept array argument

    creat a method that will print the first element
    creat a method that will print the last element
    creat a method that will print the middle element
         LENGTH MATTER --> even there are 2 middle, for odd there is 1 middle
     */

    public static void firstElement(int [] nums) {
        System.out.println("First element: " + nums[0]);
    }

    public static void lastElement(int [] nums) {
        System.out.println("Last element: " + nums[nums.length - 1]);
    }

    public static void middleElement(int [] nums) {
        if (nums.length % 2 == 0) {
            System.out.println("First Middle: " + nums[nums.length / 2 - 1]);
            System.out.println("Second Middle: " + nums[nums.length / 2]);
        } else {
            System.out.println("Middle element: " + nums[nums.length / 2]);
        }
    }

    public static void printArray(int [] nums) {
        String result = "START | ";

        for (int num : nums) {
            result += num + " ~ ";
        }
        result += " | END";
        System.out.println(result);
    }

    public static void main(String[] args) {
        int [] numbers = {50, 0, 10, 500, 20, 40, 124};
        firstElement(numbers);
        lastElement(numbers);
        middleElement(numbers);

       middleElement(new int[]{50, 10, 500, 20, 40, 124}); // or this way

        printArray(numbers);
    }
}
