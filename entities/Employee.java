package entities;

public class Employee {
    
    public String nome;
    public double salarioB;
    public double imposto;

    public double salarioL() {
        return salarioB - imposto;
    }

    public void aumentarSalario(double porcentagem) {
        salarioB += salarioB * porcentagem / 100.0;
    }

    public String toString() {
        return nome
            + ", $ "
            + String.format("%.2f", salarioL());
    }
}
