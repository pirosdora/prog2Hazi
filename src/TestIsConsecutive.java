/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dóri
 */
public class TestIsConsecutive {
    public static boolean isConsecutiveFour(int[] values) {

        
       if (values.length >= 4) {
            for (int j = 0; j < values.length-3; j++) {
                if (values[j] == values[j + 1] && values[j] == values[j + 2] && values[j] == values[j + 3]) {
                    return true;
                }
                }

            }
        
        return false;
    }

    public static void main(String[] args) {
        int[] t={1,2,3,3,3};
        
        for (int i = 0; i < t.length; i++) {
            
            System.out.print(t[i] + " ");
        }
        System.out.println("");
        System.out.println(isConsecutiveFour(t));
    }
}


