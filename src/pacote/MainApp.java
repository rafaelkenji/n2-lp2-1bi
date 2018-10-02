package pacote;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


//GUSTAVO OLIVEIRA 081160028
//DENNIS LIMA 081160039
//RAFAEL KENJI 081160010
public class MainApp extends Application{
	@Override
	public void start(Stage primaryStage) {
		
		Pane root;
		
		try {
			//Carrega o arquivo FXML com a definição da tela
			root = (Pane)FXMLLoader.load(getClass().getResource("FXAppOne.fxml"));
			
			//Define a sena principal (janela)
			Scene scene = new Scene(root, 600, 500);
			
			//Carrega o arquivo CSS
			scene.getStylesheets().add(getClass().getResource("FXAppOne.css").toExternalForm());
			
			//Faz a mágica...
			primaryStage.setScene(scene);
			primaryStage.show();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	

}
