package bai1;

public class Main1 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.inputData();
        circle1.displayData();
        System.out.println();

        Circle circle2 = new Circle(4.3, "đen");
        circle2.displayData();
    }
}
