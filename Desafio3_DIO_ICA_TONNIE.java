/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonnie_desafio_03;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tonnie_Desafio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String line;
        Integer teste;
        Integer i;
        String[] linesplit;
        Integer drinks;
        Integer promotion;
        Integer glasses;
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {            
            drinks = 0;
            promotion = 0;
            glasses = 0;
            
            line = sc.nextLine();
            teste = Integer.parseInt(line);
            
            if(teste < 1 || teste > 10000)  {
                break;
            }
                        
            for(i=0; i<teste; i++) {
                line = sc.nextLine();
                linesplit = line.split(" ");
                drinks = Integer.parseInt(linesplit[0]);
                glasses = Integer.parseInt(linesplit[1]);              
                               
                if( (drinks<1 || drinks >10000) && (glasses<1 || glasses>10000)) {
                    break;
                }
                
                if(drinks>glasses || drinks==glasses) {
                    promotion = promotion + drinks/glasses;
                    promotion = promotion + drinks%glasses;                                        
                } else {
                    promotion = drinks;
                }
                
                System.out.println(promotion);
                promotion = 0;
            }            
            
            break;
        }
        
    }
    
}
