package com.amazon;

import java.util.ArrayList;

public class listaProdutos {
	
	static ArrayList<InputCadastro> listaDeProdutos = new ArrayList<>();
	public static void adicionarIten() {
		listaDeProdutos.add(InputCadastro.cadastrarProduto());
	}
}

