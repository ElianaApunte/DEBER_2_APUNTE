
package TEST;

import DOMINIO.CURSO;

public class TestPruebaCURSO {
    
    public static void main(String[] args) {
        CURSO cursoA = new CURSO();
        double [] notas = new double [12];
        
        for (int i=0;i<12;i++)
        {
            notas[i]= Math.random()*6;
        }
        
        cursoA.setNotas(notas);
        //cursoA.mostrarNotas();
        
        System.out.println("Promedio del curso es: "+cursoA.getPromedio());
        System.out.println("Numero de estudiantes encima del Promedio es: "+
                cursoA.nroEstEnciProm());
    }
    
    public static void llenaNotas(double[]notas)
    {
        for (int i=0;i<12;i++)
        {
            notas[i]= Math.random()*5;
        }
    }
    
}
