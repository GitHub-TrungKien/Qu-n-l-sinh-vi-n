/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysinhvien;

import java.util.ArrayList;

/**
 *
 * @author macbookpro
 */
public class DanhSachSinhVien {
    public ArrayList<SinhVien> danhSach;
    
    //ham khoi tao khong tham so truyen vao
    public DanhSachSinhVien(){
        this.danhSach = new ArrayList<SinhVien>();      
    }
    
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
    
    public boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();
    }
    
    public void inDSSinhVien(){
        for(SinhVien sinhVien: danhSach){   
            System.out.println(sinhVien);
        }
    }
    
    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }
    
    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }
    
    public boolean xoaSinhVien(SinhVien sv){
        return this.danhSach.remove(sv);
    }
    
    public boolean kiemTraTonTai(SinhVien sv){
        return this.danhSach.contains(sv);
    }
    
    public void timSinhVien(String ten){
        for(SinhVien sinhVien : danhSach){
            if(sinhVien.getHoVaTen().indexOf(ten)>=0){
                System.out.println(sinhVien);
            }
        }
    }
    
}
