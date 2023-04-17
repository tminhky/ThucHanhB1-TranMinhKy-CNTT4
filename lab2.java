package Lab2B1;


import java.util.Scanner;

public class ThongTinDangKyXe {
    private int dungTich;
    private double triGia;
    private String chuXe,moTa,loaiXe;
 
    public ThongTinDangKyXe(String loaiXe, int dungTich, double triGia, String chuXe, String moTa) {
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.chuXe = chuXe;
        this.moTa = moTa;
    }
    public ThongTinDangKyXe(){
 
    }
    public String getLoaiXe() {
        return loaiXe;
    }
 
    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }
 
    public int getDungTich() {
        return dungTich;
    }
 
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
 
    public double getTriGia() {
        return triGia;
    }
 
    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
 
    public String getChuXe() {
        return chuXe;
    }
 
    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }
 
    public String getMoTa() {
        return moTa;
    }
 
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

public double tinhThue(){
    double thue;
    if(dungTich<100) thue=triGia*0.01;
    else if (dungTich >= 100 && dungTich<=200) thue = triGia * 0.03;
    else thue = triGia * 0.05;
    return thue;
}


@Override
    public String toString() {
        return loaiXe + "-"+chuXe + "-"+dungTich + "-"+triGia + "-"+moTa;
}
void inThue(){
    System.out.printf("%5s %-20s %5d %10.2f %10s %8.5f \n ",loaiXe,chuXe,dungTich,triGia,moTa,tinhThue());
}
class Main{
    static Scanner sca = new Scanner(System.in);
    static void nhapThongTinh(ThongTinDangKyXe tt) {
        System.out.print("Nhap loai xe: ");
        tt.setLoaiXe(sca.next());sca.nextLine();
        System.out.print("Nhap ten chu xe: ");
        tt.setChuXe(sca.nextLine());
        System.out.print("Nhap dung tich xe: ");
        tt.setDungTich(sca.nextInt());
        System.out.print("Nhap tri gia xe: ");
        tt.setTriGia(sca.nextDouble());;sca.nextLine();
        System.out.print("Mo ta: ");
        tt.setMoTa(sca.nextLine());
        
}
public static void main(String[] args) {
    ThongTinDangKyXe xe[]= null;
    int a,n=0;
    boolean flag = true;
    
    do{
        System.out.println("Chon chuc nang");
        System.out.println("1.Tao cac doi tuong xe va nhap thong tin ");
        System.out.println("2.Xuat bang ke khai tien thue cua cac xe."); 
        System.out.println("Chon so khac de thoat ");
        a =sca.nextInt();
        switch (a){
            case 1:
                System.out.print("Nhap so luong xe ban muon khai bao : ");
                n=sca.nextInt();
                
                xe= new ThongTinDangKyXe[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Xe thu " + (i+1));
                    xe[i] = new ThongTinDangKyXe();
                    nhapThongTinh(xe[i]);
                }
                break;
            case 2:
            System.out.printf("%5s %5s %5s %10s %10s %8s \n","Loai xe","Chu xe","Dung tich","Tri gia","mo ta","Thue");
            for (int i = 0; i < n; i++) {
                xe[i].inThue();
            }
                break;
            default:
                System.out.println("bye");
                flag=false;
                break;
        }
    }while (flag);
}
}
}


