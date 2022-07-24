package day23_05_03_2022.browser;

public final class Chrome extends Browser{


    public void openBrowser(){
        System.out.println("Opening Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome Browser");
    }
}
