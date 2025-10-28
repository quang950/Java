package DA.Class_chinh;

import java.util.Scanner;

public class PhieuNhapHang {
    // thuộc tính
    private String maPNH;
    private String maNV;
    private String maNCC;
    private int ngayLapPhieu;
    private double tongTien;

    private CTPhieuNhapHang[] chiTiets;
    private int soLuongCT;

    public PhieuNhapHang() {
        this.maPNH = "";
        this.maNV = "";
        this.maNCC = "";
        this.ngayLapPhieu = 0;
        this.tongTien = 0.0;
        this.chiTiets = new CTPhieuNhapHang[100];
        this.soLuongCT = 0;
    }

    public PhieuNhapHang(String maPNH, String maNV, String maNCC, int ngayLapPhieu) {
        this();
        this.maPNH = maPNH;
        this.maNV = maNV;
        this.maNCC = maNCC;
        this.ngayLapPhieu = ngayLapPhieu;
    }

    public PhieuNhapHang(PhieuNhapHang PNH) {
        this.maPNH = PNH.maPNH;
        this.maNV = PNH.maNV;
        this.maNCC = PNH.maNCC;
        this.ngayLapPhieu = PNH.ngayLapPhieu;
        this.tongTien = PNH.tongTien;
        this.chiTiets = new CTPhieuNhapHang[100];
        this.soLuongCT = PNH.soLuongCT;
        for (int i = 0; i < soLuongCT; i++) {
            this.chiTiets[i] = new CTPhieuNhapHang(PNH.chiTiets[i]);
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma Phieu Nhap Hang: ");
        maPNH = sc.nextLine();
        System.out.print("Ma Nhan Vien: ");
        maNV = sc.nextLine();
        System.out.print("Ma Nha Cung Cap: ");
        maNCC = sc.nextLine();
        System.out.print("Ngay Thanh Lap (so): ");
        ngayLapPhieu = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap so luong chi tiet trong phieu: ");
        int k = sc.nextInt();
        sc.nextLine();
        tongTien = 0.0;
        soLuongCT = 0;
        for (int i = 0; i < k; i++) {
            System.out.println("Nhap chi tiet thu " + (i + 1) + ":");
            CTPhieuNhapHang ct = new CTPhieuNhapHang();
            ct.nhap();
            themChiTiet(ct);
        }
    }

    public void xuat() {
        System.out.printf("%-10s %-10s %-10s %-10s%n", "MaPNH", "MaNV", "MaNCC", "Ngay");
        System.out.printf("%-10s %-10s %-10s %-10d%n", maPNH, maNV, maNCC, ngayLapPhieu);
        System.out.println("-------------------- CHI TIET PHIEU NHAP --------------------");
        System.out.printf("%-10s %-15s %-10s %12s %12s%n", "MaPNH", "MaSach", "SoLuong", "DonGia", "ThanhTien");
        for (int i = 0; i < soLuongCT; i++) {
            chiTiets[i].xuat();
        }
        System.out.printf("%nTong tien cua phieu: %10.2f%n", tongTien);
    }

    public void themChiTiet(CTPhieuNhapHang ct) {
        if (soLuongCT < chiTiets.length) {
            chiTiets[soLuongCT++] = ct;
            tongTien += ct.getThanhTien();
        } else {
            System.out.println("Danh sach chi tiet da day, khong the them.");
        }
    }

    public String getMaPNH() {
        return maPNH;
    }

    public void setMaPNH(String maPNH) {
        this.maPNH = maPNH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public int getNgayLapPhieu() {
        return ngayLapPhieu;
    }

    public void setNgayLapPhieu(int ngayLapPhieu) {
        this.ngayLapPhieu = ngayLapPhieu;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public int getSoLuongCT() {
        return soLuongCT;
    }

    public CTPhieuNhapHang[] getChiTiets() {
        return chiTiets;
    }

}
