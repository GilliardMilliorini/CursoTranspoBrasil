package br.com.cursojava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements RepositorioProduto {

	private static final String COUNT_PRODUTOS = "select count(*) as quantidade from contatos";
	private static final String DELETE_PRODUTOS = "delete from contatos  where id = ?";
	private static final String UPDATE_PRODUTOS = "update produtos set nome = ?, preco = ?  where id = ?";
	private static final String INSERT_VALUES = "insert into contatos(nome, preco) values(?,?)";
	private static final String SELECT_ID = "select * from produtos where id = ?";
	private static final String SELECT_PRECO = "select * from produtos where preco >= ? and preco <= ?";
	private static final String SELECT_NONE = "select * from produtos where nome = ?";
	private static final String SELECT_ALL_PRODUTOS = "select * from produtos";

	public List<Produto> buscarTodos() {

		List<Produto> produtos = new ArrayList<>();
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement(SELECT_ALL_PRODUTOS);
			ResultSet cursor = comando.executeQuery();
			while (cursor.next()) {
				produtos.add(carregarProdutos(cursor));
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			System.out.println("não foi possivel carregar a lista de todos os produtos do sistema");
		}

		return produtos;
	}

	private Produto carregarProdutos(ResultSet cursor) throws SQLException {

		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		double preco = cursor.getDouble("preco");

		return new Produto(id, nome, preco);
	}

	public List<Produto> buscarPorNome(String nome) {
		List<Produto> produtos = new ArrayList<>();

		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement(SELECT_NONE);
			ResultSet cursor = comando.executeQuery();
			while (cursor.next()) {
				produtos.add(carregarProdutos(cursor));
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			System.out.println("Não foi possivel carregar os dados filtrando por nome");
		}

		return produtos;
	}

	public List<Produto> buscarPorPreco(double minimo, double maximo) {

		List<Produto> produtos = new ArrayList<>();
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement(SELECT_PRECO);
			ResultSet cursor = comando.executeQuery();
			while (cursor.next()) {
				produtos.add(carregarProdutos(cursor));
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			System.out.println("Não foi possivel carregar os dados filtrados por preço");
		}

		return produtos;
	}

	public Produto buscarPorId(Integer id) {
		Produto produto = null;
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement(SELECT_ID);
			ResultSet cursor = comando.executeQuery();
			if (cursor.next()) {
				produto = carregarProdutos(cursor);
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			System.out.println("não foi possivel carregar os dados por ID");
		}

		return produto;
	}

	public void inserir(Produto produto) {
		if (produto != null) {
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement(INSERT_VALUES, Statement.RETURN_GENERATED_KEYS);
				comando.setString(1, produto.getNome());
				comando.setDouble(2, produto.getPreco());
				comando.execute();
				ResultSet cursor = comando.getGeneratedKeys();
				if (cursor.next()) {
					Integer id = cursor.getInt("id");
					produto.setId(id);
				}
				cursor.close();
				comando.close();
			} catch (SQLException e) {
				System.out.println("não foi possivel inserir um novo produto no sistema.");
			}
		}

	}

	public void atualizar(Produto produto) {
		if(produto != null && produto.getId() != null){
			try{
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement(UPDATE_PRODUTOS);
				comando.setString(1, produto.getNome());
				comando.setDouble(2, produto.getPreco());
				comando.setInt(3, produto.getId());
				comando.executeUpdate();
				comando.close();
			} catch(SQLException e){
				System.out.println("não foi possivel atualizar o contato informado.");
			}
		}

	}

	public void remover(Integer id) {
		if(id != null){
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement(DELETE_PRODUTOS);
				comando.setInt(1, id);
				comando.execute();
				comando.close();
			}catch(SQLException e ){
				System.out.println("Não foi possivel remover o item de seu banco de dados.");
			}
		}

	}

	public int contar() {
		int quantidade = 0;
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement(COUNT_PRODUTOS);
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()){
				quantidade = cursor.getInt("quantidade");
			}
			cursor.close();
			comando.close();
		}catch (SQLException e){
			System.out.println("Não foi possivem executar a contagem de produtos");
		}
		
		return quantidade;
	}

}
