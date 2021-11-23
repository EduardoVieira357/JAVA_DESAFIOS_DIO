/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gft_desafio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class GFT_desafio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] linesplit;
        //ArrayList<Integer> people = new ArrayList<>();
        String line;
        Integer guests;
        Integer min;
        Integer max;
        Integer height;
        Integer counter;        
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            counter=0;
            line = sc.nextLine();
            linesplit = line.split(" ");
            if(linesplit.length !=3) {break;}
            
            guests = Integer.parseInt(linesplit[0]);                        
            min = Integer.parseInt(linesplit[1]);
            max = Integer.parseInt(linesplit[2]);
            
            if(guests<1 && guests>100) {break;}
            if(min<50 || min>250 || min>=max) {break;}
            if(max<50 || max>250 || max<=min) {break;}
            
            for (Integer i=0; i<guests;i++) {
                line = sc.nextLine();
                height = Integer.parseInt(line);                
                if(height<min || height>max) {continue;}
                counter++;                 
            }
            
            System.out.println(counter);
            break;        
            
        }
    }
}
