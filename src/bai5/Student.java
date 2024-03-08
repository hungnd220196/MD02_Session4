package bai5;

import java.util.Scanner;

public class Student {
    //    ---------------------------------
//            |           Student            |
//            --------------------------------
//            | - maSv: String               |
//            | - tenSv: String              |
//            | - tuoi: int                  |
//            | - gioiTinh: String           |
//            | - diaChi: String             |
//            | - soDienThoai: String        |
//            ---------------------------------
//            | + Student()                  |
//            | + Student(maSv: String,      |
//            |    tenSv: String, tuoi: int, |
//            |    gioiTinh: String,         |
//            |    diaChi: String,           |
//            |    soDienThoai: String)      |
//            | + inputData(): void          |
//            | + displayData(): void        |
//            ---------------------------------
    private String maSv;
    private String tenSv;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    private String soDienThoai;

    public Student() {
    }

    public Student(String maSv, String tenSv, int tuoi, String gioiTinh, String diaChi, String soDienThoai) {
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã Sv:");
        maSv = scanner.nextLine();
        System.out.println("Nhập tên Sv:");
        tenSv = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        tuoi = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.println("Nhập giới tính:");
        gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        diaChi = scanner.nextLine();
        System.out.println("Nhập số điện thoại:");
        soDienThoai = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Mã Sv: " + maSv);
        System.out.println("Tên Sv: " + tenSv);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số điện thoại: " + soDienThoai);
    }
}



