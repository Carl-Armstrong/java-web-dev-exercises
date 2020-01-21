package exercises.technology.test;

import exercises.technology.main.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {
    SmartPhone testSmartPhone;

    @Before
    public void createSmartPhoneObject() {
        testSmartPhone = new SmartPhone(true, 3e9, 2.5e11, 5e9);
    }

    @Test
    // test that constructor extends properly
    public void testGetProcessorSpeed() {
        assertEquals(3e9, testSmartPhone.getProcessorSpeed(), .001);
    }

    @Test
    // test that parent methods extend properly
    public void testInteractWithAi() {
        assertEquals("\nHello. I am Skynet", testSmartPhone.interactWithAi());
    }

    @Test
    // test that makeCall() method displays correct message
    public void testMakeCall() {
        assertEquals("\nHello. Don't you have some coding to do?", testSmartPhone.makeCall());
    }
}
