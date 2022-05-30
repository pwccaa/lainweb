package br.com.caelum;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ContatoDao {
	private Connection connection;
	
	public ContatoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public ContatoDao(Connection connection) {
		this.connection = connection;
	}

	public void add(Contato contato) {
		String sql = "insert into contatos (nome,email,endereco,dataNascimento) values (?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Contato> getLista() {
		try {
			PreparedStatement stmt = connection.prepareStatement("select * from contatos");
			ResultSet rs = stmt.executeQuery();
			List<Contato> contatos = new ArrayList<>();

			while (rs.next()) {
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));

				Contato contato = new Contato(rs.getString("nome"), rs.getString("endereco"), rs.getString("email"), 
						data);
				contato.setId(rs.getLong("id"));

				contatos.add(contato);
			}

			rs.close();
			stmt.close();

			return contatos;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public Contato getContato(long id) {
		try {
			PreparedStatement stmt = connection.prepareStatement("select * from contatos where id = " + id);
			ResultSet rs = stmt.executeQuery();

			Contato contato = null;

			while (rs.next()) {
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));

				contato = new Contato(rs.getString("nome"), rs.getString("email"), rs.getString("endereco"), data);
				contato.setId(rs.getLong("id"));
			}

			rs.close();
			stmt.close();

			return contato;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void change(Contato contato) {
		try {
			PreparedStatement stmt = connection
					.prepareStatement("update contatos set nome=?, email=?, endereco=?, dataNascimento=? where id=?");
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.setLong(5, contato.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Contato contato) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from contatos where id=" + contato.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
