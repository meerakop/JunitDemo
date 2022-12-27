package Runnner;

import org.junit.Assert;
import org.junit.Test;

public class TestJuintRuner {

	@Test
    public void testLucky() {
		System.out.println("------------------------------------->"+System.getProperty("featureFileName"));
        Assert.assertEquals("7", "7");
    }
}
