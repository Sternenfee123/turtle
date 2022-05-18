import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.event.*;
import je.fx.util.Turtle;
import javafx.scene.canvas.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.layout.*;


public class TurtleaufdemEis extends Application {
  // Anfang Attribute
  
  static Spieler spieler1 = new Spieler("", 0, 0);
  static Eisfläche[][] spielfeld1 = new Eisfläche[4][6];
  static Eisfläche[][] spielfeld2 = new Eisfläche[8][9];
  static Eisfläche[][] spielfeld3 = new Eisfläche[9][16];
  static Spiel tade = new Spiel();
  private Button button1 = new Button();
  Pane root = new Pane();
  private Button button2 = new Button();
  private Button button3 = new Button();
  // Ende Attribute
  
  public void start(Stage primaryStage) { 
    
    
    Scene scene = new Scene(root, 512, 64);
    // Anfang Komponenten
    
    button1.setLayoutX(12);
    button1.setLayoutY(13);
    button1.setPrefHeight(25);
    button1.setPrefWidth(163);
    button1.setOnAction(
    (event) -> {button1_Action(event);} 
    );
    button1.setText("Level 1");
    root.getChildren().add(button1);
    button2.setLayoutX(180);
    button2.setLayoutY(14);
    button2.setPrefHeight(25);
    button2.setPrefWidth(163);
    button2.setOnAction(
    (event) -> {button2_Action(event);} 
    );
    button2.setText("Level 2");
    root.getChildren().add(button2);
    button3.setLayoutX(348);
    button3.setLayoutY(9);
    button3.setPrefHeight(25);
    button3.setPrefWidth(155);
    button3.setOnAction(
    (event) -> {button3_Action(event);} 
    );
    button3.setText("Level 3");
    root.getChildren().add(button3);
    // Ende Komponenten
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("TurtleaufdemEis");
    primaryStage.setScene(scene);
    primaryStage.show();
  } // end of public TurtleaufdemEis
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    launch(args);
    // frame.getContentPane().setBackground(Color(#55c7f1));
  } // end of main
  
  public void Level1() {
    //Spielfeld wird erzeugt (Level 1)
    for (int zeile = 0; zeile < 4; zeile++) {
      for (int spalte = 0; spalte < 6; spalte++) {
        spielfeld1[zeile][spalte] = new Eisfläche(0, spalte, zeile);
        spielfeld1[zeile][spalte].setLayoutX(80+spalte*70);
        spielfeld1[zeile][spalte].setLayoutY(50+zeile*70);
        spielfeld1[zeile][spalte].setPrefHeight(70);
        spielfeld1[zeile][spalte].setPrefWidth(70);
        spielfeld1[zeile][spalte].setDisable(true);
        //spielfeld1[zeile][spalte].setStyle("-fx-background-color: blue;");          
        root.getChildren().add(spielfeld1[zeile][spalte]);        
      }
    }
    
    //Eisflächen auf dem Spielfeld werden gesetzt
    spielfeld1[2][3].setEisblockart(1);
    spielfeld1[3][3].setEisblockart(1);
    
    spielfeld1[0][5].setEisblockart(2);
    spielfeld1[3][1].setEisblockart(2);
    spielfeld1[3][4].setEisblockart(2);
    
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 6; j++) {
        if (spielfeld1[i][j].getEisblockart() == 1) { 
          spielfeld1[i][j].setStyle("-fx-background-color: #55c7f1;"); 
        }
        if (spielfeld1[i][j].getEisblockart() == 2) {
          spielfeld1[i][j].setStyle("-fx-background-color: #7293a7;");
        } // end of if
      }
    } 
  }
  
  public void Level2() {
    //Spielfeld wird erzeugt (Level 2)
    for (int zeile = 0; zeile < 8; zeile++) {
      for (int spalte = 0; spalte < 9; spalte++) {
        spielfeld2[zeile][spalte] = new Eisfläche(0, spalte, zeile);
        spielfeld2[zeile][spalte].setLayoutX(80+spalte*70);
        spielfeld2[zeile][spalte].setLayoutY(50+zeile*70);
        spielfeld2[zeile][spalte].setPrefHeight(70);
        spielfeld2[zeile][spalte].setPrefWidth(70);
        spielfeld2[zeile][spalte].setDisable(true);
        //spielfeld1[zeile][spalte].setStyle("-fx-background-color: blue;");          
        root.getChildren().add(spielfeld2[zeile][spalte]);        
      }
    }
    
    //Eisflächen auf dem Spielfeld werden gesetzt
    spielfeld2[0][0].setEisblockart(1);
    spielfeld2[0][1].setEisblockart(1);
    spielfeld2[0][5].setEisblockart(1);
    spielfeld2[0][6].setEisblockart(1);
    spielfeld2[1][0].setEisblockart(1);
    spielfeld2[2][0].setEisblockart(1);
    spielfeld2[2][8].setEisblockart(1);
    spielfeld2[3][3].setEisblockart(1);
    spielfeld2[3][4].setEisblockart(1);
    spielfeld2[3][8].setEisblockart(1);
    spielfeld2[4][3].setEisblockart(1);
    spielfeld2[4][4].setEisblockart(1);
    spielfeld2[4][8].setEisblockart(1);
    spielfeld2[7][0].setEisblockart(1);
    
    spielfeld2[0][7].setEisblockart(2);
    spielfeld2[1][1].setEisblockart(2);
    spielfeld2[2][5].setEisblockart(2);
    spielfeld2[4][6].setEisblockart(2);
    spielfeld2[5][3].setEisblockart(2);
    spielfeld2[5][8].setEisblockart(2);
    spielfeld2[6][0].setEisblockart(2);
    spielfeld2[6][5].setEisblockart(2);
    spielfeld2[7][2].setEisblockart(2);
    spielfeld2[7][4].setEisblockart(2);
    spielfeld2[7][5].setEisblockart(2);
    spielfeld2[7][6].setEisblockart(2);
    
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 9; j++) {
        if (spielfeld2[i][j].getEisblockart() == 1) { 
          spielfeld2[i][j].setStyle("-fx-background-color: #55c7f1;"); 
        }
        if (spielfeld2[i][j].getEisblockart() == 2) {
          spielfeld2[i][j].setStyle("-fx-background-color: #7293a7;");
        } // end of if
      }
    } 
  }
  
  public void Level3() {
    //Spielfeld wird erzeugt (Level 3)
    for (int zeile = 0; zeile < 9; zeile++) {
      for (int spalte = 0; spalte < 16; spalte++) {
        spielfeld3[zeile][spalte] = new Eisfläche(0, spalte, zeile);
        spielfeld3[zeile][spalte].setLayoutX(80+spalte*70);
        spielfeld3[zeile][spalte].setLayoutY(50+zeile*70);
        spielfeld3[zeile][spalte].setPrefHeight(70);
        spielfeld3[zeile][spalte].setPrefWidth(70);
        spielfeld3[zeile][spalte].setDisable(true);
        //spielfeld1[zeile][spalte].setStyle("-fx-background-color: blue;");          
        root.getChildren().add(spielfeld3[zeile][spalte]);        
      }
    }
    
    //Eisflächen auf dem Spielfeld werden gesetzt
    spielfeld3[1][3].setEisblockart(1);
    spielfeld3[1][4].setEisblockart(1);
    spielfeld3[4][10].setEisblockart(1);
    spielfeld3[5][3].setEisblockart(1);
    spielfeld3[5][10].setEisblockart(1);
    spielfeld3[0][13].setEisblockart(1);
    spielfeld3[0][14].setEisblockart(1);
    spielfeld3[0][15].setEisblockart(1);
    spielfeld3[1][14].setEisblockart(1);
    spielfeld3[0][0].setEisblockart(1);
    spielfeld3[1][0].setEisblockart(1);
    spielfeld3[8][0].setEisblockart(1);
    spielfeld3[8][14].setEisblockart(1);
    spielfeld3[8][15].setEisblockart(1);
    spielfeld3[8][11].setEisblockart(1);
    
    spielfeld3[0][1].setEisblockart(2);
    spielfeld3[0][6].setEisblockart(2);
    spielfeld3[0][10].setEisblockart(2);
    spielfeld3[1][8].setEisblockart(2);
    spielfeld3[1][13].setEisblockart(2);
    spielfeld3[2][3].setEisblockart(2);
    spielfeld3[2][11].setEisblockart(2);
    spielfeld3[2][15].setEisblockart(2);
    spielfeld3[3][5].setEisblockart(2);
    spielfeld3[3][7].setEisblockart(2);
    spielfeld3[3][12].setEisblockart(2);
    spielfeld3[4][2].setEisblockart(2);
    spielfeld3[4][7].setEisblockart(2);
    spielfeld3[4][11].setEisblockart(2);
    spielfeld3[5][4].setEisblockart(2);
    spielfeld3[5][14].setEisblockart(2);
    spielfeld3[6][0].setEisblockart(2);
    spielfeld3[6][2].setEisblockart(2);
    spielfeld3[6][8].setEisblockart(2);
    spielfeld3[6][9].setEisblockart(2);
    spielfeld3[7][5].setEisblockart(2);
    spielfeld3[7][12].setEisblockart(2);
    spielfeld3[8][1].setEisblockart(2);
    spielfeld3[8][3].setEisblockart(2);
    spielfeld3[8][7].setEisblockart(2);
    
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 16; j++) {
        if (spielfeld3[i][j].getEisblockart() == 1) { 
          spielfeld3[i][j].setStyle("-fx-background-color: #55c7f1;"); 
        }
        if (spielfeld3[i][j].getEisblockart() == 2) {
          spielfeld3[i][j].setStyle("-fx-background-color: #7293a7;");
        } // end of if
      }
    } 
  }
  
  public void button1_Action(Event evt) {
    Level1();
    button1.setVisible(false);
    button2.setVisible(false);
    button3.setVisible(false);
    //tade.Level1();
  } // end of button1_Action

  public void button2_Action(Event evt) {
    Level2();
    button1.setVisible(false);
    button2.setVisible(false);
    button3.setVisible(false);
  } // end of button2_Action

  public void button3_Action(Event evt) {
    Level3();
    button1.setVisible(false);
    button2.setVisible(false);
    button3.setVisible(false);
  } // end of button3_Action

  // Ende Methoden
} // end of class TurtleaufdemEis

