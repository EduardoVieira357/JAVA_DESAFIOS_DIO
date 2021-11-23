/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gft_desafio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class GFT_Desafio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] soma = new Integer[]{3,7,11,15,19,23,27,31};  
        String line;
        Integer kung;
        Integer lu;
        String result;
        Scanner sc = new Scanner(System.in);
        while(true) {            
            result="";
            line = sc.nextLine();
            if(line.equals("")) {break;}
            if(Integer.parseInt(line)<1 || Integer.parseInt(line)>16) {break;}
            kung = Integer.parseInt(line);
            
            line = sc.nextLine();
            if(line.equals("")) {break;}
            if(Integer.parseInt(line)<1 || Integer.parseInt(line)>16) {break;}
            lu = Integer.parseInt(line);
            
            if( (kung<9 && lu>8) || (kung>8 && lu<9) ) {
                result = "final";
                break;
            }
            
            if(kung < 9 && lu < 9) {
                if ( (kung<5 && lu>4) || (kung>4 && lu<5) ) {
                 result = "semifinal" ;
                 break;
                }             
                if ( (kung%2==0 && lu%2==0) || (kung%2!=0 && lu%2!=0) ) {
                 result = "quartas"   ;
                 break;
                } else {                    
                    if (Arrays.asList(soma).contains(kung+lu)) {                         
                        result="oitavas"; 
                        break;                 
                    } else {
                        result = "quartas";
                        break;
                    }                 
                }
            }
            
            if(kung > 8 && lu > 8) {
                if ( (kung<13 && lu>12) || (kung>12 && lu<13) ) {
                 result = "semifinal" ;
                 break;
                }             
                if ( (kung%2==0 && lu%2==0) || (kung%2!=0 && lu%2!=0) ) {
                 result = "quartas"   ;
                 break;
                } else {                    
                    if (Arrays.asList(soma).contains(kung+lu)) { 
                        result="oitavas"; 
                        break;                 
                    } else {
                        result = "quartas";
                        break;
                    }                 
                }
            }            
            
        }
        System.out.println(result);
    }
}
