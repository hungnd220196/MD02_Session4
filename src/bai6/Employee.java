package bai6;

import java.util.Scanner;

//---------------------------------
//        |           Employee            |
//            ---------------------------------
//            | - employeeId: String          |
//            | - employeeName: String        |
//            | - age: int                    |
//            | - gen: String                 |
//            | - rate: double                |
//            | - salary: double              |
//            ---------------------------------
//            | + Employee()                  |
//            | + Employee(employeeId: String,|
//            |    employeeName: String,      |
//            |    age: int, gen: String,     |
//            |    rate: double)              |
//            | + inputData(): void          |
//            | + displayData(): void        |
//            | + calSalary(): void          |
//            ---------------------------------
public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private String gen;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int age, String gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.calSalary();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên:");
        employeeId = scanner.nextLine();
        System.out.println("Nhập tên nhân viên:");
        employeeName = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        age = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.println("Nhập giới tính:");
        gen = scanner.nextLine();
        System.out.println("Nhập hệ số lương:");
        rate = scanner.nextDouble();
        calSalary();
    }

    public void displayData() {
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gen);
        System.out.println("Hệ số lương: " + rate);
        System.out.println("Lương: " + salary);
    }

    public void calSalary() {
        salary = rate * 1300000;
    }

}


