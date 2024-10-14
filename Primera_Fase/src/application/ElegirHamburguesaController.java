package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;
//import java.io.IOException;
import java.io.IOException;
import javax.swing.JOptionPane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ElegirHamburguesaController {
	
	
	 @FXML
	private AnchorPane pane;

    @FXML
    private VBox Vbox1;

    @FXML
    private VBox vbox2;

    @FXML
    private VBox vbox3;

    @FXML
    private VBox vbox4;

    @FXML
    private VBox vbox5;

    @FXML
    private VBox vbox6;
    @FXML
    private Label lblHambuguesa2;

    @FXML
    private Label lblHambuguesa4;

    @FXML
    private Label lblHambuguesa5;

    @FXML
    private Label lblHamburguesa1;

    @FXML
    private Label lblHamburguesa3;

    @FXML
    private Label lblHamburguesa6;

    @FXML
    private Label lblPrecio1;

    @FXML
    private Label lblPrecio2;

    @FXML
    private Label lblPrecio3;

    @FXML
    private Label lblPrecio4;

    @FXML
    private Label lblPrecio5;

    @FXML
    private Label lblPrecio6;
    
    //Precio de las Hamburguesas
    int precio1;
    int precio2;
    int precio3;
    int precio4;
    int precio5;
    int precio6;
    
    
 // Inicializar precios al cargar la interfaz
    
    @FXML
    public void initialize() {
        precio1 = parsePrecio(lblPrecio1.getText());
        precio2 = parsePrecio(lblPrecio2.getText());
        precio3 = parsePrecio(lblPrecio3.getText());
        precio4 = parsePrecio(lblPrecio4.getText());
        precio5 = parsePrecio(lblPrecio5.getText());
        precio6 = parsePrecio(lblPrecio6.getText());
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
        return 0; 
    }
    
    
    

    @FXML
    void vbox1One_Click(MouseEvent event) {
    	 try {
    		 String etiqueta = lblHamburguesa1.getText();
             FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PersonalizarHamburguesa.fxml"));
             Parent loginPane = loader.load();
             Stage stage = (Stage) pane.getScene().getWindow();
             stage.setScene(new Scene(loginPane));
             JOptionPane.showMessageDialog(null, "Has Ecogido Una: "+etiqueta);
             PersonalizarHamburguesaController controller = loader.getController();
             controller.setPrecioHamburguesa(precio1);//Ocupa El Precio1
           } catch (IOException e) {
             e.printStackTrace();
         }
     
    }

    @FXML
    void vbox2One_Click(MouseEvent event) {
    	try {
    		String etiqueta = lblHambuguesa2.getText();
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PersonalizarHamburguesa.fxml"));
            Parent loginPane = loader.load();
            Stage stage = (Stage) pane.getScene().getWindow();
            stage.setScene(new Scene(loginPane));
            JOptionPane.showMessageDialog(null, "Has Ecogido Una: "+etiqueta);
            PersonalizarHamburguesaController controller = loader.getController();
            controller.setPrecioHamburguesa(precio2);//Ocupa El Precio2
        } catch (IOException e) {
            e.printStackTrace();
        }
    

    }

    @FXML
    void vbox3One_Click(MouseEvent event) {
    	try {
    		String etiqueta = lblHamburguesa3.getText();
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PersonalizarHamburguesa.fxml"));
            Parent loginPane = loader.load();
            Stage stage = (Stage) pane.getScene().getWindow();
            stage.setScene(new Scene(loginPane));
            JOptionPane.showMessageDialog(null, "Has Ecogido Una: "+etiqueta);
            PersonalizarHamburguesaController controller = loader.getController();
            controller.setPrecioHamburguesa(precio3);//Ocupa El Precio3
        } catch (IOException e) {
            e.printStackTrace();
        }
    

    }

    @FXML
    void vbox4One_Click(MouseEvent event) {
    	try {
    		String etiqueta = lblHambuguesa4.getText();
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PersonalizarHamburguesa.fxml"));
            Parent loginPane = loader.load();
            Stage stage = (Stage) pane.getScene().getWindow();
            stage.setScene(new Scene(loginPane));
            JOptionPane.showMessageDialog(null, "Has Ecogido Una: "+etiqueta);
            PersonalizarHamburguesaController controller = loader.getController();
            controller.setPrecioHamburguesa(precio4);//Ocupa El Precio4
        } catch (IOException e) {
            e.printStackTrace();
        }
    

    }

    @FXML
    void vbox5One_Click(MouseEvent event) {
    	try {
    		String etiqueta = lblHambuguesa5.getText();
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PersonalizarHamburguesa.fxml"));
            Parent loginPane = loader.load();
            Stage stage = (Stage) pane.getScene().getWindow();
            stage.setScene(new Scene(loginPane));
            JOptionPane.showMessageDialog(null, "Has Ecogido Una: "+etiqueta);
            PersonalizarHamburguesaController controller = loader.getController();
            controller.setPrecioHamburguesa(precio5);//Ocupa El Precio5
        } catch (IOException e) {
            e.printStackTrace();
        }
    

    }

    @FXML
    void vbox6One_Click(MouseEvent event) {
    	try {
    		String etiqueta = lblHamburguesa6.getText();
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PersonalizarHamburguesa.fxml"));
            Parent loginPane = loader.load();
            Stage stage = (Stage) pane.getScene().getWindow();
            stage.setScene(new Scene(loginPane));
            JOptionPane.showMessageDialog(null, "Has Ecogido Una: "+etiqueta);
            PersonalizarHamburguesaController controller = loader.getController();
            controller.setPrecioHamburguesa(precio6);//Ocupa El Precio6
        } catch (IOException e) {
            e.printStackTrace();
        }
    

    }

}
