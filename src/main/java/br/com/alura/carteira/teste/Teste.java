package br.com.alura.carteira.teste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.alura.carteira.modelo.TipoTransacao;
import br.com.alura.carteira.modelo.Transacao;

public class Teste {
	
	public static void main(String[] args) {
		
		Transacao t = new Transacao();
		
		t.setTicker("ITSA4");
		t.setPreco(new BigDecimal("25.0"));
		t.setQuantidade(20);
		t.setData(LocalDate.now());
		t.setTipo(TipoTransacao.COMPRA); // Para utilizar Enums
		
		System.out.println(t.getTicker());
		System.out.println(t.getPreco());
		System.out.println(t.getQuantidade());
		System.out.println(t.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // Para formatar a data para o padrão BR
		System.out.println(t.getTipo());
	}
}
