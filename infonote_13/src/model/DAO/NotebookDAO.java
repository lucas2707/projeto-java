package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.*;
import util.*;

public class NotebookDAO {
	
	Configurador config = new Configurador();
	String url;
	String driver;
	String login;
	String senha;
	
	public NotebookDAO() {
		url = config.getUrl();
		driver = config.getDriver();
		login = config.getLogin();
		senha = config.getSenha();
		}
	

	public static Notebook inserir(String modelo, String descricao, String dataCadastro,
			String figura, int estoque, double precoUnitario, String serialNote) {
			Notebook notebook = null;
			NotebookDAO noteDAO = new NotebookDAO();
			
			try {
			
			String sql = "insert into notebook " +
			"(dataCadastro, descricao, figura, modelo, serialNote, estoque, precoUnitario) " +
			"values (?,?,?,?,?)";
			
			Conexao conex = new Conexao(noteDAO.url, noteDAO.driver,
					noteDAO.login, noteDAO.senha);
			
			Connection con = conex.obterConexao();
			
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setString(1, dataCadastro);
			comando.setString(2, descricao);
			comando.setString(3, figura);
			comando.setString(4, modelo);
			comando.setString(5, serialNote);
			comando.setInt(6, estoque);
			comando.setDouble(7, precoUnitario);
			
			comando.executeUpdate();
			
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}
			
			notebook = new Notebook(dataCadastro, descricao,
			figura, modelo, serialNote, estoque, precoUnitario);
			return notebook;
			}
	
	public static Notebook[] buscarTodos(){
		Notebook[] notebooks = null;
		NotebookDAO noteDAO = new NotebookDAO();
		
		try {
		
		String sql = "Select * from notebook";
		
		Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);
		Connection con = conex.obterConexao();
	
		
		Statement comando = con.createStatement();
		
		ResultSet rs = comando.executeQuery(sql);
		
		notebooks = new Notebook[10];
		
		
		int i = 0;
		while (rs.next()) {
		notebooks[i++] = new Notebook(
				
		rs.getString("dataCadastro"),
		rs.getString("descricao"),
		rs.getString("figura"),
		rs.getString("modelo"),
		rs.getString("serialNote"),
		rs.getInt("estoque"),
		rs.getDouble("precoUnitario"));
		}
	
		rs.close();
		comando.close();
		con.close();
		} catch (Exception e){
		System.out.println(e.getMessage());
		}
		return notebooks;
		}
	
	public static Notebook excluir(String id){
		Notebook notebooks = null;
		NotebookDAO noteDAO = new NotebookDAO();
		
		try {
		
		String sql = "delete from notebook where serialnote = ?";
		
		Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);
		
		Connection con = conex.obterConexao();
	
		
		PreparedStatement comando = con.prepareStatement(sql);
		
		comando.setString(1,id);
		comando.executeUpdate();
		
		
		comando.executeUpdate();
		
		} catch(Exception e){
		System.out.println(e.getMessage());
		}
		
		return notebooks;
		}
	
public static Notebook atualizar(String descricao, String dataCadastro,
		String figura, int estoque, double precoUnitario, String serialNote){
	
	Notebook notebooks = null;
	NotebookDAO noteDAO = new NotebookDAO();
	
	try {
	
	String sql =  "update notebook set "
			+ " descricao = ?, estoque = ?, precoUnitario = ?, "
			+ " figura = ?, dataCadastro = ? "
			+ " where "
			+ " serialnote = ? ";
	
	Conexao conex = new Conexao(noteDAO.url, noteDAO.driver, noteDAO.login, noteDAO.senha);
	
	Connection con = conex.obterConexao();


	PreparedStatement comando = con.prepareStatement(sql);
	comando.setString(1,descricao);
	comando.setString(2,dataCadastro);
	comando.setString(3,figura);
	comando.setInt(4,estoque);
	comando.setDouble(5,precoUnitario);

	comando.executeUpdate();
	} catch(Exception e){
	System.out.println(e.getMessage());
	}
	return notebooks;
	}
}
