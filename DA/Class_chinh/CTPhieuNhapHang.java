package DA.Class_chinh;

import java.util.Scanner;

public class CTPhieuNhapHang {

    private String maPNH;
    private String maSach;
    private int soLuong;
    private double donGia;
    private double thanhTien;

    public CTPhieuNhapHang() {
        this.maPNH = "";
        this.maSach = "";
        this.soLuong = 0;
        this.donGia = 0.0;
        this.thanhTien = 0.0;
    }

    public CTPhieuNhapHang(String maPNH, String maSach, int soLuong, double donGia) {
        this.maPNH = maPNH;
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = soLuong * donGia;
    }

    public CTPhieuNhapHang(CTPhieuNhapHang ctPNH) {
        this.maPNH = ctPNH.maPNH;
        this.maSach = ctPNH.maSach;
        this.soLuong = ctPNH.soLuong;
        this.donGia = ctPNH.donGia;
        this.thanhTien = ctPNH.thanhTien;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma Phieu Nhap Hang: ");
        maPNH = sc.nextLine();
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        sc.nextLine();
        thanhTien = soLuong * donGia;
    }

    public void xuat() {
        System.out.printf("%-10s %-15s %-10d %12.2f %12.2f%n", maPNH, maSach, soLuong, donGia, thanhTien);
    }

    public String getMaPNH() {
        return maPNH;
    }

    public void setMaPNH(String maPNH) {
        this.maPNH = maPNH;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;

        this.thanhTien = this.soLuong * this.donGia;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;

        this.thanhTien = this.soLuong * this.donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

}