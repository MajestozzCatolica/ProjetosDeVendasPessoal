package com.amazon;

	public class CadastroProdutos {
		private String nomeIten;
		private double quantidadeItens;
		private float precoIten;
	    
		public CadastroProdutos(String nomeIten, double quantidadeItens, float precoIten) {
			this.nomeIten = nomeIten;
			this.quantidadeItens = quantidadeItens;
			this.precoIten = precoIten;
		}

		public String getNomeIten() {
			return nomeIten;
		}
		public double getQuantidadeItens() {
			return quantidadeItens;
		}
		public float getPrecoIten() {
			return precoIten;
		}
	    }
	
	


