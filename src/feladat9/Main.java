/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dóri
 */
public class Main {
    
    public static void kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(List<Hátizsák> lista){
        for(int i=0;i<lista.size();i++){
            Collections.sort(lista);
            System.out.println(lista.get(i));
        }
    }
    public static void main(String[] args) {
        List<Hátizsák> hátizsákok=new ArrayList<>();
        hátizsákok.add(new Hátizsák("Adidas", 10.6, 5, true));
        hátizsákok.add(new Hátizsák("Puma", 12.2, 8, true));
        hátizsákok.add(new Hátizsák("Adidas", 5.6, 2, false));
        hátizsákok.add(new Hátizsák("Nike", 8.4, 3, false));
        hátizsákok.add(new Hátizsák("Nike", 11.5, 6, true));
        hátizsákok.add(new Hátizsák("Heavy Tools", 8.8, 3, false));
        hátizsákok.add(new Hátizsák("Puma", 9.7, 4, true));
        hátizsákok.add(new Hátizsák("Heavy Tools", 11.2, 5, true));
        hátizsákok.add(new Hátizsák("Doymos", 9.9, 4, false));
        hátizsákok.add(new Hátizsák("Doymos", 8.3, 3, true));
        
        kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(hátizsákok);
    }
}
