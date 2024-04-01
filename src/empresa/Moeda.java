package empresa;

import java.util.Objects;

public abstract class Moeda {
	String nome;
	private double valor;
	
	
		
		public Moeda(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
			}
		public abstract  double converter();
		
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public double getValor() {
			return valor;
		}
		
		public void setValor(double valor) {
			this.valor = valor;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(valor);
			}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Moeda other = (Moeda) obj;
			return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
		}

	
}