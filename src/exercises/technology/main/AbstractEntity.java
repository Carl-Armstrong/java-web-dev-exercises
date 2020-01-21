package exercises.technology.main;

public class AbstractEntity {
    private static int nextId = 0;

    public AbstractEntity() {
        nextId ++;
    }

    public int setAndIncrementId () {
       return nextId;
    }
}
