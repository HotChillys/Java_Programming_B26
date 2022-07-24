package day23_05_03_2022.browser;

public class Main {
    public static void main(String[] args) {

        System.out.println("====Chrome===");

        Chrome chrome = new Chrome();
        chrome.openBrowser();
        chrome.closeBrowser();
        chrome.navigate("www.google.com");
        chrome.refresh();
        chrome.closeBrowser();

        System.out.println("====Firefox===");

        FireFox firefox = new FireFox();
        firefox .openBrowser();
        firefox .closeBrowser();
        firefox .navigate("www.google.com");
        firefox .refresh();
        firefox .closeBrowser();


    }
}
