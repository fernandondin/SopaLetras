/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

/**
 *
 * @author fernandondin
 */
public class Coordenada {
   private int inicio;
   private int inicio1;
   public Coordenada(int inicio,int inicio1){
       this.inicio=inicio;
       this.inicio1=inicio1;
   }
   public int getInicio(){
       return inicio;
   }
   public int getInicio1(){
       return inicio1;
   }
   public boolean equals(Object o){
       if(this.getClass()!= o.getClass())
           return false;
       @SuppressWarnings("unchecked")
       Coordenada coordenada = (Coordenada)o;
       return (this.inicio == coordenada.inicio) && (this.inicio1 == coordenada.inicio1); 
   }
   public String toString(){
       return "("+inicio+","+inicio1+")";
   }
}
