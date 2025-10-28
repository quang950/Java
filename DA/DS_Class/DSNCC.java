package DA.DS_Class;

import java.util.Scanner;
import java.util.Arrays;
import DA.Class_chinh.NhaCungCap;

public class DSNCC {
    NhaCungCap[] dsNCC;
    int n;

    // Hàm thiết lập
    public DSNCC() {
        dsNCC = new NhaCungCap[100];
        n = 0;
    }

    public DSNCC(NhaCungCap[] dsNCC, int n) {
        this.dsNCC = dsNCC;
        this.n = n;
    }

    public DSNCC(DSNCC ds) {
        this.n = ds.n;
        this.dsNCC = new NhaCungCap[100];
        for (int i = 0; i < n; i++) {
            this.dsNCC[i] = new NhaCungCap(ds.dsNCC[i]);
        }
    }

    // Nhập, xuất
    public void nhapDSNCC() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nha cung cap: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nha cung cap thu " + (i + 1) + ":");
            dsNCC[i] = new NhaCungCap();
            dsNCC[i].nhap();
        }
    }

    public void xuatDSNCC() {
        System.out.printf("%-10s %-20s %-30s %-15s%n", "Ma NCC", "Ten NCC", "Dia Chi", "SDT");
        for (int i = 0; i < n; i++) {
            dsNCC[i].xuat();
        }
    }

    //thêm
    public void themNCC() {
    if (n < dsNCC.length) {
        dsNCC[n] = new NhaCungCap();
        dsNCC[n].nhap();
        n++;
    } else {
        System.out.println("Danh sach da day, khong the them.");
    }
}

    //tìm
    public NhaCungCap timNCC(String maNCC) {
        for (int i = 0; i < n; i++) {
            if (dsNCC[i].getMaNCC().equals(maNCC)) {
                return dsNCC[i];
            }
        }
        return null;
    }

    public void timNCC() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nha cung cap can tim: ");
        String maNCC = sc.nextLine();
        NhaCungCap ncc = timNCC(maNCC);
        if (ncc != null) {
            System.out.printf("%-10s %-20s %-30s %-15s%n", "Ma NCC", "Ten NCC", "Dia Chi", "SDT");
            ncc.xuat();
        } else {
            System.out.println("Khong tim thay nha cung cap voi ma: " + maNCC);
        }
    }

    //xóa
    public void xoaNCC(String maNCC) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (dsNCC[i].getMaNCC().equals(maNCC)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < n - 1; i++) {
                dsNCC[i] = dsNCC[i + 1];
            }
            dsNCC[n - 1] = null;
            n--;
            System.out.println("Da xoa nha cung cap voi ma: " + maNCC);
        } else {
            System.out.println("Khong tim thay nha cung cap voi ma: " + maNCC);
        }
    }

    //sửa
    public void suaNCC(String maNCC) {
        NhaCungCap ncc = timNCC(maNCC);
        if (ncc != null) {
            Scanner sc = new Scanner(System.in);
            int choice;
            do {
                System.out.println("Sua thong tin nha cung cap");
                System.out.println("1. Sua ten nha cung cap");
                System.out.println("2. Sua ma nha cung cap");
                System.out.println("3. Sua dia chi");
                System.out.println("4. Sua so dien thoai");
                System.out.println("5. Thoat");
                System.out.print("Nhap lua chon: ");
                choice = sc.nextInt();
                sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.print("Nhap ten nha cung cap moi: ");
                    ncc.setTenNCC(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Nhap ma nha cung cap moi: ");
                    ncc.setMaNCC(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Nhap dia chi moi: ");
                    ncc.setDiaChi(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Nhap so dien thoai moi: ");
                    ncc.setSdt(sc.nextLine());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai.");
                    break;
            }
        }while(choice != 5);
        }else{
            System.out.println("Khong tim thay nha cung cap voi ma " + maNCC);
        }
    }
}