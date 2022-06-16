/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysinhvien;

import java.util.Objects;

/**
 *
 * @author macbookpro
 */
public class SinhVien {
    public String maSinhVien;
    public String hoTen;
    public int namSinh;
    public float diemTB;
    
    public SinhVien(String maSinhVien){
        this.maSinhVien = maSinhVien;
    }
    
    
    
    //ham khoi tao sinh vien co tham so truyen vao

    public SinhVien(String maSinhVien, String hoTen, int namSinh, 
            float diemtTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTB = diemtTrungBinh;
    }
    
    public String getHoVaTen(){
       return hoTen;
    }
    
    @Override
    public String toString(){
        return maSinhVien + "- Ho ten " + hoTen + " - " + namSinh + " - " + diemTB;
    }
    
//    @Override
//     public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//	SinhVien other = (SinhVien) obj;
//	return Objects.equals(maSinhVien, other.maSinhVien);
//	}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SinhVien other = (SinhVien) obj;
        if (!Objects.equals(this.maSinhVien, other.maSinhVien)) {
            return false;
        }
        return true;
    }

    
    }
