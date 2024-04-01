package empresa;

import java.util.Objects;

public class Dolar extends Moeda {
    public Dolar(String nome, double valor) {
    	
		super(nome, valor);
		
	}

	// Taxa de conversão fixa de Dólar para Real
    final double dolar = 5.02;
    
    // Método para converter o valor em Dólar para Real
    public double converter() {
        return getValor() * dolar;
    }
    
    // Método para imprimir informações sobre o valor em Dólar e seu equivalente em Real
    public void info() {
        System.out.printf(getValor() + " Dolar convertido em Real: %.2f " , converter());
        System.out.println();   
    }
    
    // Sobrescrita do método toString para representar o objeto como uma string
    @Override
    public String toString() {
        return "Dolar  = " + getValor() + "";
    }
    
    
    // Sobrescrita do método equals para comparar dois objetos Dolar pela taxa de conversão
    @Override
    public boolean equals(Object obj) {
        if (this == obj) // Verifica se os objetos são idênticos
            return true;
        if (!super.equals(obj)) // Chama o equals da superclasse para comparar valores
            return false;
        if (getClass() != obj.getClass()) // Verifica se os objetos são da mesma classe
            return false;
        Dolar other = (Dolar) obj;
        // Compara as taxas de conversão de ambos os objetos
        return Double.doubleToLongBits(dolar) == Double.doubleToLongBits(other.dolar);
    }   
}
