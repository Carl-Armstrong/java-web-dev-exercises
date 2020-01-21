package exercises.technology.test;

import exercises.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {
    Laptop testLaptop;

    @Before
    public void createLaptopObject() {
        testLaptop = new Laptop(5, 4e9, 5e11, 1.2e10);
    }

    @Test
    // test that Laptop properly extends parent constructor
    public void testGetMemoryUsed() {
        assertEquals(1.2e10, testLaptop.getMemoryUsed(), .001);                     // memoryUsed should equal SIZE_OF_OS at this point
    }

    @Test
    // test that Laptop extends parent methods
    public void testUseMemory() {
        testLaptop.useMemory(8e9);                                                  // use 8e9 bytes of memory
        assertEquals(2e10, testLaptop.getMemoryUsed(), .001);                       // memoryUsed = 1.2e10 (size of OS) + 8e9 (added above) = 2e10
    }

    @Test
    // test that Laptop's playGame method works properly
    public void testPlayGame() {
        assertEquals("\nCongratulations! You have saved the universe!", testLaptop.playGame());     // should print the message defined in the method
    }
}
