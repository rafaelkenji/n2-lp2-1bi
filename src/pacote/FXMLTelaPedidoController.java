package pacote;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pacote1.MomentoPag;
import pacote1.Produto;
import pacote1.TipoPag;

public class FXMLTelaPedidoController implements Initializable {

    @FXML
    private ComboBox<Produto> cbProduto;
    private List<Produto> produtos = new ArrayList<>();
    private ObservableList<Produto> obsProdutos;
    
    
    @FXML
    private ComboBox<TipoPag> cbTipoPag;
    private List<TipoPag> tipos = new ArrayList<>();
    private ObservableList<TipoPag> obsTipos;
    
    @FXML
    private ComboBox<MomentoPag> cbMomento;
    private List<MomentoPag> momento = new ArrayList<>();
    private ObservableList<MomentoPag> obsmomento;
    
    @FXML
    private Button btnMais;

    @FXML
    private Button btnMenos;
    
    @FXML
    private Button btnConfirmar;
    
    @FXML
    void Confirma(ActionEvent event) {
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


    @FXML
    void Tirar(ActionEvent event) {
    	int qtdC;
    	int qtdQ;
    	int qtdE;
    	Produto produto = cbProduto.getSelectionModel().getSelectedItem();
    	if(produto.getNome() == "Pastel de Carne")
    	{
    		qtdC = Integer.parseInt(lbCarne.getText());
    		qtdC -= 1;
    		if(qtdC < 0) {
    			lbCarne.setText("0");
    		}
    		else {
    		lbCarne.setText(Integer.toString(qtdC));
    		}
    	}
    	else if(produto.getNome() == "Pastel de Queijo"){
    		qtdQ = Integer.parseInt(lbQueijo.getText());
    		qtdQ -= 1;
    		if(qtdQ < 0) {
    			lbQueijo.setText("0");
    		}
    		else {
    		lbQueijo.setText(Integer.toString(qtdQ));
    		}
    	}
    	else {
    		qtdE = Integer.parseInt(lbEspecial.getText());
    		qtdE -= 1;
    		if(qtdE < 0) {
    			lbEspecial.setText("0");
    		}
    		else {
    			lbEspecial.setText(Integer.toString(qtdE));
    		}
    		
    	}
    }
    
    @FXML
    void Add(ActionEvent event) {
    	int qtdC;
    	int qtdQ;
    	int qtdE;
    	Produto produto = cbProduto.getSelectionModel().getSelectedItem();
    	if(produto.getNome() == "Pastel de Carne")
    	{
    		qtdC = Integer.parseInt(lbCarne.getText());
    		qtdC += 1;
    		lbCarne.setText(Integer.toString(qtdC));
    	}
    	else if(produto.getNome() == "Pastel de Queijo"){
    		qtdQ = Integer.parseInt(lbQueijo.getText());
    		qtdQ += 1;
    		lbQueijo.setText(Integer.toString(qtdQ));
    	}
    	else {
    		qtdE = Integer.parseInt(lbEspecial.getText());
    		qtdE += 1;
    		lbEspecial.setText(Integer.toString(qtdE));
    	}
    }
    
    
    @FXML
    private Label lbEspecial;
    @FXML
    private Label lbQueijo;
    @FXML
    private Label lbCarne;

    
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		carregarProdutos();
		carregarTipos();
		carregarMomento();
	}
	
	public void carregarProdutos() {
		
		Produto produto1 = new Produto(1,"Pastel de Carne");
		Produto produto2 = new Produto(2,"Pastel de Queijo");
		Produto produto3 = new Produto(3,"Pastel Especial");
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		
		obsProdutos = FXCollections.observableArrayList(produtos);
		
		cbProduto.setItems(obsProdutos);
		
	}
	
	public void carregarTipos() {
		
		TipoPag tipo1 = new TipoPag(1,"Dinheiro");
		TipoPag tipo2 = new TipoPag(2,"Cartão de Crédito");
		TipoPag tipo3 = new TipoPag(3,"Cartão de Débito");
		
		
		tipos.add(tipo1);
		tipos.add(tipo2);
		tipos.add(tipo3);
		
		
		obsTipos = FXCollections.observableArrayList(tipos);
		
		cbTipoPag.setItems(obsTipos);
		
	}
	
	public void carregarMomento() {
		
		MomentoPag momento1 = new MomentoPag(1,"Em casa");
		MomentoPag momento2 = new MomentoPag(2,"No estabelecimento");
		
		
		
		momento.add(momento1);
		momento.add(momento2);
		
		
		
		obsmomento = FXCollections.observableArrayList(momento);
		
		cbMomento.setItems(obsmomento);
		
	}

}
