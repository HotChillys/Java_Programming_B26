package day47_encapsulation;

public class UseLogin {
    public static void main(String[] args) {

        Login obj = new Login();

//        obj.username = "JamesBond";
//        obj.password = "1234";
//        cannot access private variables directly

        obj.setUsername("JamesBond");
        obj.setPassword("1234");

//        System.out.println(obj.username);
//        System.out.println(obj.password);

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());

        obj.setPassword("james0007Bond");
        System.out.println(obj.getPassword());

    }
}
