/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author pekep_000
 */
public class EcuacionDeSegundoGrado {
    
    private double a;
    private double b;
    private double c;
    double discriminante;
    double NumRaices;
    double raiz1;
    double ElDiscriminante;
    double raiz2;
    
    
    
    public  EcuacionDeSegundoGrado (double a,double b,double c){
        
        this.a = a;
        this.b = b;
        this.c = c;}
    
    public double getCoeficienteA(){
        
        return a;
         }
    public double getCoeficienteB(){
        
        return b;
        
    }
    public double getCoeficienteC(){
        
        return c;
    }
    
    public double getDiscriminante(){
        
        discriminante = Math.pow(b,2)- 4 * a * c;
        
        return discriminante;
      
               
        }
    public double getNumeroDeSolucionesReales(){
    
        double Dis = getDiscriminante();
        
        if(Dis > 0){
            
         NumRaices = 2;
         
        }
        
        else if (Dis < 0){
            
            NumRaices = 0;
            
        }
        
        else {
            
            NumRaices = 1;
        }
        
        return NumRaices;
        }
    
    public double getRaiz1(){
        
        raiz1 = (-(b) + Math.sqrt(ElDiscriminante)) / (2 * a);
        
        return raiz1;
               
    }
    
    public double getRaiz2(){
        
        raiz2 =  (-(b) - Math.sqrt(ElDiscriminante)) / (2 * a);
        
        return raiz2;
    }
        
    
    }
    

    
        
        
        

        
        
        
                
        
        
                
        
        
    
    
    

