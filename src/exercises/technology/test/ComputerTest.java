package exercises.technology.test;

import exercises.technology.main.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {
    Computer testComputer;

    @Before
    // create a default computer object that will be used by all tests
    public void createComputerObject() {
        testComputer = new Computer(3.5e10, 1e12, 1.2e10);
    }

    @Test
    // test that the useMemory() function actually adds to the memoryUsed field
    public void testUseMemory(){
        testComputer.useMemory(1e10);                                   // adds 1e10 to current value of memoryUsed
        assertEquals(2.2e10, testComputer.getMemoryUsed(), .001);       // memoryUsed = 1.2e10 (size of OS) + 1e10 (added above) = 2.2e10
    }

    @Test
    // test that getMemoryRemaining returns correct value
    public void testGetMemoryRemaining() {
        testComputer.useMemory(8.8e10);                                 // use 8.8e10 bytes of memory
        assertEquals(9e11, testComputer.getMemoryRemaining(), .001);    // memoryRemaining = 1e12 (total memory) - 1.2e10 (size of OS) - 8.8e10 (subtracted above) = 9e11
    }

    @Test
    // test that factoryReset() removes extra apps and file, leaving only the OS
    public void testFactoryReset() {
        testComputer.useMemory(1e11);                                   // use a large chunk of memory
        testComputer.factoryReset();                                                    // perform factory reset
        assertEquals(1.2e10, testComputer.getMemoryUsed(), .001);        // memoryUsed should be 1.2e10 bytes (size of the OS)
    }
}
