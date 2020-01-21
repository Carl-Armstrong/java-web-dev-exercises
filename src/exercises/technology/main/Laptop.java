package exercises.technology.main;

public class Laptop extends Computer {
    private int weight; // in pounds
    private int id;

    public Laptop (int weight, double processorSpeed, double memoryCapacity, double SIZE_OF_OS) {
        super(processorSpeed, memoryCapacity, SIZE_OF_OS);
        this.weight = weight;
        this.id = setAndIncrementId();
    }

    @Override
    public String toString() {
        return "\nSpecs:" +
                "\nType: Laptop" +
                "\nID = " + id +
                "\nWeight = " + weight +
                "lbs\nProcessor Speed = " + getProcessorSpeed() +
                " hz\nTotal Memory = " + getMemoryCapacity() +
                " bytes\nMemory Used = " + getMemoryUsed() +
                " bytes\nSize of Operating System = " + getSIZE_OF_OS() +
                " bytes\nMemory Remaining = " + getMemoryRemaining() +
                " bytes";
    }

    public String playGame() {
        return "\nCongratulations! You have saved the universe!";
    }
}
