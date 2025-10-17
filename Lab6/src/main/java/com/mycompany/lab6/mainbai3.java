//Name : 
//Mssv : 
//Date : 
//Slide:
package com.mycompany.lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class mainbai3 {

    public static void main(String[] args) {

        ArrayList<SinhVien> dssv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Danh sach 5 sinh vien");
        for (int i = 0; i < 5; i++) {
            System.out.println("nhap thong tin sinh vien thu" + i + ": ");
            System.out.print(" - Họ và tên: ");
            String hoTen = sc.nextLine();

            String email, sdt, cc;
            do{
                System.out.println("E-mail: ");
                email = sc.nextLine();
                String emailCQ = "\\w+@\\w+\\.\\w+";
                if(email.matches(emailCQ)){
                    break;
                } else {
                    System.out.println("Nhap sai!");
                }
            } while(true);
            while(true){
                System.out.println("so dien thoai: ");
                sdt = sc.nextLine();
                String sdtCQ = "0\\d{9}";
                if(sdt.matches(sdtCQ)){
                    break;
                } else {
                    System.out.println("nhap sai!");
                }
            }
            while(true){
                System.out.println("can cuoc: ");
                cc = sc.nextLine();
                String ccCQ = "\\d{9}|\\d{12}";
                if(cc.matches(ccCQ)){
                    break;
                } else {
                    System.out.println("nhap sai!");
                }
            }
            SinhVien sv = new SinhVien(hoTen, email, sdt, cc);
            dssv.add(sv);
        }
        System.out.println("Danh sach sinh vien da nhap");
        for(SinhVien sv:dssv){
            sv.xuat();
        }

    }

}
