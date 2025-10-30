package Java.DoAn.Class_chinh;

import java.util.Scanner;

public class CTPhieuNhapHang {
    //thuộc tính    
    String maPNH, maSach; 
    int soLuong;
    double donGia ,thanhTien;
    
    //hàm thiết lập
    public CTPhieuNhapHang(){
        maPNH = "";
        maSach ="";
        soLuong = 0;
        donGia=0.0;
        thanhTien=0.0;
    }

    public CTPhieuNhapHang(String maPNH, String maSach, int soLuong,double donGia ,double thanhTien){
        this.maPNH = maPNH;
        this.maSach = maSach;
        this.soLuong=soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public CTPhieuNhapHang(CTPhieuNhapHang ctPNH){
        this.maPNH =ctPNH.maPNH;
        this.maSach=ctPNH.maSach;
        this.soLuong =ctPNH.soLuong;
        this.donGia=ctPNH.donGia;
        this.thanhTien=ctPNH.thanhTien;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma Phieu Nhap Hang: ");
        maPNH = sc.nextLine();
        System.out.print("Nhap sach: ");
        maSach= sc.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Thanh tien: ");
        thanhTien = soLuong * donGia;
    }

    public void xuat(){
          System.out.printf("%-10s %-15s %-10d %12.2f %12.2f%n", 
            maPNH, maSach, soLuong, donGia, thanhTien);
    }

    public void tinhThanhTien() {
        this.thanhTien = this.soLuong * this.donGia;
    }

    public boolean isValid() {
        return !maPNH.isEmpty() && !maSach.isEmpty() && soLuong > 0 && donGia > 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CTPhieuNhapHang other = (CTPhieuNhapHang) obj;
        return maPNH.equals(other.maPNH) && maSach.equals(other.maSach);
    }

    @Override
    public String toString() {
        return String.format("CTPhieuNhapHang[maPNH=%s, maSach=%s, soLuong=%d, donGia=%.2f, thanhTien=%.2f]",
            maPNH, maSach, soLuong, donGia, thanhTien);
    }

    public String getmaPNH() {
        return maPNH;
    }
    public void setmaPNH(String maPNH) {
        this.maPNH = maPNH;
    }
    public String getmaSach() {
        return maSach;
    }
    public void setmaSach(String maSach) {
        this.maSach = maSach;
    }
    public int getsoLuong() {
        return soLuong;
    }
    public void setsoLuong(int soLuong) {
        this.soLuong = soLuong;
        this.thanhTien = this.soLuong * this.donGia;

    }
    public Double donGia() {
        return donGia;
    }
    public void donGia(double donGia) {
        this.donGia = donGia;
        this.thanhTien = this.donGia * this.soLuong;
    }
    public double thanhTien() {
        return thanhTien;
    }
    public void setthanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

}