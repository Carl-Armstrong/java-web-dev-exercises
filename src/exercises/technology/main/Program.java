package exercises.technology.main;

public class Program {
    public static void main (String[] args) {
        // create computer and use some memory
        Computer generic = new Computer(3.5e10,1e12, 1.2e10);
        generic.useMemory(3.1e8);

        // see specs and features
        System.out.println("\nComputer created. Let's see specs");
        System.out.println(generic.toString());
        System.out.println(generic.interactWithAi());

        System.out.println("\nYikes! Let's do a factory reset to delete Skynet" +
                " and check specs again.");

        // delete Skynet
        generic.factoryReset();

        // check that Skynet is gone
        System.out.println(generic.toString());
        System.out.println(generic.interactWithAi());

        System.out.println("\nThat didn't work... Let's move on to the laptop.");

        // create laptop
        Laptop lappy = new Laptop(5, 4e9, 5e11, 1.2e10);

        // see specs and features
        System.out.println(lappy.toString());
        System.out.println("\nLooks good. Let's see how it does with games.");
        System.out.println((lappy.playGame()));

        // create smart phone
        SmartPhone myPhone = new SmartPhone(false, 3e9, 2.5e11,5e9);

        // see specs and features
        System.out.println("\nNow let's check out the smart phone.");
        System.out.println(myPhone.toString());
        System.out.println("\nGreat! Now try making a call.");
        System.out.println(myPhone.makeCall());
    }
}
