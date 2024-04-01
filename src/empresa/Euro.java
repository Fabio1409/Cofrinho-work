package empresa;

import java.util.Objects;

// Classe que representa uma moeda Euro, que é uma subclasse de Moeda
public class Euro extends Moeda {
	
    // Taxa de conversão do Euro para Real
    final double euro = 5.41;
	
    // Construtor da classe Euro
    public Euro(String nome, double valor) {
        super(nome, valor); // Chama o construtor da classe mãe Moeda
    }

    // Método para converter o valor do Euro para Real
    public double converter() {
        return getValor() * euro; // Multiplica o valor do Euro pela taxa de conversão
    }

    // Método para exibir informações sobre o valor do Euro convertido para Real
    public void info() {
        System.out.printf(getValor() + " Euro convertido em Real: %.2f ", converter()); // Imprime o valor do Euro convertido para Real com duas casas decimais
        System.out.println();
    }

    // Sobrescrita do método toString para retornar uma representação em string do objeto Euro
    @Override
    public String toString() {
        return "Euro  = " + getValor() + ""; // Retorna uma string representando o valor do Euro
    }

    // Sobrescrita do método equals para comparar dois objetos Euro
    @Override
    public boolean equals(Object obj) {
        if (this == obj) // Verifica se os objetos são idênticos na memória
            return true;
        if (!super.equals(obj)) // Verifica a igualdade dos objetos usando o método equals da classe mãe
            return false;
        if (getClass() != obj.getClass()) // Verifica se os objetos são da mesma classe
            return false;
        Euro other = (Euro) obj; // Faz o cast do objeto para Euro
        return Double.doubleToLongBits(euro) == Double.doubleToLongBits(other.euro); // Compara o valor da taxa de conversão
    }
}
