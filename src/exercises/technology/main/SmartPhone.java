package exercises.technology.main;

public class SmartPhone extends Computer{
    private boolean isCool;
    private int id;

    public SmartPhone (boolean isCool, double processorSpeed, double memoryCapacity, double SIZE_OF_OS) {
        super(processorSpeed, memoryCapacity, SIZE_OF_OS);
        this.isCool = isCool;
        this.id = setAndIncrementId();
    }

    @Override
    public String toString() {
        return "\nSpecs:" +
                "\nType: Smart Phone" +
                "\nID = " + id +
                "\nCool? = " + isCool +
                "\nProcessor Speed = " + getProcessorSpeed() +
                " hz\nTotal Memory = " + getMemoryCapacity() +
                " bytes\nMemory Used = " + getMemoryUsed() +
                " bytes\nSize of Operating System = " + getSIZE_OF_OS() +
                " bytes\nMemory Remaining = " + getMemoryRemaining() +
                " bytes";
    }

    public String makeCall() {
        return "\nHello. Don't you have some coding to do?";
    }
}
