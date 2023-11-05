package view;

import javax.swing.JOptionPane;

import Controller.ControllerPredioComercial;
import model.Loja;

public class Principal {

	public static void main(String[] args) throws Exception {
		ControllerPredioComercial c = new ControllerPredioComercial();

		Loja d;
		d = new Loja(0, "celulares e smartphones", "Artigos para telefonia móvel");
		c.add(d);
		d = new Loja(0, "tv e vídeo", "Artigos para televisores");
		c.add(d);
		d = new Loja(0, "consoles e games", "Artigos para video games");
		c.add(d);
		d = new Loja(0, "áudio", "Artigos de som");
		c.add(d);
		d = new Loja(0, "telefonia fixa", "Artigos para telefonia");
		c.add(d);
		d = new Loja(0, "informática", "Computadores e laptops corporativos");
		c.add(d);
		d = new Loja(0, "acessórios e periféricos", "Hardwares");
		c.add(d);
		d = new Loja(0, "pc gamer", "Computadores e laptops gamers");
		c.add(d);
		d = new Loja(1, "eletrodomésticos", "Artigos Eletrodomésticos");
		c.add(d);
		d = new Loja(1, "eletroportáteis", "Artigos Eletroportáteis");
		c.add(d);
		d = new Loja(1, "ar e ventilação", "Ventiladores e Ar condicionado");
		c.add(d);
		d = new Loja(1, "móveis e decoração", "Móveis");
		c.add(d);
		d = new Loja(1, "casa e construção", "Materiais para construção");
		c.add(d);
		d = new Loja(1, "cama, mesa e banho", "Artigos para cama, mesa e banho");
		c.add(d);
		d = new Loja(2, "livros", "Livraria");
		c.add(d);
		d = new Loja(2, "instrumentos musicais", "Instrumentos músicas e acessórios");
		c.add(d);
		d = new Loja(2, "música", "Discos");
		c.add(d);
		d = new Loja(2, "filmes e séries", "DVD e Blu-ray");
		c.add(d);
		d = new Loja(3, "mercado", "Itens de supermercado");
		c.add(d);
		d = new Loja(3, "automotivo", "Peças e acessórios para automóveis");
		c.add(d);
		d = new Loja(3, "brinquedos", "Itens infantis");
		c.add(d);
		d = new Loja(3, "bebês", "Itens para a primeira infância");
		c.add(d);
		d = new Loja(3, "gift cards", "Cartões presente");
		c.add(d);
		d = new Loja(3, "pet shop", "Comida e acessórios para pet");
		c.add(d);
		d = new Loja(3, "papelaria", "Itens de papelaria");
		c.add(d);

		int r = 0;

		do {
			r = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - Adicionar Departamento\n2 - Pesquisar Departamento \n3 - Remover Departamento\n9 - Sair"));

			switch (r) {
			case 1: { // Adiciona
				Loja departamento = new Loja();
				int cont = 0;
				do {
					departamento.andar = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do andar"));
					if (departamento.andar >= 0 && departamento.andar < 4) {
						departamento.nome = JOptionPane.showInputDialog("Insira o nome do departamento");
						departamento.descricao = JOptionPane.showInputDialog("Descreva o departamento:");
						
						c.add(departamento);
						cont++;
					} else {
						JOptionPane.showMessageDialog(null, "Andar inválido!");
					}
				} while (cont == 0);
				break;
			}
			case 2: { // Pesquisa
				c.PesquisaDepartamento(JOptionPane.showInputDialog("Insira o nome do departamento para procurá-lo"));
				break;

			}

			case 3: { // Remove
				c.remove(JOptionPane.showInputDialog("Digite o nome do departamento para removê-lo"));
				break;
			}

			case 9: { // Sai
				System.err.println("Saindo...");
				break;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + r);
			}

		} while (r != 9);

	}

}
