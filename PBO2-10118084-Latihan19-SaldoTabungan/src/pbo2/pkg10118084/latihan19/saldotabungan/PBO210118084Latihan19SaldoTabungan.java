/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan19.saldotabungan;

/**
 *
 * @author Freza
 * Nama  : Divi Adiffia Freza Alana
 * Kelas : PBO2
 * Nim   : 10118084
 * Deskripsi Program : Program ini berisi program untuk menghitung SaldoTabungan
 */
public class PBO210118084Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double saldoAwal,lama,saldo;
    double bunga;
    saldoAwal = 2500000;
    lama = 6;
    bunga = 0.15;
    saldo = saldoAwal*bunga+saldoAwal;
    
     for( int i =1; i <= lama; i++){
         System.out.println("Saldo di bulan ke-" + i + "Rp."+ saldo);
         saldo = saldo * bunga + saldo;     }
        }
    }
   
