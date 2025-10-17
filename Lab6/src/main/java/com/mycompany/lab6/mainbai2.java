//Name : 
//Mssv : 
//Date : 
//Slide:

package com.mycompany.lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class mainbai2 {

    public static void main(String[] args) {
        ArrayList<SanPham> danhSachSP = new ArrayList<>();
        System.out.println("Nhap danh sach 5 san pham");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nNhap  san pham thu " + (i + 1) + ":");
        
            SanPham sp = new SanPham();
           
            sp.nhap();
            
            danhSachSP.add(sp);
        }
        System.out.println("cac san pham cua hang nokia");
        for(SanPham sp:danhSachSP){
            if (sp.hang.equalsIgnoreCase("Nokia")){
                sp.xuat();
            }
        }

    }

}
