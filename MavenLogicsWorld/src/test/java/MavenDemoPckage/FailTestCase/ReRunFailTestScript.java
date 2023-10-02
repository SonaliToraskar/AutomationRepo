package MavenDemoPckage.FailTestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailTestScript implements IRetryAnalyzer {

    public static  int maxRetryCount = 3;

    public static int minRetryCount = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (minRetryCount < maxRetryCount) {
            return true;
        }
return false;
        }
    }
