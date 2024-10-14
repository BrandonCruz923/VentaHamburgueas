package application;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import application.Ingredientes;

public class PersonalizarHamburguesaController extends Ingredientes {
	
	  

	@FXML
	private Button btnCalcular;

    @FXML
    private Button btnAgregar;

    @FXML
    private CheckBox checkCarne;

    @FXML
    private CheckBox checkJitomate;

    @FXML
    private CheckBox checkLechuga;

    @FXML
    private CheckBox checkPepinillos;

    @FXML
    private CheckBox checkPredeterminada;

    @FXML
    private CheckBox checkQueso;

    @FXML
    private CheckBox checkSalsa;

    @FXML
    private AnchorPane pane;
   
    @FXML
    private Label lblTotal;

    @FXML
    private TextField txtPrecioTotal;
    
    private int precioHamburguesa;
    
    public int getPrecioHamburguesa() {
		return precioHamburguesa;
	} 
    
    Ingredientes ing = new Ingredientes(getPrecioCarne(), getPrecioQueso(), getPrecioPepino(), getPrecioSalsa(), getPrecioLechuga(),getPrecioJitomate());
   
	public void setPrecioHamburguesa(int precioHamburguesa) {
		this.precioHamburguesa = precioHamburguesa;
		
		 // Carga El Precio De la Hamburguesa para  visualizar el costo de su Hamburguesa
        txtPrecioTotal.setText(String.valueOf(precioHamburguesa));
	}


	@FXML
    void btnCalcular_OneClick(ActionEvent event) {
		int precioAcumulado = precioHamburguesa;
		  if (checkCarne.isSelected()) {
			  precioAcumulado += ing.getPrecioCarne();
		  }
		  if (checkQueso.isSelected()) {
			  precioAcumulado += ing.getPrecioQueso();
		  }
		  if (checkJitomate.isSelected()) {
			  precioAcumulado += ing.getPrecioJitomate();
		  }
		  if (checkSalsa.isSelected()) {
			  precioAcumulado += ing.getPrecioSalsa();
		  }
		  
		  if (checkPepinillos.isSelected()) {
			  precioAcumulado += ing.getPrecioPepino();
		  }
		  if (checkLechuga.isSelected()) {
			  precioAcumulado += ing.getPrecioLechuga();
		  }

	        // Mostrar el subtotal en el campo de texto
	        txtPrecioTotal.setText(String.valueOf(precioAcumulado));

    }
    
    
    @FXML
    void btnAgregarOne_Click(ActionEvent event) {
    	String precioFinal = txtPrecioTotal.getText();
    	JOptionPane.showMessageDialog(null,"Se Agreagado Correctamente Su Hamburguesa: "+precioFinal);

    }


    @FXML
    void predetermindo_checkbox(ActionEvent event) {
    	

    }

}
