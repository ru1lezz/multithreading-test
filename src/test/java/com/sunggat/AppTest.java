package com.sunggat;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static Map<String, Integer> inputOutput = new HashMap<>();

    @BeforeClass
    public static void before() {
        inputOutput.put("nine thousand nine hundred ninety nine", 9999);
        inputOutput.put("nine thousand nine hundred", 9900);
        inputOutput.put("nine hundred ninety nine", 999);
        inputOutput.put("nine hundred ninety", 990);
        inputOutput.put("ninety nine", 99);
        inputOutput.put("ninety", 90);
        inputOutput.put("nine", 9);
    }
    
    @Test
    public void shouldConvert() {
        NumberConverter numberConverter = new NumberConverter();
        for(Map.Entry<String, Integer> entry : inputOutput.entrySet()) {
            Integer actual = numberConverter.convertToNumber(entry.getKey());
            Integer expected = entry.getValue();
            Assert.assertEquals(actual, expected);
        }
    }
}
