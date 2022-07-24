package day29_array;

public class initials {
    public static void main(String[] args) {
        /*
        • Given an array of classmate’s names, first name and last separated by a
        space, print the initials of everyone
        Ex:
        Input:
        [ “James Bond”, “Eve Rell”, “Anna Johnson” ]
        Output:
        JB
        ER
        AJ
         */
                String [] names = {"James Bond", "Eve Rell", "Anna Johnson" };

        String a = names[0].substring(0,1);
        String a1 = names[0].substring(names[0].indexOf(" ") + 1, names[0].indexOf(" ") + 2);

        String b = names[1].substring(0,1);
        String b1 = names[1].substring(names[1].indexOf(" ") + 1, names[1].indexOf(" ") + 2);

        String c = names[2].substring(0,1);
        String c1 = names[2].substring(names[2].indexOf(" ") + 1, names[2].indexOf(" ") + 2);

        System.out.println(a + a1);
        System.out.println(b + b1);
        System.out.println(c + c1);

        System.out.println();

        //with for loop
        for (int i = 0; i < names.length; i++) {
            String fullName = names[i];
            String lastName = fullName.substring(fullName.indexOf(" ")).trim(); // or indexOf(" ") +1
            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));
        }
        System.out.println();

        //with for each loop

        for (String str : names) {

            String fullName = str.trim();
            String lastName = fullName.substring(fullName.indexOf(" ")).trim(); // or indexOf(" ") +1
            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));

            //print in one line
           // System.out.println(str.trim().substring(0,1) + fullName.substring(fullName.indexOf(" ")).trim().charAt(0));

        }








    }
}
