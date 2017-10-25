/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer;

import java.io.*;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Leer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        
        // TODO code application logic here
    
      Scanner s= new Scanner(new File("archivos/hours.txt")); 
        process(s);
    }
    public static void process(Scanner s){
        while(s.hasNext()){
        String name=s.next();
        double sum=0.0;
        while(s.hasNextDouble()){
            sum+=s.nextDouble();
        
        }
        System.out.println("Horas trabajadas por "+name+"-total-"+sum);
        
        } 
    }
    }
    
    

