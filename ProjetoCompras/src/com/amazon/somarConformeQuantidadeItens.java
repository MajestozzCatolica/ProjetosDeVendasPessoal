package com.amazon;

public class somarConformeQuantidadeItens {
	public static double somarConformeQuantidade(double quantidadeItens, float precoIten, float precoFinal) {
		if(quantidadeItens > 1){
		precoFinal = (float) (quantidadeItens * precoIten);
		}
		return precoFinal;
	}

}
