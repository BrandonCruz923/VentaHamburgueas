package application;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
//import application.PedirComboController;

public class PersonalizarComboController {
	
	private static final int precioBebidas = 0; // Bebidas incluidas en el combo, sin costo adicional
    private static final int precioPapasGrandes = 50;
    private static final int precioPapasMedianas = 0; //Las Papas medianas van incluidas con el combo, sin costo adicional
    private static final int precioCarne = 50;

    @FXML
    private CheckBox CheckBox1;

    @FXML
    private CheckBox CheckBox2;

    @FXML
    private CheckBox CheckBox3;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnCalcular;

    @FXML
    private CheckBox complemento1CheckBox;

    @FXML
    private CheckBox complemento2CheckBox;

    @FXML
    private CheckBox complemento3CheckBox;

    @FXML
    private TextField txtPrecioFinal;
    
    private int precioCombo;
    
    

    public int getPrecioCombo() {
		return precioCombo;
	}

	public void setPrecioCombo(int precioCombo) {
		this.precioCombo = precioCombo;
		
		 // Carga El Precio Del Combo txt para que el usuario vaya visualizando el costo de su Paquete 
        txtPrecioFinal.setText(String.valueOf(precioCombo));
	}

	@FXML
    void btnAgregar_OneClick(ActionEvent event) {
		
		String precioFinal = txtPrecioFinal.getText();
    	JOptionPane.showMessageDialog(null, "El Precio Final Del Combo Es: "+precioFinal);

    }

    @FXML
    void btnCalcular_OneClick(ActionEvent event) {
    	int subtotal = precioCombo;

        // Verificar que se haya seleccionado una bebida (sin costo adicional)
        if (CheckBox1.isSelected() || CheckBox2.isSelected() || CheckBox3.isSelected()) {
            subtotal += precioBebidas;
        }

        // Verificar los complementos seleccionados y sumar sus precios
        if (complemento1CheckBox.isSelected()) {
            subtotal += precioPapasGrandes;
        }

        if (complemento2CheckBox.isSelected()) {
            subtotal += precioPapasMedianas;
        }

        if (complemento3CheckBox.isSelected()) {
            subtotal += precioCarne;
        }

        // Mostrar el subtotal en el campo de texto
        txtPrecioFinal.setText(String.valueOf(subtotal));
    	
    }

}
