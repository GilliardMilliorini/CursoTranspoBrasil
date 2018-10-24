package br.com.cursojava.aula029;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO implements RepositorioContato {

	@Override
	public List<Contato> buscarTodos() {
		
		List<Contato> contatos = new ArrayList<>();
		try{
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select * from contatos");
			ResultSet cursor = comando.executeQuery();
			while (cursor.next()){
				contatos.add(carregarContato(cursor));
			}
		cursor.close();
		comando.close();
		} catch(SQLException e){
			System.out.println("Não foi possivel carregar sua lista de contatos");
		}
		
		
		return contatos;
	}

	private Contato carregarContato(ResultSet cursor) throws SQLException {
		
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		String email = cursor.getString("email");
		String telefone = cursor.getString("telefone");
		
		
		return new Contato (id, nome, email, telefone);
	}

	@Override
	public List<Contato> buscarporNome(String nome) {
		List<Contato> contatos = null;
		if(nome  != null){
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("select * from contatos where nome like ?");
				comando.setString(1, "%"+nome+"%");
				ResultSet cursor = comando.executeQuery();
				if(cursor.next()){
					contatos = (List<Contato>) carregarContato(cursor);
				}
			}catch (SQLException e){
				System.out.println("não foi possivel busscar seus contatos por nome");
			}
			
		}
				
		return contatos;
	}

	@Override
	public Contato buscarPorTelefone(String telefone) {
		
		List<Contato> contatos = null;
		if(telefone  != null){
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("select * from contatos where telefone = ?");
				comando.setString(1,((Contato) contatos).getTelefone());
				ResultSet cursor = comando.executeQuery();
				if(cursor.next()){
					contatos = (List<Contato>) carregarContato(cursor);
				}
			}catch (SQLException e){
				System.out.println("não foi possivel busscar seus contatos por Telefone");
			}
			
		}
				
		return (Contato) contatos;
	}

	@Override
	public Contato buscarPorId(Integer id) {

		return null;
	}

	@Override
	public void inserir(Contato contato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Contato contato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int contar() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
