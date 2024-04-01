package empresa;

import java.util.ArrayList;

// Classe que representa um cofrinho que pode armazenar moedas
public class Cofrinho {

    // Lista para armazenar as moedas
    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    // Método para adicionar uma moeda à lista
    public void adicionar(Moeda m) {
        listaMoedas.add(m);
    }

    // Método para remover uma moeda da lista com base no nome
    public void remover(String nome) {
        for (Moeda m : listaMoedas) {
            if (m.getNome().equalsIgnoreCase(nome)) {
                listaMoedas.remove(m); // Remove a moeda
                System.out.println(nome + " Moeda Removida com sucesso:"); // Informa que a moeda foi removida
                System.out.println();
                return; // Retorna após a remoção bem-sucedida
            }
        }
    }

    // Método para listar todas as moedas no cofrinho
    public void listar() {
        for (Moeda m : listaMoedas) {
            System.out.println(m); // Imprime as informações da moeda
        }
    }

    // Método para calcular o total de todas as moedas convertidas para Real
    public void totalConvertido() {
        double conversao = 0;
        for (Moeda m : listaMoedas) {
            if (m instanceof Dolar || m instanceof Euro) {
                conversao = conversao + m.converter(); // Adiciona o valor convertido à conversão total
            } else if (m instanceof Real) {
                conversao = conversao + m.getValor(); // Adiciona o valor da moeda Real à conversão total
            }
        }
        System.out.printf("Total de moedas do Cofrinho Convertidas para O Real: %.2f", conversao); // Imprime o total convertido
        System.out.println();
    }
}
