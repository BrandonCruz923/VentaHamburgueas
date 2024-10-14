package application;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PedirComboController {

    @FXML
    private Label lblCombo1;

    @FXML
    private Label lblCombo2;

    @FXML
    private Label lblCombo3;

    @FXML
    private Label lblCombo4;

    @FXML
    private Label lblCombo5;

    @FXML
    private Label lblPrecioCombo1;

    @FXML
    private Label lblPrecioCombo2;

    @FXML
    private Label lblPrecioCombo3;

    @FXML
    private Label lblPrecioCombo4;

    @FXML
    private Label lblPrecioCombo5;

    @FXML
    private AnchorPane principal;

    @FXML
    private VBox vBoxCombo1;

    @FXML
    private VBox vBoxCombo2;

    @FXML
    private VBox vBoxCombo3;

    @FXML
    private VBox vBoxCombo4;

    @FXML
    private VBox vBoxCombo5;

    @FXML
    private VBox vBoxHambuerguesaSola;
    
 // Variables para almacenar precios
    private int precio1;
    private int precio2;
    private int precio3;
    private int precio4;
    private int precio5;

    @FXML
    public void initialize() {
        // Inicializar precios al cargar la interfaz
        precio1 = parsePrecio(lblPrecioCombo1.getText());
        precio2 = parsePrecio(lblPrecioCombo2.getText());
        precio3 = parsePrecio(lblPrecioCombo3.getText());
        precio4 = parsePrecio(lblPrecioCombo4.getText());
        precio5 = parsePrecio(lblPrecioCombo5.getText());
    }

    private int parsePrecio(String precioTexto) {
        // Elimina el símbolo $ y convierte a entero
        if (precioTexto != null) {
            try {
                return Integer.parseInt(precioTexto.replace("$", "").trim());
            } catch (NumberFormatException e) {
                System.err.println("Error Al Usar EL  Parseo Para Calcular El Precio: " + precioTexto);
            }
        }
        return 0; // Devuelve 0 si hay un error
    }
    

	@FXML
    void vBoxCombo1_OnClick(MouseEvent event) {
    	
     try {
    	    String etiqueta = lblCombo1.getText();
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PersonalizarCombo.fxml"));
            Parent loginPane = loader.load();
            Stage stage = (Stage) principal.getScene().getWindow();
            stage.setScene(new Scene(loginPane));
            JOptionPane.showMessageDialog(null, "Has Escogido El :\n"+etiqueta);
            PersonalizarComboController controller = loader.getController();
            controller.setPrecioCombo(precio1); // Usa precio1 aquí
           
            
          } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void vBoxCombo2_OnClick(MouseEvent event) {
    	try {
    		String etiqueta = lblCombo2.getText();
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PersonalizarCombo.fxml"));
            Parent loginPane = loader.load();
            Stage stage = (Stage) principal.getScene().getWindow();
            stage.setScene(new Scene(loginPane));
            JOptionPane.showMessageDialog(null, "Has Escogido El :\n"+etiqueta);
            PersonalizarComboController controller = loader.getController();
            controller.setPrecioCombo(precio2); // Usa precio2 aquí
          } catch (IOException e) {
            e.printStackTrace();
        }

    }

    

    @FXML
    void vBoxCombo3_OnClick(MouseEvent event) {
    	try {
    		String etiqueta = lblCombo3.getText();
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PersonalizarCombo.fxml"));
            Parent loginPane = loader.load();
            Stage stage = (Stage) principal.getScene().getWindow();
            stage.setScene(new Scene(loginPane));
            JOptionPane.showMessageDialog(null, "Has Escogido El :\n"+etiqueta);
            PersonalizarComboController controller = loader.getController();
            controller.setPrecioCombo(precio3); // Usa precio3 aquí
          } catch (IOException e) {
            e.printStackTrace();
        }

    

    }

    @FXML
    void vBoxCombo4_OnClick(MouseEvent event) {
    	try {
    		String etiqueta = lblCombo4.getText();
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PersonalizarCombo.fxml"));
            Parent loginPane = loader.load();
            Stage stage = (Stage) principal.getScene().getWindow();
            stage.setScene(new Scene(loginPane));
            JOptionPane.showMessageDialog(null, "Has Escogido El :\n"+etiqueta);
            PersonalizarComboController controller = loader.getController();
            controller.setPrecioCombo(precio4); // Usa precio1 aquí
          } catch (IOException e) {
            e.printStackTrace();
        }

    }

    

    @FXML
    void vBoxCombo5_OnClick(MouseEvent event) {
    	try {
    		String etiqueta = lblCombo5.getText();
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PersonalizarCombo.fxml"));
            Parent loginPane = loader.load();
            Stage stage = (Stage) principal.getScene().getWindow();
            stage.setScene(new Scene(loginPane));
            JOptionPane.showMessageDialog(null, "Has Escogido El :\n"+etiqueta);
            PersonalizarComboController controller = loader.getController();
            controller.setPrecioCombo(precio5); // Usa precio1 aquí
          } catch (IOException e) {
            e.printStackTrace();
        }

    }
    

    @FXML
    void vBoxHambuerguesaSola_OnClick(MouseEvent event) {

    	try {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("ElegirHamburguesa.fxml"));
            Parent loginPane = loader.load();
            Stage stage = (Stage) principal.getScene().getWindow();
            stage.setScene(new Scene(loginPane));
          } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
