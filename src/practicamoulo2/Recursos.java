/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamoulo2;

/**
 *
 * @author Maynor Molina
 */
public class Recursos {
 private int dividir;
    
    public void Mensaje(){
        System.out.println("Estoy aprendiendo, pero seré el mejor programador del mundo");
    }
    
    public void Nota(int nota){
        
        if(nota>=70){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
    }
    
    public void División(int a, int b){
        dividir=a/b;
        System.out.println("El resultado obtenido de la Division es: "+dividir+"");
    }
    
    public void lista(int número){
        int i = número;
        while(i <= 50) {
            System.out.println(i);
            i+=número;
        }    
    
}
    }
