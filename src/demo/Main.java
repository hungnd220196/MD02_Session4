package demo;

public class Main {
    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien();
        sv1.setStudentName("hung");
        sv1.setMsv("456");
        sv1.setSex(true);
        sv1.setAge(28);
        Sinhvien sv2 = new Sinhvien("123", "Hung", 28, true);
        sv2.displayData();
        sv1.displayData();
    }
}
