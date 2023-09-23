package Project2;

public class TestBrowser {
    public static void main(String[] args) {


        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.open();
        chromeDriver.navigate();
        chromeDriver.getTitle();
        chromeDriver.close();
      //  chromeDriver.getScreenshot();

        FirefoxBrowser firefoxBrowser=new FirefoxBrowser();
        firefoxBrowser.open();
        firefoxBrowser.navigate();
        firefoxBrowser.getTitle();
        firefoxBrowser.close();
        //  firefoxBrowser.getScreenshot();


        SafariBrowser safariBrowser=new SafariBrowser();
        safariBrowser.open();
        safariBrowser.navigate();
        safariBrowser.getTitle();
        safariBrowser.close();
        //safariBrowser.getScreenshot();




    }
}
