package day23_05_03_2022.browser;

public final class FireFox extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening FireFox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing FireFox Browser");
    }
}
