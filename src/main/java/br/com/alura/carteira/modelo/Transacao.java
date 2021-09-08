package br.com.alura.carteira.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transacao {
	
	private String ticker;
	private BigDecimal preco; // BigDecimal para precisão em operações financeiras
	private int quantidade;
	private LocalDate data; // LocalDate para pegar a data local, e LocalDateTime para pegar data e hora local
	private TipoTransacao tipo;
	
	public Transacao() {
	}
	
	public Transacao (String ticker, LocalDate data, BigDecimal preco, int quantidade, TipoTransacao tipo) {
		this.ticker = ticker;
		this.data = data;
		this.preco = preco;
		this.quantidade = quantidade;
		this.tipo = tipo;
	}
	
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public TipoTransacao getTipo() {
		return tipo;
	}
	public void setTipo(TipoTransacao tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		
		return 
		"Ticker: " + ticker + "\n" + 
		"Data: " + data + "\n" + 
		"Preço: " + preco + "\n" + 
		"Quantidade: " + quantidade + "\n" + 
		"Tipo: " + tipo;
	}
	
}
