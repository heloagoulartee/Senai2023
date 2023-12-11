package br.org.sesisp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.mysql.jdbc.PreparedStatement;
import br.org.sesisp.controller.conexao;
import br.org.sesisp.model.Cliente;

public class CrudDAO {
	
	//CRUD C-Create R - Read U - Update D - Delete
	
	//CREATE (inserir dados)
		public void create(Cliente Cliente) {
			String sql = "INSERT INTO sitesesi(login, senha) VALUES (?, ?)";
			Connection conn = null;
			PreparedStatement p = null;
			try {
				conn = conexao.criandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);//cast
				p.setString(1, Cliente.getNome());
				p.setInt(2, Cliente.getSenha());
				p.execute();
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "erro ao inserir dados!! \nERRO " + e);
			}finally {
				try {
					if (p != null);
				}catch(Exception e) {
					e.printStackTrace();
			}
			}
	}//fim CREATE
		//*****************
		
		//método update
		public void update(Cliente aluno) {
			String sql = "UPDATE sitesesi SET login = ?, senha = ? WHERE id = ?"; //atualizo o nome e a idade quando o ra for...
			Connection conn = null;
			PreparedStatement p = null;//link com banco
			try {
				conn = conexao.criandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);//cast
				p.setString(1, aluno.getNome());
				p.setInt(2, aluno.getSenha());
				p.execute();//grava dados no banco 
				JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso");
				System.out.println("Dados atualizados com sucesso");
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso");
			}
			}
			
//fim classe CRUD
// R - Read
public List <Cliente> read(){
	String sql = "SELECT * FROM sitesesi";
	List<Cliente> Cliente = new ArrayList<Cliente>();
	Connection conn = null;
	PreparedStatement p = null;
	ResultSet resultado = null;
	
	try {
		conn = conexao.criandoConexao();
		p = (PreparedStatement) conn.prepareStatement(sql);//cast
		resultado = p.executeQuery();
				while(resultado.next()) {
					Cliente ver_aluno = new Cliente();
					ver_aluno.setNome(resultado.getString("nome"));
					ver_aluno.setSenha(resultado.getInt("senha"));
					Cliente.add(ver_aluno);
				}
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if (p != null);
		}catch(Exception e) {
			e.printStackTrace();
	}
	}
	return Cliente;
	}
	//D - Delete
	public boolean delete (int login) {
		String sql = "DELETE FROM sitesesi WHERE id = ?";
			Connection conn = null;
			PreparedStatement p = null;
			try {
				conn = conexao.criandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);//cast
				p.setInt(1, login);
				p.execute();
				JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");
				System.out.println("Dados excluidos com sucesso");
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao excluir dados");
			}finally {
				try {
					if (p != null);
				}catch(Exception e) {
					e.printStackTrace();
			}
	}
			return false;
	}
}

