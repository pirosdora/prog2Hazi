/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zárthelyi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dóri
 */
public class Main {

    public static void main(String[] args) {
        List<Zárthelyi> eredmények = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();

        while (sor.length() > 0) {
            String[] darab = sor.split(";");
            Zárthelyi eredmény = new Zárthelyi();
            eredmény.setNév(darab[0]);
            eredmény.setPont(Integer.parseInt(darab[1]));

            boolean bennevolt = false;
            for (int i = 0; i < eredmények.size(); i++) {
                if (eredmények.get(i).getNév().equals(eredmény.getNév())) {
                    eredmények.get(i).setPont(eredmények.get(i).getPont() + eredmény.getPont());
                    bennevolt = true;
                }

            }
            if (!bennevolt) {
                eredmények.add(eredmény);
                

            }
            sor = sc.nextLine();
        }
        Collections.sort(eredmények);
        for(int i=0;i<eredmények.size();i++){
            System.out.println(eredmények.get(i));
        }
    }

}
