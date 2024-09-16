package br.edu.dsw1.view;

import java.util.Scanner;

import br.edu.dsw1.model.ListaDeProdutos;
import br.edu.dsw1.model.OrdenarPorNome;
import br.edu.dsw1.model.OrdenarPorPreco;
import br.edu.dsw1.model.OrdenarPorQuantidade;
import br.edu.dsw1.model.Produto;

public class Main {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		ListaDeProdutos produtos = new ListaDeProdutos();
		int opcao;

		do {
			System.out.println("Opções:");
			System.out.println("1. Adicionar produto");
			System.out.println("2. Listar produtos");
			System.out.println("0. Sair");
			System.out.print("Sua opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			if (opcao == 1) {
				produtos.adicionarProduto(lerProduto());
			} else if (opcao == 2) {
				listarProdutos(produtos);
			}
						
		} while (opcao != 0);
		
		scanner.close();
	}

	private static Produto lerProduto() {
		System.out.println("Nome.......: ");
		var nome = scanner.nextLine();
		System.out.println("Preço......: ");
		var preco = scanner.nextDouble();
		System.out.println("Quantidade.: ");
		var quantidade = scanner.nextInt();
		
		return new Produto(nome, preco, quantidade);
	}
	
	private static void listarProdutos(ListaDeProdutos lista) {
		System.out.println("Escolha a forma de ordenação:");
		System.out.println("1. Ordenar por nome");
		System.out.println("2. Ordenar por preço");
		System.out.println("3. Ordenar por quantidade");
		var escolha = scanner.nextInt();
		
		String text = "Produtos ordenador por ";
		if (escolha == 2 ) {
			lista.setOrdenacaoStrategy(new OrdenarPorPreco());
			text += "preço:\n";
		} else if (escolha == 3) {
			text += "quantidade:\n";
			lista.setOrdenacaoStrategy(new OrdenarPorQuantidade());
		} else {
			text += "nome:\n";
			lista.setOrdenacaoStrategy(new OrdenarPorNome());
		}
		
		System.out.println(text);
		lista.ordenar();
		lista.exibirProdutos();
	}
}
