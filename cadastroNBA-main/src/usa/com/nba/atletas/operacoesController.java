package usa.com.nba.atletas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

@SuppressWarnings("unused")
public class operacoesController {
	
	@FXML
	public TextField txfName;
	
	@FXML
	public TextField txfSoname;
	
	@FXML
	public TextField txfIdade;
	
	@FXML
	public TextField txfEquipe;
	
	@FXML
	public TextField txfPosicao;
	
	@FXML
	public Button btnCadastrar;
	
	class OperacoesBanco {
		 public static void inserirAluno(classeDesenvolvedor dev) {
		     String sql = "INSERT INTO tabelaatletas (id, nome, sobrenome) VALUES (?, ?, ?)";
		     try (Connection conexao = Conexao.conectar();
		          PreparedStatement pstmt = conexao.prepareStatement(sql)) {
		         pstmt.setInt(1, 1);
		         pstmt.setString(2, txfName.getText());
		         pstmt.setString(3, txfSoname.getText());
			 pstmt.setString(4, txfIdade.getText());
			 pstmt.setString(5, txfEquipe.getText());
		         pstmt.executeUpdate();
		     } catch (SQLException e) {
		         e.printStackTrace();
		     }
		 }

	//
		 //
	class Conexao{
	    private static final String URL = "jdbc:mysql://localhost:3306/dev_db";
	    private static final String USUARIO = "root";
	    private static final String SENHA = "etec";

	    public static Connection conectar() throws SQLException {
	        return DriverManager.getConnection(URL, USUARIO, SENHA);
	    }

	    public static void fechar(Connection conexao) {
	        if (conexao != null) {
	            try {
	                conexao.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
	
}
