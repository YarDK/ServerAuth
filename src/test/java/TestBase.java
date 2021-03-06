import ApplicationManager.MainApplication;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase {
    protected static MainApplication app = new MainApplication();



    @BeforeSuite
    public void setUp(){
        app.init(System.getProperty("environment"));
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown(){
        app.stop();
    }
}
