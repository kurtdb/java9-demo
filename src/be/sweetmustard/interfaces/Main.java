package be.sweetmustard.interfaces;

public interface Main {

    default int test() {
        return tryMyPrivateMethod();
    }

    default int test2() {
        return tryMyPrivateMethod();
    }

    private int tryMyPrivateMethod() {
        return 1;
    }
}
