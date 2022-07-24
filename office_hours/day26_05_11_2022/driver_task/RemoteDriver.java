package day26_05_11_2022.driver_task;

public abstract class RemoteDriver implements WebDriver, TakeScreenshot, JavaScriptExecuter{

    /*

	Abstract RemoteDriver: implements all Interface (WebDriver - TakeScreenshot - JavaScriptExecuter)
		   there is no method / variable etc for practice purpose
     */

    @Override
    public void executeScript(String script) {

    }

    @Override
    public void takeScreenshot(String name) {

    }

    @Override
    public void get(String URL) {

    }

    @Override
    public void close() {

    }

    @Override
    public void quit() {

    }
}
