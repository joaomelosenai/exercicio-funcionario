
package funcionario;

/**
 *
 * @author SESI_SENAI
 */
public class Funcionario {
 
    public Funcionario(String nome, String departamento, double salario, String datadeentrada, String RG)
    {  
      this.nome = nome;
      this.departamento= departamento;
      this.salario= salario;
      this.datadeentrada= datadeentrada;
      this.RG= RG;
    
    }

        String nome;    
        String departamento;
        double salario;
        String datadeentrada;
        String RG;
        
        public void recebeAumento(double aumento) {
       this.salario = this.salario + aumento;
       System.out.println(this.salario);
        }
        
        public void calculaGanhoAnual() {
            double ganhoAnual = this.salario * 12;
            System.out.println(ganhoAnual);
        }
        
}
