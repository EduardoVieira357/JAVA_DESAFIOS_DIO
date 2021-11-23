/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Desafio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException  {
        
        Scanner sc = new Scanner(System.in);
        String linha1 = sc.nextLine();
        String linha2 = sc.nextLine();
        String mensagem;
        
        String[] linha1split = linha1.split(" ");
        String[] alturatubo= linha2.split(" ");
        
        int pulo = Integer.parseInt(linha1split[0]);
        int numerotubos = Integer.parseInt(linha1split[1]);
        int tubo;
         
        //int salto=0;
        int diferenca;
        //int teste = -10;
        
        //int value = Math.abs(teste);
        //System.out.println("---> "+ Math.abs(teste));
        
        mensagem = "YOU WIN";
        int plataforma = Integer.parseInt(alturatubo[0]);
        for (int i=1; i < alturatubo.length; i++) {
            diferenca = Math.abs(plataforma  - Integer.parseInt(alturatubo[i]));
            
            if (diferenca > pulo ) {
                mensagem = "GAME OVER";
                break;
                
            }
            
            plataforma = Integer.parseInt(alturatubo[i]);

        }
        
        System.out.println(mensagem);
        
    }
    
}
