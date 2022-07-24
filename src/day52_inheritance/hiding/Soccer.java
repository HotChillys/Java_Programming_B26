package day52_inheritance.hiding;

public class Soccer extends Sports{

      public static void cheer(){
          System.out.println("Cheering from the Child class");
      }

      //Note:
    /*
    it looks like overriding, but we are not, because the method is static

   we are hiding the cheer method from the parent class
     */

}
