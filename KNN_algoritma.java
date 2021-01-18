/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kNN_new;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author lutfi
 */
public class KNN_algoritma {
    public static String ranking = "";
    public String knn(int nR, int uN) throws IOException{
        
        // Data Training
        DataLatih latih = new DataLatih();
        
        // Data Testing
        int NR = nR;
        int UN = uN;
        
        double hasilED, hasilED_before;
        
        Map knn = new HashMap<>();
        System.out.println("DATA TESTING");
        System.out.println("NR  : " + NR);
        System.out.println("UN  : " + UN);
        System.out.println("");
        System.out.println("Hasil Jarak Euclidean");
        System.out.println("Nilai Rapot \t" + "Nilai UN \t" + "Kelas \t" + "\t ED");
        
        for(int a = 1; a<10; a++){
            hasilED = jarakEuclidean(latih.NR[a], NR, latih.UN[a], UN);
            System.out.println(latih.NR[a] + "\t \t" + latih.UN[a] + "\t \t" + latih.kelas[a] + "\t \t" + hasilED);
            knn.put(hasilED, latih.kelas[a]);
        }
        
        System.out.println("Ranking Euclidean Distance");
        Map knn_hasil = new TreeMap(knn);
        printMap(knn_hasil);
        
        System.out.println("");
        System.out.println("Hasil Keputusan : " + knn_hasil.values().toArray()[0]);
        return (String) knn_hasil.values().toArray()[0];
    }

    public static void printMap(Map map) {
        Set s = map.entrySet();
        Iterator it = s.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Double key = (double) entry.getKey();
            String value = (String) entry.getValue();
            ranking = ranking + "\n " + "Apel: " + i + " nilai: " + key + " => " + value;
            System.out.println(key + " => " + value);
            i++;
        }
        System.out.println("================");
    }
    
    // Membuat function untuk jarak Euclidean
    static double jarakEuclidean(int R1, int R2, int G1, int G2) {
        return Math.sqrt(Math.pow(R1 - R2, 2) + Math.pow(G1 - G2, 2));
    }
}
