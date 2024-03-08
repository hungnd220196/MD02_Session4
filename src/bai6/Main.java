package bai6;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].inputData();
        }

        System.out.println("Thông tin của các nhân viên:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Nhân viên thứ " + (i + 1) + ":");
            employees[i].displayData();
            System.out.println();
        }
    }
}