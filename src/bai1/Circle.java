package bai1;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }


    //constructor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập bán kính");
        radius = Double.parseDouble(scanner.nextLine());
        System.out.println("mời bạn nhập màu sắc");
        color = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Bán kính của hình tròn là " + radius);
        System.out.println("Màu sắc của hình tròn là " + color);
        System.out.printf("Chu vi của hình tròn là %.2f", perimeter());
        System.out.println();
        System.out.printf("Diện tích của hình tròn là %.2f ", area());
    }

}


