/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;

/**
 *
 * @author ICT
 */
public class SinhVien {
    
    String hoTen;
    String email;
    String sdt;
    String cc;

    public SinhVien() {
    }
    
    public SinhVien(String hoTen, String email, String sdt, String cc) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cc = cc;
    }
    public void xuat(){
        System.out.println("Ho & ten: " +hoTen);
        System.out.println("E-mail: " +email);
        System.out.println("So dien thoai: " +sdt);
        System.out.println("Can cuoc: " +cc);
    }
    
}
