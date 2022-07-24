package day51_inheritance.app;

public class AppStore {
    public static void main(String[] args) {

        Instagram obj1 = new Instagram(3.2);
        obj1.download();
        obj1.printPicture();

        Youtube obj2 = new Youtube(1.4);
        obj2.download();
        obj2.watchVideo();



    }
}
