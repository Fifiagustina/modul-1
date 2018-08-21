/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author Fifi Agustina
 */
public class LuasPermukaanBola {
    public static void main(String[] args) {
    Scanner bil = new Scanner(System.in);
    System.out.println("Masukkan r : ");
    float r = bil.nextFloat();
    System.out.println("Luas Permukaan Bola : "+4*22/7*r*r);
    }
}  

