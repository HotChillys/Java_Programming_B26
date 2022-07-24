package day26_05_11_2022.driver_task;

public interface WebDriver {
    /*
    Interface WebDriver:
        void get(String URL);
        void close();
        void quit();

     */

    //public static final String VERSION = "initialize them right away";

    void get(String URL);

    void close();

    void quit();



}
