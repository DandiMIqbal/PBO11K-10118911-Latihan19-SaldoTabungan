/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldotabungan;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 2500000;
        double bunga = 0.15;        
        for (int i=1 ; i <=6 ; i++){
            bunga = saldo * 0.15;
            saldo = (int) (saldo+bunga);            
            System.out.printf("Saldo Bulan ke-"+ i +" Rp.%,10d%n",saldo ); 
        }    
    }

}