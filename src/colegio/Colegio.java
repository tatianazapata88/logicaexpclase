
package colegio;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Colegio {

    public static void main(String[] args) 
    {
       DecimalFormat nro = new DecimalFormat ("###,###");
        double valor=0, prom=0, nota=0, acum=0, pagar;
       int mat;
       
        Scanner entrada = new Scanner(System.in);
        
        liquidacionmatricula resultado = new liquidacionmatricula();
        System.out.println("Ingresa el valor establecido por materia");
        valor=entrada.nextDouble();
        System.out.println("Ingresa la cantidad de materias");
        mat=entrada.nextInt();
        for (int i = 1; i <= mat; i++) 
        {
            System.out.println("Ingresa la nota de 1 a 10 obtenido de la materia "+i);
            nota=entrada.nextDouble();
            acum= acum + nota;
        }
        prom=acum/mat;
        
        if (prom>=9) 
        {
            pagar=resultado.descuento(valor, mat);
            
        }
        else
        {
            pagar=resultado.normal(valor, mat);
        }
        System.out.println("El estudiante debe pagar: "+nro.format(pagar));
    }
    
}
