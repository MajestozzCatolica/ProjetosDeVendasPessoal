package com.amazon;

import java.util.Scanner;

public class InputCadastro {
	

	public static InputCadastro cadastrarProduto() {
		

		Scanner nome = new Scanner(System.in);
		System.out.println("Digite o Produto: ");
		String nomeIten = nome.next();
		
		Scanner quantidade= new Scanner(System.in);
		System.out.println("Digite a Quantidade: ");
		double quantidadeItens = quantidade.nextDouble();
		
		Scanner preco = new Scanner(System.in);
		System.out.println("Digite o Preço: ");
		float precoIten = preco.nextFloat();
		
		CadastroProdutos Produto = new CadastroProdutos(nomeIten, quantidadeItens, precoIten);
		
		System.out.println("Produto Cadastrado com sucesso!");
		return null;
		}

		}
   
	
