/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonnie_desafio_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author User
 */
public class Tonnie_Desafio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
        Set<String> aliceSet = new HashSet<>();
        Set<String> bettySet = new HashSet<>();
        Set<String> aliceSetTemp = new HashSet<>();
        Set<String> bettySetTemp = new HashSet<>();
        String[] linesplit;
        String line;

        Scanner sc = new Scanner(System.in);
        
        while (true) {            
            
            line = sc.nextLine();
            linesplit = line.split(" ");
            
            if(line.equals("")) { break;}
            
            if(linesplit.length < 2 ||  linesplit.length > 2 ) {
                break;
            }
            
            if(  (Integer.parseInt(linesplit[0]) < 1 ||  Integer.parseInt(linesplit[0]) > 104 ) 
                || (Integer.parseInt(linesplit[1]) < 1 ||  Integer.parseInt(linesplit[1]) > 104) ) {
                break;
            }
            
            // ALICE         
            line = sc.nextLine();
            linesplit = line.split(" ");           
            if( linesplit.length < 1 ||  linesplit.length > 104 ) {
                break;
            }            
            
            for (String carta : linesplit) {               
                aliceSet.add(carta);
            }
         
            // BETTY          
            line = sc.nextLine();
            linesplit = line.split(" ");
            
            if( linesplit.length < 1 ||  linesplit.length > 104 ) {
                break;
            }
            
            for (String carta2:linesplit) {                
                bettySet.add(carta2);
            }            
            
            aliceSetTemp.addAll(aliceSet);
            bettySetTemp.addAll(bettySet);            
            aliceSetTemp.removeAll(bettySet);
            bettySetTemp.removeAll(aliceSet);
            
            if (aliceSetTemp.size() > bettySetTemp.size()) {
                System.out.println(bettySetTemp.size());
            } else {
                System.out.println(aliceSetTemp.size());
            }
 
            aliceSet.clear();
            bettySet.clear();
            aliceSetTemp.clear();
            bettySetTemp.clear();                   
            
        }
        
    }
    
}
