/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import java.util.Scanner;

/**
 *
 * @author Amran
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan total belanja (Rp) :");
        int total = input.nextInt();
        System.out.print("Masukan uang yang diterima (Rp) :");
        int uangTerima = input.nextInt();
            if (uangTerima > total) {
                int uang = uangTerima - total;
                System.out.println("Jumlah uang yang harus dikembalikan adalah sebesar Rp" + uang);
                System.out.print("Jumlah uang yang tersedia :");
                int n = input.nextInt();
                int koin[] = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Uang " + (i + 1) + " dengan nominal (Rp) : ");
                    koin[i] = input.nextInt();
                }
                System.out.print("Masukkan jumlah kemungkinan pecahan uang kembalian untuk uang Rp"+uang+"  :");
                int batas = input.nextInt();
                int hasil[] = new int[batas];
                int jumlah[] = new int[batas];
                // instansiasi objek greedy
                Greedy greedy = new Greedy();
                for (int i = 0; i < batas; i++) {
                    System.out.print("Pecahan ke " + (i + 1) + " yaitu ");
                    greedy.Greedy(koin, hasil, jumlah, uang, i);
                }
                greedy.solusiGlobal(hasil, jumlah, uang);
            }
            else {
                System.out.print("Maaf, uang anda kurang.");
            }
    }
}
