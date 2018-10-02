package pacote;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FXMLTelaCadastroClienteController {

    @FXML
    private Button btnSalvar;

    @FXML
    void Salvar(ActionEvent event) {
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
