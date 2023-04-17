package THHDT.B1;
import java.util.Scanner;

public class SinhVienNhap {
    private static int maSV;
    private static String hoTen;
    private static String diaChi;
    private static String sTD;
public SinhVienNhap(int maSV, String hoTen, String diaChi,String sTD){
super();
this.maSV = maSV;
this.hoTen = hoTen;
this.diaChi = diaChi;
this.sTD = sTD;

}
public int getMaSV() {
    return maSV;
}
public void setMaSV(int maSV) {
    this.maSV = maSV;
}
public String getHoTen() {
    return hoTen;
}
public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
}
public String getDiaChi() {
    return diaChi;
}
public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
}
public String getsTD() {
    return sTD;
}
public void setsTD(String sTD) {
    this.sTD = sTD;
}
@Override
public String toString() {
    return "Ma sinh vien: " + this.maSV + ", Ho ten: " + this.hoTen + ", Dia chi: " + 
            this.diaChi + ", So dien thoai: " + this.sTD;
}
public void hienThiTT() {
    System.out.printf("%-5d %-20s %-20s %-15s \n", maSV, hoTen, diaChi, sTD);
}

class Main {
    static Scanner sca = new Scanner(System.in);
    static void nhapThongTinh(SinhVienNhap tt) {
        System.out.println("Nhap ma so sinh vien: ");
        tt.setMaSV(sca.nextInt());
        sca.nextLine();
        System.out.println("Nhap ho va ten : ");
        tt.setHoTen(sca.nextLine());
        System.out.println("Nhap dia chi sinh vien: ");
        tt.setDiaChi(sca.nextLine());
        System.out.println("Nhap so dien thoai : ");
        tt.setsTD(sca.nextLine());
}
 
    public static void main(String[] args) {
        SinhVienNhap sv[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("Chon chuc nang");
            System.out.println("1.Nhap thong tin sinh vien.");
            System.out.println("2.Xuat thong tin sinh vien.");  
            System.out.println("Nhap so khac de thoat");      
            a = sca.nextInt();
            switch (a) {
                case 1:
                
                    System.out.println("Nhap so lương sinh vien: ");
                    n = sca.nextInt();
                    sv = new SinhVienNhap[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh vien thu " + (i + 1)+": ");
                        sv[i] = new SinhVienNhap(i, hoTen, diaChi, sTD);
                        nhapThongTinh(sv[i]);
 
                    }
 
                    break;
                case 2:
                    SinhVienNhap temp = sv[0];
                    for (int i = 0; i < sv.length ; i++) {
                        for (int j = i + 1; j < sv.length; j++) {
                            if (sv[i].getMaSV() > sv[j].getMaSV()) {
                                temp = sv[j];
                                sv[j] = sv[i];
                                sv[i] = temp;
                            }
                        }
                    }
                    System.out.printf("%-5s %15s %15s %20s \n", "Ma so sinh vien", "Ho ten", "Dia chi", "So dien thoai");
                    for (int i = 0; i < n; i++) {
                        sv[i].hienThiTT();
                    }
                    break;
                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
}




