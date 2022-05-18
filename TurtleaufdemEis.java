import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class TurtleaufdemEis extends Application {
  // Anfang Attribute
  // Ende Attribute
  
  public void start(Stage primaryStage) { 
    Pane root = new Pane();
    Scene scene = new Scene(root, 443, 311);
    // Anfang Komponenten
    
    // Ende Komponenten
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("TurtleaufdemEis");
    primaryStage.setScene(scene);
    primaryStage.show();
  } // end of public TurtleaufdemEis
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    launch(args);
  } // end of main
  
  // Ende Methoden
} // end of class TurtleaufdemEis

