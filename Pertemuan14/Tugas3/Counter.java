package Pertemuan14.Tugas3;

// Counter.java
public class Counter {
    private static int instanceCount = 0;

    public Counter() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}

