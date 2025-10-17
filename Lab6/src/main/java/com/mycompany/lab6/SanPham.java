/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class SanPham {

    String tenSp;
    double donGia;
    String hang;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten sp: ");
        this.tenSp = sc.nextLine();
        System.out.println("nhap hang: ");
        this.hang = sc.nextLine();
        System.out.println("nhap gia: ");
        this.donGia = sc.nextDouble();
    }
    public void xuat(){
        System.out.println("Ten: " + this.tenSp + " | Hang: " + this.hang 
                + " | Gia: " + this.donGia);
    }
}
