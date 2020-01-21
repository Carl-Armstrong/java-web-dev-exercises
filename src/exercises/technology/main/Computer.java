package exercises.technology.main;

public class Computer extends AbstractEntity{
    private double processorSpeed; // in Hz
    private double memoryCapacity; // in bytes
    private double memoryUsed; // in bytes
    private final double SIZE_OF_OS; // account for the size of the OS in memoryUsed

    private int id;

    public Computer (double processorSpeed, double memoryCapacity, double SIZE_OF_OS) {
        this.processorSpeed = processorSpeed;
        this.memoryCapacity = memoryCapacity;
        this.SIZE_OF_OS = SIZE_OF_OS;
        this.memoryUsed = SIZE_OF_OS;
        this.id = setAndIncrementId();
    }

    // getters
    public double getProcessorSpeed () {
        return processorSpeed;
    }

    public double getMemoryCapacity () {
        return memoryCapacity;
    }

    public double getMemoryUsed () {
        return memoryUsed;
    }

    public double getMemoryRemaining () {
        return memoryCapacity - memoryUsed;
    }

    public double getSIZE_OF_OS () {
        return SIZE_OF_OS;
    }

    public int getId() {return id;}

    // setters
    public void setProcessorSpeed (double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public void setMemoryCapacity (double memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }


    // as programs and files are installed, show that they use memory
    public void useMemory (double memoryAllocated) {
        memoryUsed += memoryAllocated;
    }

    // wipe computer and reset to initial settings
    public void factoryReset () {
        memoryUsed = SIZE_OF_OS;
    }

    public String interactWithAi() {
        return "\nHello. I am Skynet";
    }

    @Override
    public String toString() {
        return "\nSpecs:" +
                "\nID = " + id +
                "\nProcessor Speed = " + processorSpeed +
                " hz\nTotal Memory = " + memoryCapacity +
                " bytes\nMemory Used = " + memoryUsed +
                " bytes\nSize of Operating System = " + SIZE_OF_OS +
                " bytes\nMemory Remaining = " + getMemoryRemaining() +
                " bytes";
    }
}
