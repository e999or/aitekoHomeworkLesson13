package e999or.github.testNG;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;


public class SimpleTest {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);


    @Test
    public void simpleTest(){
        LOG.info("Simple test");
    }
}
