
package DOMINIO;

public class CURSO {
    private double [] notas;
    private double promedio;
    private int estudiantesencimapromedio;
    
    public CURSO()
    {
        notas =new double [12];
    }
    
    public void setNotas (double[] notas )
    {
        this.notas=notas;
    }
    
    public void mostrarNotas ()
    {
        for (int i=0;i<12;i++)
        {
            System.out.println(this.notas[i]);
        }
    }
    
    public double getPromedio()
    {
       double Cont=0;
        for (int i=0;i<12;i++)
        {
            Cont= Cont+notas[i];
        }
        
        promedio=Cont/12;
        
        return this.promedio;
    }
    
    public int nroEstEnciProm()
    {
        int num=0;
        for (int i=0;i<12;i++)
        {
            while(notas[i]>promedio)
            {
                num=num+i;
            }
        }
        
        estudiantesencimapromedio=num;
        
        return this.estudiantesencimapromedio;
    }
}
