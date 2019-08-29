package objetos;

import java.sql.Time;

public class Abstratos {
	
	class Aula{
		String sala;
		float frequencia;
		String professor;
		Time horario;
		
		public void FazerFrequencia() {
		
		}
		public void AplicarAvaliacao() {
			
		}
		public void PassarAtividade() {
			
		}
	}
	
	class Pedido{
		float valor;
		String produto;
		String comprador;
		int quantidade;
		String forma_pagamento;
		
		public void FinalizarPedido() {
			
		}
		public void AlterarQuantidade() {
			
		}
		public void AlterarFormadePagamento() {
			
		}
	}
}
