/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\t - ho & ten: Phu\n\r\t");
        String hoTen = "Pham Hoang Ngoc Phu";
        String ho = hoTen.substring(0, 4);
        System.out.println("tach ho: "+ho.toUpperCase());
        String dem = hoTen.substring(5, 15);
        System.out.println("tach dem: "+dem);
        String ten = hoTen.substring(15, 19);
        System.out.println("tach ten: "+ten.toUpperCase());
        
        
    }
}
