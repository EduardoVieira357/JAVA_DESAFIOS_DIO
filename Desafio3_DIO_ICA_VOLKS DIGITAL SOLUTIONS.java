/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio3;

import java.beans.Expression;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Desafio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        ArrayList<String> listaexp = new ArrayList<>();
        ArrayList<String> resposta = new ArrayList<>();
        String[] linesplit;
        String mensagem;
        String line;
        
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            
            
            linesplit = line.split(" ");
            
            for (String linha: linesplit) {
                listaexp.add(linha);                
            }

            if (line.isEmpty()) {
                break;
            } 
        }
   
        for (String linha: listaexp) {            
        
            mensagem = "incorrect";
            
            if ( linha.isEmpty() ) {
                mensagem = "";
                continue;
            }
            
            if (!linha.contains(")") && !linha.contains("(")) {
                resposta.add(mensagem);
                continue;
            }
            
            if (String.valueOf(linha.charAt(linha.length() - 1)).equals("(") ) {
                resposta.add(mensagem);
                continue;                
            }
            
            if (String.valueOf(linha.charAt(0)).equals(")") )  {
                resposta.add(mensagem);
                continue;                
            }               

            int count1 = 0;
            int count2 = 0;            

            String[] linhasplit = linha.split("");            
            for (String ch:linhasplit) {                
                mensagem = "correct";
                
                if (ch.equals("(")) {                    
                    count1++;
                }

                if (ch.equals(")")) {
                    count2++;
                }

                if (count1 != count2) {
                    mensagem = "incorrect";
                }
            }
            resposta.add(mensagem);
            
        }
                
        for (String resp: resposta) {
            System.out.println(resp);

        }
   
    }
   
}
