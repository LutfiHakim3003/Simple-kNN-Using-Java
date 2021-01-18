/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kNN_new;

import java.io.IOException;

/**
 *
 * @author lutfi
 */
public class KNN_run {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Data Testing
        
        int nr = 6;
        int un = 9;
        
        KNN_algoritma deteksi = new KNN_algoritma();
        String hasil  = null;
        
        hasil = deteksi.knn(nr, un);
    }
}
