/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;
/**
 *Greedy Algorithm with Backtracking
 * @author Amran
 */
public class Greedy {

    public int i, j, k;

    Greedy() {

    }
    void Greedy(int koin[], int hasil[], int jumlah[], int uang, int i) {
        int s[] = new int[uang];

        while (jumlah[i] < uang) {
            k = (int) (Math.random() * koin.length);
            s[hasil[i]] = koin[k];

            if ((jumlah[i] + s[hasil[i]]) <= uang) {
                System.out.print(s[hasil[i]] + ", ");
            }
            jumlah[i] += s[hasil[i]];
            hasil[i] += 1;
        }
        System.out.print(" = ");
        if (jumlah[i] == uang) {
            System.out.println(jumlah[i]+", dengan " + hasil[i] + " Pecahan uang");
        } else {
            System.out.println(jumlah[i]+" tidak memenuhi "+uang);
        }
    }

    // method sorting
    void sorting(int data[], int n) {
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1; j++) {
                if (data[j] < data[j + 1]) {
                    k = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = k;
                }
            }
        }
    }

    // method untuk mencari solusi max n min
    void solusiGlobal(int data[], int jum[], int uang) {
        int bin[] = new int[data.length];
        j = 0;
        for (i = 0; i < data.length; i++) {
            if (jum[i] == uang) {
                bin[j] = data[i];
                j += 1;
            }
        }

        sorting(bin, bin.length);

        k = 0;
        for (i = 0; i < bin.length; i++) {
            if (bin[i] != 0) {
                k += 1;
            }
        }
        System.out.println("Paling Sedikit " + bin[k - 1]+" Pecahan" );
        System.out.println("Paling Banyak adalah " + bin[0]+" Pecahan");
        
    } 
    
}
