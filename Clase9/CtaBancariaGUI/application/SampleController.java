/**
 * Sample Skeleton for 'Sample.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.text.NumberFormat;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener.Change;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.cell.PropertyValueFactory;


public class SampleController {

	private final ObservableList<CtaBancaria> data = FXCollections.observableArrayList();
		    
	
	@FXML
    void add(ActionEvent event) {
         Alert alert = new Alert(AlertType.INFORMATION);
         alert.setTitle("Información");
         alert.setHeaderText("Texto informativo");
         alert.setContentText("Cta : "+ txtCta.getText() + "\nTitular : " + txtTitular.getText() + "\nSaldo : " + txtSaldo.getText());
         alert.showAndWait();
         try {
				String cta = txtCta.getText();
				String tit = txtTitular.getText();
				long saldo = Long.parseLong(txtSaldo.getText());

				data.add(new CtaBancaria(tit, cta, saldo));
				
				txtCta.setText(null);
				txtTitular.setText(null);
				txtSaldo.setText(null);
				

			} catch (Exception e) {
				Alert alert2 = new Alert(AlertType.ERROR);
				alert2.setTitle("Error");
				alert2.setHeaderText("No se pudo agregar");
				alert2.setContentText(e.getMessage());
				alert2.showAndWait();
			}
              
    }

    @FXML
    void cancel(ActionEvent event) {
    	 Platform.exit();
    }
    

    @FXML
    void mostrar(ActionEvent event) {
    	TableViewSelectionModel<CtaBancaria> tsm = tabla.getSelectionModel();
    	CtaBancaria cta = tsm.getSelectedItem();
		if (cta != null) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Información");
			alert.setHeaderText("Cta Seleccionada:" + cta.getNumero());
			alert.setContentText(cta.getEstado());
			alert.showAndWait();
		}
    }

    @FXML
    void deposito(ActionEvent event) {
    	TableViewSelectionModel<CtaBancaria> tsm = tabla.getSelectionModel();
    	CtaBancaria cta = tsm.getSelectedItem();
    	if (cta != null) {
    		TextInputDialog dg = new TextInputDialog();
    		dg.setTitle("Deposito");
    		dg.setHeaderText("Monto");
    		Optional<String> result = dg.showAndWait();
    		
    		result.ifPresent( monto -> { try {
				                             cta.deposito(Long.parseLong(monto));
			                             } catch (Exception e) {
				                           Alert alert2 = new Alert(AlertType.ERROR);
				                           alert2.setTitle("Error");
				                           alert2.setHeaderText("No se pudo hacer el depósito");
					                       alert2.setContentText(e.getMessage());
					                       alert2.showAndWait();
			                             }});
    		tabla.refresh();
        }
    }
    
    @FXML
    void extraccion(ActionEvent event) {
		TableViewSelectionModel<CtaBancaria> tsm = tabla.getSelectionModel();
		CtaBancaria cta = tsm.getSelectedItem();
		if (cta != null) {
			TextInputDialog dg = new TextInputDialog();
			dg.setTitle("Extracción");
			dg.setHeaderText("Monto");
			Optional<String> result = dg.showAndWait();

			result.ifPresent(monto -> {
				try {
					cta.extraccion(Long.parseLong(monto));
				} catch (Exception e) {
					Alert alert2 = new Alert(AlertType.ERROR);
					alert2.setTitle("Error");
					alert2.setHeaderText("No se pudo hacer la extración");
					alert2.setContentText(e.getMessage());
					alert2.showAndWait();
				}
			});
			tabla.refresh();
		}
    }
    
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btAdd"
    private Button btAdd; // Value injected by FXMLLoader

    @FXML // fx:id="btCancel"
    private Button btCancel; // Value injected by FXMLLoader

    @FXML // fx:id="txtCta"
    private TextField txtCta; // Value injected by FXMLLoader

    @FXML // fx:id="txtSaldo"
    private TextField txtSaldo; // Value injected by FXMLLoader

    @FXML // fx:id="txtTitular"
    private TextField txtTitular; // Value injected by FXMLLoader

    @FXML // fx:id="btMostrar"
    private Button btMostrar; // Value injected by FXMLLoader

    @FXML // fx:id="tabla"
    private TableView<CtaBancaria> tabla; // Value injected by FXMLLoader

   

    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	UnaryOperator<javafx.scene.control.TextFormatter.Change> integerFilter = change -> {
    	    String input = change.getText();
    	    if (input.matches("[0-9]*")) { 
    	        return change;
    	    }
    	    return null;
    	};

    	txtSaldo.setTextFormatter(new TextFormatter<String>(integerFilter));
    	
        assert btAdd != null : "fx:id=\"btAdd\" was not injected: check your FXML file 'Sample.fxml'.";
        assert btCancel != null : "fx:id=\"btCancel\" was not injected: check your FXML file 'Sample.fxml'.";
        assert txtCta != null : "fx:id=\"txtCta\" was not injected: check your FXML file 'Sample.fxml'.";
        assert txtSaldo != null : "fx:id=\"txtSaldo\" was not injected: check your FXML file 'Sample.fxml'.";
        assert txtTitular != null : "fx:id=\"txtTitular\" was not injected: check your FXML file 'Sample.fxml'.";

          
        TableColumn<CtaBancaria,String> colCta = new TableColumn<CtaBancaria,String>("Cta");
	    colCta.setCellValueFactory( new PropertyValueFactory<CtaBancaria,String>("numero"));

		TableColumn<CtaBancaria,String> colTitular = new TableColumn<CtaBancaria,String>("Titular");
		colTitular.setCellValueFactory(new PropertyValueFactory<CtaBancaria,String>("titular"));
		
		TableColumn<CtaBancaria,Long> colSaldo = new TableColumn<CtaBancaria,Long>("Saldo");
		colSaldo.setCellValueFactory(new PropertyValueFactory<CtaBancaria, Long>("saldo"));
		
		
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		colSaldo.setCellFactory(tc -> new TableCell<CtaBancaria, Long>() {

		    @Override
		    protected void updateItem(Long saldo, boolean empty) {
		        super.updateItem(saldo, empty);
		        if (empty) {
		            setText(null);
		        } else {
		            setText(currencyFormat.format(saldo));
		        }
		    }
		});
		
		tabla.setItems(data);
		tabla.getColumns().addAll(colCta,colTitular,colSaldo);
		
		
		//tabla.getColumns().add((TableColumn<CtaBancaria, String>) colCta);
		//tabla.getColumns().add(colTitular);
		//tabla.getColumns().add(colSaldo);
    }

}