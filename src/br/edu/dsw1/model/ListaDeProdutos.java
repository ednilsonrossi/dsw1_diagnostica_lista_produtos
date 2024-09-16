package br.edu.dsw1.model;

import java.util.LinkedList;
import java.util.List;

public class ListaDeProdutos {
	private List<Produto> produtos;
	private OrdenacaoStrategy strategy;

	public ListaDeProdutos() {
		produtos = new LinkedList<Produto>();
		strategy = new OrdenarPorNome();
	}

	public void adicionarProduto(Produto produto) {
		if (produto != null) {
			produtos.add(produto);
		}
	}

	public void setOrdenacaoStrategy(OrdenacaoStrategy strategy) {
		if (strategy != null) {
			this.strategy = strategy;
		}
	}

	public void ordenar() {
		strategy.ordenar(produtos);
	}

	public void exibirProdutos() {
		produtos.stream().forEach(System.out::println);
	}
}
