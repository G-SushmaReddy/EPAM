import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    static int retrycount = 0;
    static int max_retryCount =2;

    public boolean retry(ITestResult result)
    {
        if(retrycount<max_retryCount)
        {
            retrycount++;
            return true;
        }
        else {
            return false;
        }
    }

}
