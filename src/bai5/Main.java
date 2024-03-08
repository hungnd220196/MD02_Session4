package bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] danhSachSInhvien = new Student[100]; // Khởi tạo danh sách SV có độ dài 100
        int soLuongSinhvien = 0;

        while (true) {
            System.out.println("====== MENU ======");
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xoá sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("===== Danh sách sinh viên =====");
                    for (int i = 0; i < soLuongSinhvien; i++) {
                        System.out.println("Sinh viên " + (i + 1) + ":");
                        danhSachSInhvien[i].displayData();
                        System.out.println("---------------------------");
                    }
                    break;
                case 2:
                    System.out.println("===== Thêm mới sinh viên =====");
                    danhSachSInhvien[soLuongSinhvien] = new Student();
                    danhSachSInhvien[soLuongSinhvien].inputData();
                    soLuongSinhvien++;
                    System.out.println("Thêm sinh viên thành công!");
                    break;
                case 3:
                    System.out.println("===== Sửa thông tin SV =====");
                    System.out.print("Nhập mã SV cần sửa: ");
                    String maHSCanSua = scanner.nextLine();
                    boolean timThay = false;
                    for (int i = 0; i < soLuongSinhvien; i++) {
                        if (danhSachSInhvien[i].getMaSv().equals(maHSCanSua)) {
                            System.out.println("Sinh viên cần sửa:");
                            danhSachSInhvien[i].displayData();
                            System.out.println("---------------------------");
                            System.out.println("Nhập thông tin mới:");
                            danhSachSInhvien[i].inputData();
                            System.out.println("Sửa thông tin thành công!");
                            timThay = true;
                            break;
                        }
                    }
                    if (!timThay) {
                        System.out.println("Không tìm thấy SV có mã " + maHSCanSua);
                    }
                    break;
                    
                case 4:
                    System.out.println("===== Xoá Sinh viên =====");
                    System.out.print("Nhập mã Sinh viên cần xoá: ");
                    String maSvXoa = scanner.nextLine();
                    boolean find = false;
                    for (int i = 0; i < soLuongSinhvien; i++) {
                        if (danhSachSInhvien[i].getMaSv().equals(maSvXoa)) {
                            System.out.println("Sinh viên cần xoá:");
                            danhSachSInhvien[i].displayData();
                            System.out.println("---------------------------");
                            System.out.println("Xác nhận xoá Sinh viên? (y/n)");
                            String xacNhan = scanner.nextLine();
                            if (xacNhan.equalsIgnoreCase("y")) {
                                // Xoá Sinh viên khỏi danh sách
                                for (int j = i; j < soLuongSinhvien - 1; j++) {
                                    danhSachSInhvien[j] = danhSachSInhvien[j + 1];
                                }
                                soLuongSinhvien--;
                                System.out.println("Xoá Sinh viên thành công!");
                            } else {
                                System.out.println("Xoá Sinh viên bị hủy bỏ.");
                            }
                            find = true;
                            break;
                        }
                    }
                    if (!find) {
                        System.out.println("Không tìm thấy Sinh viên có mã " + maSvXoa);
                    }
                    break;


                case 5:
                    System.out.println("Kết thúc chương trình.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
        }
    }
}
