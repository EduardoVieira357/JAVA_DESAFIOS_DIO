/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Desafio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String input;
        String inputquantidade;
        String inputnome;
        String inputpeso;
        String inputnotas;
        String[] notassplit;
        Double nota;
        int quantos=0;
        int i;
        int j;
        int s;
        double soma;
        
        ArrayList<String> listanomes = new ArrayList<>();
        ArrayList<Double> listapesos = new ArrayList<>();
        ArrayList<Double> listanotas = new ArrayList<>();
        ArrayList<Double> listatotais = new ArrayList<>();
        ArrayList<Double> listasomas = new ArrayList<>();
        
        boolean sim;
        Scanner sc = new Scanner(System.in);
        
        // pegar os dados
        quantos = Integer.parseInt(sc.nextLine());
        
        for (i = 0; i < quantos; i++) {
            
            listanotas.clear();
            listanomes.add(sc.nextLine());
            listapesos.add(Double.parseDouble(sc.nextLine()));
            
            inputnotas = sc.nextLine();
            notassplit = inputnotas.split(" ");
            
            //System.out.println(notassplit.length);
            
            for (j = 0 ; j < notassplit.length; j++) {
                listanotas.add(Double.parseDouble(notassplit[j]));
                //System.out.println(listanotas.get(j));
            }            
            
            
            Collections.sort(listanotas);
            listanotas.remove(0);
            
            Collections.reverse(listanotas);
            listanotas.remove(0);
            
            soma = 0.0;
            for(s=0; s < listanotas.size(); s++) {
                soma = soma + listanotas.get(s);
            }
            
            listasomas.add(soma);
            listatotais.add(soma * listapesos.get(i));
             
        }
        
        
        for (int num=0; num < quantos; num++) {
            
            System.out.print(listanomes.get(num)+" ");
            Locale.setDefault(Locale.US);
            //float f1 = listatotais.get(num);
            System.out.printf("%.2f",  listatotais.get(num));
            System.out.println();
            //System.out.println(listatotais.get(num));
            
           
            
        }
                
       
        
    }
    
}
