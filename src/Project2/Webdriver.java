package Project2;

public interface Webdriver {

    void open();
    void close();
    String getTitle();

}
interface  RemoteWebDriver extends Webdriver{
    void navigate();

}
interface TakeScreenshot extends RemoteWebDriver {
    void getScreenshot();
}


