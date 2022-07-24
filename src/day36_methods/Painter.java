package day36_methods;

public class Painter {
    public static void main(String[] args) {

        Picture.draw();
        Picture.draw(100);
        Picture.draw("red");
        Picture.draw("red", "blue");

        String s = "200";
        Picture.draw(s);
    }
}
