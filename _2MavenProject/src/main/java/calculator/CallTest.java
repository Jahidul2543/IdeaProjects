package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CallTest {
 @Test
    public void test(){

     Addition addition = new Addition();
     int result = addition.add(4,5);
     Assert.assertEquals(result, 9);
 }


}
