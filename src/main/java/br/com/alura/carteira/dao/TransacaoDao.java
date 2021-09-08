package br.com.alura.carteira.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.carteira.modelo.TipoTransacao;
import br.com.alura.carteira.modelo.Transacao;

public class TransacaoDao {

	private Connection conexao;

	public TransacaoDao(Connection conexao) {
		this.conexao = conexao;
	}

	public void cadastrar(Transacao transacao) {

		try {
			String sql = "insert into transacoes(ticker, data, preco, quantidade, tipo) values(?, ?, ?, ?, ?)";

			PreparedStatement ps = conexao.prepareStatement(sql);

			ps.setString(1, transacao.getTicker());
			ps.setDate(2, Date.valueOf(transacao.getData()));
			ps.setBigDecimal(3, transacao.getPreco());
			ps.setInt(4, transacao.getQuantidade());
			ps.setString(5, transacao.getTipo().toString());

			ps.execute();

		} catch (SQLException e) {
			throw new RuntimeException();
		}

	}

	public List<Transacao> listar() {

		try {
			String sql = "select * from transacoes";

			PreparedStatement ps = conexao.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			List<Transacao> transacoes = new ArrayList<>();

			while (rs.next()) {
				Transacao t = new Transacao();
				t.setTicker(rs.getString("ticker"));
				t.setData(rs.getDate("data").toLocalDate());
				t.setPreco(rs.getBigDecimal("preco"));
				t.setQuantidade(rs.getInt("quantidade"));
				t.setTipo(TipoTransacao.valueOf(rs.getString("tipo")));

				transacoes.add(t);
			}

			return transacoes;

		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}
}
