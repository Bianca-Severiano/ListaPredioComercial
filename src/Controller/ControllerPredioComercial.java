package Controller;

import bilbioteca.fila.dinamica.generica.model.Lista;
import model.Loja;

public class ControllerPredioComercial {

	Lista<Loja>[] lojas = new Lista[4];

	public ControllerPredioComercial() {
		int tamanho = lojas.length;
		for (int i = 0; i < tamanho; i++) {
			lojas[i] = new Lista<Loja>();
		}
	}
	
	public int hash(Loja loja) {
		return loja.andar;
	}

	public void add(Loja loja) throws Exception {
		int hash = hash(loja);
		if (lojas[hash].isEmpty()) {
			lojas[hash].addFirst(loja);
		}
		lojas[hash].addLast(loja);
		System.out.println("Departamento " + loja.nome + " foi adicionado no andar " + loja.andar);
	}

	public void remove(String nome) throws Exception {
		int tamanho = lojas.length;
		for (int i = 0; i < tamanho; i++) {
			Lista<Loja> l = lojas[i];
			int tamanhoL = l.size();
			for (int j = 0; j < tamanhoL; j++) {
				Loja d = l.get(j);
				if (nome.equals(d.nome)) {
					l.remove(j);
					System.out.println("Departamento " + d.nome + " foi removido!");
				}
			}
		}
	}

	public void PesquisaDepartamento(String nome) throws Exception {
		int tamanho = lojas.length;
		int cont = 0;
		for (int i = 0; i < tamanho; i++) {
			Lista<Loja> l = lojas[i];
			int tamanhoL = l.size();
			for (int j = 0; j < tamanhoL; j++) {
				Loja d = l.get(j);
				if (nome.equals(d.nome)) {
					System.out.println(d);
					System.out.println("Departamento " + d.nome + " foi localizado no andar " + d.andar);
					cont++;
				}
			}
		}

		if (cont == 0) {
			System.out.println("Departamento não localizado");
		}
	}

	public void conta() throws Exception {
		int total = 0;
		for (int i = 0; i < lojas.length; i++) {
			Lista<Loja> l = lojas[i];
			int tamanho = l.size();
			System.out.println("Linha " + i + ": " + tamanho);
			
			System.out.print("Linha " + i + ":");
			for (int j = 0; j < tamanho; j++) {
				System.out.print( l.get(j)+";");
			}
				
			total = total + tamanho;
			System.out.println("\n------");
		}
		System.out.println("Total: " + total);
		
	}
}
