package bai2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị cho a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giá trị cho b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập giá trị cho c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();

        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("Nghiệm 1 = " + equation.getRoot1());
            System.out.println("Nghiệm 2 = " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có một nghiệm kép:");
            System.out.println("Nghiệm kép = " + equation.getRoot1());
        } else {
            System.out.println("Phương trình không có nghiệm");
        }
    }
}