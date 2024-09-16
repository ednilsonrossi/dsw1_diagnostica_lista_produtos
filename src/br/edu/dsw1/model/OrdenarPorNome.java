package br.edu.dsw1.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarPorNome implements OrdenacaoStrategy {

	@Override
	public void ordenar(List<Produto> produtos) {
		
		Collections.sort(produtos, Comparator.comparing(Produto::getNome));
		
	}

}
