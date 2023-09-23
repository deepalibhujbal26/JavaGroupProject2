package Project2;

public class SafariBrowser implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Safari");

    }

    @Override
    public void close() {
        System.out.println("Close the browser");

    }

    @Override
    public String getTitle() {

        return null;
    }


    @Override
    public void navigate() {

    }

}
