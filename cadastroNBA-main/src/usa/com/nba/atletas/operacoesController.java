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
	
}
