import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void testSuccess() {
        System.out.println("This test will pass.");
        Assert.assertTrue(true);
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testFailure1() {
        System.out.println("This test will fail.");
        Assert.fail("Intentional failure in testFailure1");
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testFailure2() {
        System.out.println("This test will fail.");
        Assert.assertEquals(2 + 2, 5, "Math is incorrect!");
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testSuccess2() {
        System.out.println("This test will pass.");
        Assert.assertEquals("Hello", "Hello");
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testFailure3() {
        System.out.println("This test will fail.");
        Assert.assertNotNull(null, "Expected non-null value but got null");
    }

}
