/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gft_desafio3;

import java.text.NumberFormat;
import java.util.Locale;
import static java.util.Locale.US;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class GFT_desafio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(US);        
        String[] linesplit;
        String line;
        Integer people;
        Integer hotdogs;
        Double percapita;
        String percapitaS;
        
        while(true){
            Scanner sc = new Scanner(System.in);
            line = sc.nextLine();
            linesplit = line.split(" ");
            if(linesplit.length!= 2) {break;}
            
            hotdogs = Integer.parseInt(linesplit[0]);
            people = Integer.parseInt(linesplit[1]);
            if(hotdogs<1 || people<1) {break;}
            if(people>1000) {break;}
            
            percapita = hotdogs/(double)people;            
            percapitaS = String.format("%.2f",percapita);
            System.out.println(percapitaS);
            break;

        }
        
    }
    
}
