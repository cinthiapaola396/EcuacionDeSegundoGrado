/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciondesegundogrado;



import java.util.Scanner;
import modelo.EcuacionDeSegundoGrado;


/**
 *
 * @author pekep_000
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        
        
        EcuacionDeSegundoGrado Ecuacion1 = new EcuacionDeSegundoGrado(2,-4,8);
        
        System.out.println("El valor del discriminante es de:" 
                            + Ecuacion1.getDiscriminante());
        System.out.println("El número de raíces reales es de:"
                           + Ecuacion1.getNumeroDeSolucionesReales());
        System.out.println("Valor de la raíz x1:" + Ecuacion1.getRaiz1());
        System.out.println("Valor de la raíz x2:" + Ecuacion1.getRaiz2());
        
         EcuacionDeSegundoGrado Ecuacion2 = new EcuacionDeSegundoGrado(14,28,30);
        
        System.out.println("El valor del discriminante es de:" 
                            + Ecuacion2.getDiscriminante());
        System.out.println("El número de raíces reales es de:"
                           + Ecuacion2.getNumeroDeSolucionesReales());
        System.out.println("Valor de la raíz x1:" + Ecuacion2.getRaiz1());
        System.out.println("Valor de la raíz x2:" + Ecuacion2.getRaiz2());
        
         EcuacionDeSegundoGrado Ecuacion3 = new EcuacionDeSegundoGrado(-8,-4,8);
        
        System.out.println("El valor del discriminante es de:" 
                            + Ecuacion3.getDiscriminante());
        System.out.println("El número de raíces reales es de:"
                           + Ecuacion3.getNumeroDeSolucionesReales());
        System.out.println("Valor de la raíz x1:" + Ecuacion3.getRaiz1());
        System.out.println("Valor de la raíz x2:" + Ecuacion3.getRaiz2());
        
         EcuacionDeSegundoGrado Ecuacion4 = new EcuacionDeSegundoGrado(-2,-4,-8);
        
        System.out.println("El valor del discriminante es de:" 
                            + Ecuacion4.getDiscriminante());
        System.out.println("El número de raíces reales es de:"
                           + Ecuacion4.getNumeroDeSolucionesReales());
        System.out.println("Valor de la raíz x1:" + Ecuacion4.getRaiz1());
        System.out.println("Valor de la raíz x2:" + Ecuacion4.getRaiz2());
        
         EcuacionDeSegundoGrado Ecuacion5 = new EcuacionDeSegundoGrado(-14,-4,2);
        
        System.out.println("El valor del discriminante es de:" 
                            + Ecuacion5.getDiscriminante());
        System.out.println("El número de raíces reales es de:"
                           + Ecuacion5.getNumeroDeSolucionesReales());
        System.out.println("Valor de la raíz x1:" + Ecuacion5.getRaiz1());
        System.out.println("Valor de la raíz x2:" + Ecuacion5.getRaiz2());
        
        
        
        
        
        
        
       
        
        
      
    }
    
}
