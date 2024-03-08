package demo;

public class Sinhvien {
    private String msv;
    private String studentName;
    private int age;
    private boolean sex;

    public Sinhvien() {
    }

    public Sinhvien(String msv, String studentName, int age, boolean sex) {
        this.msv = msv;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void displayData() {
        System.out.println();
        System.out.println("Họ tên: " + studentName);
        System.out.println("MSV: " + msv);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + (sex ? "Nam" : "Nữ"));
    }
}



