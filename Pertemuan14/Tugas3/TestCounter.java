package Pertemuan14.Tugas3;

// TestCounter.java
public class TestCounter {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        System.out.println("Total instances created: " + Counter.getInstanceCount());
    }
}
