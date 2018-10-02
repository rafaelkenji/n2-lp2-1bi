package pacote;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class TelaPrincipalController {
	
	
	public void AbreTela(String telafxml, String telacss,int vertical, int horizontal) {
		Stage primaryStage = new Stage();
    	Pane root;
		
		try {
			//Carrega o arquivo FXML com a definição da tela
			root = (Pane)FXMLLoader.load(getClass().getResource(telafxml));
			
			//Define a sena principal (janela)
			Scene scene = new Scene(root, vertical, horizontal);
			
			//Carrega o arquivo CSS
			scene.getStylesheets().add(getClass().getResource(telacss).toExternalForm());
			
			//Faz a mágica...
			primaryStage.setScene(scene);
			primaryStage.show();
			
    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

    @FXML
    private Button BtnSair;

    @FXML
    private Button BtnCadFunc;

    @FXML
    private Button BtnConsultaPedido;

    @FXML
    private Button BtnCadCliente;

    @FXML
    private Button BtnNovaVenda;

    @FXML
    void NovaVenda(ActionEvent event) {
    	AbreTela("TelaPedido.fxml","TelaPedido.css", 600, 500);

    }

    @FXML
    void CadCliente(ActionEvent event) {
    	AbreTela("TelaCadastroCliente.fxml","TelaCadastroCliente.css",600,500);
    }

    @FXML
    void CadFunc(ActionEvent event) {	
    	AbreTela("TelaCadastroFunc.fxml","TelaCadastroFunc.css",600,500);
    }

    @FXML
    void Consulta(ActionEvent event) {
    	AbreTela("TelaConsulta.fxml","TelaConsulta.css",600,500);
    	
    }

    @FXML
    void Sair(ActionEvent event) {
    	AbreTela("FXAppOne.fxml","FXAppOne.css",600,500);
    	
    }

}
