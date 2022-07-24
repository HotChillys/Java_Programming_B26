package day23_05_03_2022.browser;

public class Browser {
    /*
    		openBrowser(): prints "opening chrome browser"
				closeBrowser():  prints "closing chrome browser"
     */


    public void openBrowser(){
        System.out.print("Opening browser");
    }

    public void closeBrowser(){
        System.out.println("Closing Browser");
    }

    public final void navigate(String url) {
        System.out.println("Type " + url);
        System.out.println("Press ENTER ");
    }

    public  final void refresh(){
        System.out.println("Refreshing ... ");
    }

    public final void backward(){
        System.out.println("backward");
    }

    public final void forward(){
        System.out.println("forward");
    }
}
