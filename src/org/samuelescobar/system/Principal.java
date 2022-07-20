package org.samuelescobar.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
    Programador: Samuel Isaac Escobar Vásquez 2020031 IN5AV
    Fecha Creación: 22/4/2021
    Fecha Modificación: 
    * 22/4/2021
    * 23/4/2021
 */
public class Principal extends Application {
    
    @Override
    public void start(Stage ecenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        ecenarioPrincipal.setTitle("Calculadora por : Samuel Escobar");
        ecenarioPrincipal.getIcons().add(new Image("/org/samuelescobar/images/calcu.png"));
        ecenarioPrincipal.setScene(scene);
        ecenarioPrincipal.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
