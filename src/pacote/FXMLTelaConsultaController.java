package pacote;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FXMLTelaConsultaController {
	

    @FXML
    private Button btnVoltar;
    
    @FXML
    private TextField txtBusca;
    
    @FXML
    private Button btnBuscar;

    @FXML
    private TextArea txtConsulta;
    
    @FXML
    private Button btnExcluir;
    
    @FXML
    void Excluir(ActionEvent event) {
    	txtConsulta.setText("");
    	txtBusca.setText("");
    	

    }

    @FXML
    void Buscar(ActionEvent event) {
    	if(txtBusca.getText().trim().equals("1")) {
    		txtConsulta.setText("2 PASTEL DE CARNE" + "\n" +"3 PASTEL DE QUEIJO" + "\n" + "R$25,00");
    	}
    	else if(txtBusca.getText().trim().equals("2")) {
    		txtConsulta.setText("3 PASTEL DE CARNE" + "\n" + "R$15,00");
    	}
    	else if(txtBusca.getText().trim().equals("3")) {
    		txtConsulta.setText("3 PASTEL DE CARNE" + "\n" +"3 PASTEL ESPECIAL" + "\n" +"R$30,00");
    	}

    }

    @FXML
    void Voltar(ActionEvent event) {
    	Stage primaryStage = new Stage();
    	Pane root;
		
		try {
			//Carrega o arquivo FXML com a definição da tela
			root = (Pane)FXMLLoader.load(getClass().getResource("TelaPrincipal.fxml"));
			
			//Define a sena principal (janela)
			Scene scene = new Scene(root, 600, 500);
			
			//Carrega o arquivo CSS
			scene.getStylesheets().add(getClass().getResource("TelaPrincipal.css").toExternalForm());
			
			//Faz a mágica...
			primaryStage.setScene(scene);
			primaryStage.show();
			//btnLogin.setOnAction((e) -> Platform.exit());
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

    }

}
