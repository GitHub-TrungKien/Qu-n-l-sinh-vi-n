/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlysinhvien;

import java.util.Scanner;

/**
 *
 * @author macbookpro
 */
public class QuanLySinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        
        do{
            System.out.println("----MENU----");
            System.out.println("Vui long chon chuc nang");
            System.out.println("1. Them sinh vien vao danh sach");
            System.out.println("2. In ra danh sach sinh vien");
            System.out.println("3. Kiem tra danh sach co rong khong");
            System.out.println("4. Lay ra so luong sinh vien trong danh sach");
            System.out.println("5. Lam rong danh sach sinh vien");
            System.out.println("6. Kiem tra sinh vien co ton tai trong danh sach khong");
            System.out.println("7. Xoa mot sinh vien ra khoi danh sach");
            System.out.println("8. Tim kiem tat ca sinh vien dua tren Ten duoc nhap tu ban phim");
            System.out.println("0. Thoat");
            
            luaChon = Integer.parseInt(sc.nextLine());
            
            if(luaChon == 1){
                //1.Them sinh vien vao danh sach

                System.out.println("Nhap ma sinh vien");
                String maSinhVien = sc.nextLine();
                System.out.println("Nhap ho va ten");
                String hoVaTen = sc.nextLine();
                System.out.println("Nhap nam sinh");
                int namSinh = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap diem trung binh");
                float diemTrungBinh = Float.parseFloat(sc.nextLine());

                SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);
            }else if(luaChon == 2){
                //In ra danh sach sinh vien
                dssv.inDSSinhVien();

            }else if(luaChon == 3){
                //Kiem tra danh sach co rong khong
                    System.out.println("Danh sach rong:" + dssv.kiemTraDanhSachRong());
            }else if(luaChon == 4){
                // Lay ra so luong sinh vien trong danh sach
                    System.out.println("So luong sinh vien hien tai:" + dssv.laySoLuongSinhVien());
            }else if(luaChon == 5){
                // Lam rong danh sach sinh vien
                    dssv.lamRongDanhSach();
            }else if(luaChon == 6){
                //Kiem tra sinh vien co ton tai trong danh sach khong, dua tren ma sinh vien
                    System.out.println("Nhap ma sinh vien");
                    String maSinhVien = sc.nextLine();
                    SinhVien sv = new SinhVien(maSinhVien);
                    System.out.println("Kiem tra sinh vien co trong danh sach " + dssv.kiemTraTonTai(sv));
            }else if(luaChon == 7){
                //Xoa mot sinh vien ra khoi danh sach, dua tren ma sinh vien
                    System.out.println("Nhap ma sinh vien");
                    String maSinhVien = sc.nextLine();
                    SinhVien sv = new SinhVien(maSinhVien);
                    System.out.println("Xoa sinh vien ra khoi danh sach " + dssv.xoaSinhVien(sv));
            }else if(luaChon == 8){
                // Tim kiem tat ca sinh vien dua tren Ten duoc nhap tu ban phim
                    System.out.println("Nhập họ và tên: "); 
                    String hoVaTen = sc.nextLine();
                  //  System.out.println("Kết quả tìm kiếm: " + dssv.timSinhVien(hoVaTen));
                    dssv.timSinhVien(hoVaTen);
            }
            
        }while(luaChon!=0);
    }
}
    
