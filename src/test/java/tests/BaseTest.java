package tests;

import groovy.util.logging.Slf4j;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@Slf4j
public class BaseTest {

    @BeforeSuite
    public void before_suite()
    {
        System.out.println("================== Starting Automation ===================");
    }

    @AfterSuite
    public void after_suite()
    {
        System.out.println("Finishing test case Execution!");
        System.out.println("================== Finished Automation ===================");

    }

}
