package day63_functional_interface;

import java.util.HashMap;
import java.util.Map;

public class MapSalary {
    /*
    Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

Use the created map to find the following:

    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K
     */
    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();
        map.put("James", 110000.0);
        map.put("Jane", 30000.0);
        map.put("Ana", 140000.0);
        map.put("Jorge", 425523.12);
        map.put("Elza", 154545.0);
        map.put("peter", 236221.0);

        String nameForLargest = "";
        double maxSalary = 0.0;

        String nameForLowest = "";
        double lowestSalary = Double.MAX_VALUE;//the biggest double value is a good starting value

        for (String key : map.keySet()) {// iterate through the keys

            double value = map.get(key);// we use get method to read the values by the key

            if (value > maxSalary) {
                nameForLargest = key;
                maxSalary = value;
            }
            if (value < lowestSalary) {
                nameForLowest = key;
                lowestSalary = value;
            }

        }

        System.out.println("Max salary: " + nameForLargest + " - $" + maxSalary);
        System.out.println("Min salary: " + nameForLowest + " - $" + lowestSalary);

        System.out.println();

        int counter = 0;
        for (double value : map.values()) {
            if (value >= 120000 && value <= 150000) {
                counter++;
            }
        }
        System.out.println("Number between 120000 to 150000 : " + counter);
        System.out.println();

        for (String name : map.keySet()) {
            if (map.get(name) <= 118000) {
                System.out.println(name);
            }
        }
        System.out.println();

        for (String key : map.keySet()) {
            map.put(key, map.get(key) + 10000);
        }

        System.out.println(map);



    }
}
