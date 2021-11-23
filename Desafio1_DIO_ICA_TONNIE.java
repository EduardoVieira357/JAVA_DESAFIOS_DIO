/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonnie_desafio_01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tonnie_Desafio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> jogada = new ArrayList<>();
        String[] linesplit;
        String line;
        Integer number;
        Integer mary;
        Integer john;
        Boolean doing = true;
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            
            line = sc.nextLine();            
            number = Integer.parseInt(line);                        
            
            if (number.equals(0) || number > 10000) {
                break;
            }
            
            line = sc.nextLine();
            linesplit = line.split(" ");
            
            number = linesplit.length;
            
            if (number > 10000) {
                break;
            }
            
            for (int i=0; i < linesplit.length-1; i++) {
                
                jogada.add(linesplit[i]);
            }
            
            mary=0;
            john=0;
            
            for (String valor: linesplit) {
                
                if( valor.equals("0")) {
                    mary++;
                }
                    
                if (valor.equals("1")) {
                    john++;
                }
            }

            System.out.println("Mary won "+mary+" times and John won "+john+" times");
            
        }
        
    }
    
}
