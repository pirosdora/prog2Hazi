
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dóri
 */
public class Main {

    public static Kocsma[] adottItaltKínálóK(String ital, VendéglátóipariEgység[] t) {
        int count = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] instanceof Kocsma) {
                Kocsma k = (Kocsma) t[i];
                for (int j = 0; j < k.getSörlap().length; j++) {
                    if (k.getSörlap()[j].equals(ital)) {
                        count++;
                    }
                }
            }
        }
        Kocsma[] kocsma = new Kocsma[count];
        int p = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] instanceof Kocsma) {
                Kocsma k = (Kocsma) t[i];
                for (int j = 0; j < k.getSörlap().length; j++) {
                    if (k.getSörlap()[j].equals(ital)) {
                        kocsma[p] = k;
                        p++;
                    }
                }
            }
        }
        return kocsma;
    }

    public static void rendezMaxSzállíthatóTeherCsökkenő(Teherautó[] teher) {
        for (int i = 0; i < teher.length - 1; i++) {
            for (int j = i + 1; j < teher.length; j++) {
                if (teher[i].getMaxSzállíthatóTeher() < teher[j].getMaxSzállíthatóTeher()) {
                    Teherautó tmp = teher[i];
                    teher[i] = teher[j];
                    teher[j] = tmp;
                }
            }
        }
    }

    public static Autó keresMaxMotorTeljesítmény(Autó[] auto) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < auto.length; i++) {
            if (auto[i].getMotorTeljesítmény() > max) {
                max = auto[i].getMotorTeljesítmény();
                index = i;
            }
        }

        return auto[index];
    }

    public static void main(String[] args) {
        VendéglátóipariEgység[] t = new VendéglátóipariEgység[]{
            new Kocsma("Aranygóól", 50, new String[]{"Borsodi", "Gösser", "Heineken"}),
            new Kocsma("Fácán", 85, new String[]{"Borsodi", "Gösser", "Steffl"}),
            new Kocsma("Presszó", 30, new String[]{"Soproni", "Karlsberger", "Heineken"}),
            new Kocsma("Holló", 20, new String[]{"Borsodi", "Soproni", "Heineken"}),
            new Kocsma("Nyugati", 75, new String[]{"Borsodi", "Gösser", "Steffl"}),
        new Étterem(new String[]{"Húsleves","Rántott hús","Somlói"}, "Pálma", 120),
        new Étterem(new String[]{"Gyümölcsleves","Rántott hús","Palacsinta"}, "Viktória", 150),
        new Étterem(new String[]{"Húsleves","Rántott hús","Csokitorta"}, "Calico", 90),
        new Étterem(new String[]{"Húsleves","Rántott hal","Somlói"}, "Borostyán", 85),
        new Étterem(new String[]{"Hagymaleves","Rántott hús","Sajt torta"}, "Melange", 80)
        };
        Kocsma[] ital=adottItaltKínálóK("Soproni", t);
        for(Kocsma k:ital)
            System.out.println(k);
        System.out.println("-----------------------------------");
Autó[] auto=new Autó[]{
    new Autó("MNR-256", 1000),
    new Autó("GMB-658", 2000),
    new Autó("TNR-478", 15000),
    new Autó("TNA-666", 5000),
    new Autó("LMN-898", 6000),
    new Teherautó("MFE-568", 8000, 10),
    new Teherautó("DMR-128", 12000, 30),
    new Teherautó("DZR-158", 9000, 20),
    new Teherautó("LNA-247", 10000, 20),
    new Teherautó("KMR-345", 12000, 60)
};
Teherautó[] teher=new Teherautó[]{
  new Teherautó("SRF-324", 12000, 60),
    new Teherautó("SMS-146", 9000, 10),
    new Teherautó("DGS-235", 6000, 10),
    new Teherautó("EMZ-256", 9000, 20),
    new Teherautó("ENT-336", 11000, 30),
    new Teherautó("SLZ-114", 9000, 20),
    new Teherautó("FRT-258", 8000, 10),
    new Teherautó("MZM-478", 7000, 10),
    new Teherautó("MMS-361", 8000, 10)
};
        rendezMaxSzállíthatóTeherCsökkenő(teher);
        for(Teherautó tr:teher){
            System.out.println(tr);}
            System.out.println("legnagyobb motor teljesítmény");
            System.out.println(keresMaxMotorTeljesítmény(auto));
        }


    }
    
