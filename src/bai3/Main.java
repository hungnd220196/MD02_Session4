package bai3;

public class Main {
    public static void main(String[] args) {
        double[] array = new double[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        StopWatch program1 = new StopWatch();
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    double tg = array[i];
                    array[i] = array[j];
                    array[j] = tg;
                }
            }
        }
        program1.setEndTime(System.currentTimeMillis());
        System.out.println(program1.getElapsedTime());
    }
}
