package day26_05_11_2022.driver_task;

public class TestCases {
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com");
        chromeDriver.takeScreenshot("Selfie");
        chromeDriver.close();

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.google.com");
        firefoxDriver.takeScreenshot("Selfie me");
        firefoxDriver.close();

        Safari safari = new Safari();
        safari.get("https://www.google.com");
        safari.takeScreenshot("Selfie you");
        safari.fast();
        safari.talk();
        safari.secure();
        safari.close();

        WebDriver driver = new ChromeDriver();


    }
}
