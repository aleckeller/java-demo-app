import hello.Application;
import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTests {

    @Test
    public void homePageTest() {
        Application appController = new Application();
        String result = appController.home_page();
        assertEquals(result, "Java Application Platform Demo");
    }

    @Test
    public void testPageTest() {
        Application appController = new Application();
        String result = appController.test_page();
        assertEquals(result, "Test page");
    }
}
