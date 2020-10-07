
package colegio;


public class liquidacionmatricula 
{
    double matricula;
      
    
    public double descuento(double valor, int mat)
    {
       matricula=(mat*valor)-(mat*valor*0.3);
       return matricula;
    }
    
    public double normal (double valor, int mat)
    {
        matricula=(mat*valor)+(mat*valor*0.1);
        return matricula;
    }
}
