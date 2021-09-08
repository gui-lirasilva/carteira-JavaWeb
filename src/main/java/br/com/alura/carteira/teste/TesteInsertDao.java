package br.com.alura.carteira.teste;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;

import br.com.alura.carteira.dao.TransacaoDao;
import br.com.alura.carteira.modelo.TipoTransacao;
import br.com.alura.carteira.modelo.Transacao;

public class TesteInsertDao {

	public static void main(String[] args) {

		try {
			String url = "jdbc:mysql://localhost:3306/carteira?useTimezone=true&serverTimezone=UTC";
			String usuario = "root";
			String senha = "133708";

			Connection conexao = DriverManager.getConnection(url, usuario, senha);

			TransacaoDao dao = new TransacaoDao(conexao);

			Transacao transacao = new Transacao("BIDI4", LocalDate.now(), new BigDecimal("25.00"), 100,
					TipoTransacao.COMPRA);

			dao.cadastrar(transacao);
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro!");
		}
	}
}