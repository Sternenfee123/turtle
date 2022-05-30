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
  static Turtle turtle1 = new Turtle();
  private Button button4 = new Button();
  private Button button5 = new Button();
  private Button button6 = new Button();
  private Button button7 = new Button();
  private Label label1 = new Label();
  private Button button8 = new Button();
  private Label label2 = new Label();
  private Button button9 = new Button();
  // Ende Attribute
  
  public void start(Stage primaryStage) { 
    
    
    Scene scene = new Scene(root, 666, 452);
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
    turtle1.setLayoutX(80);
    turtle1.setLayoutY(50);
    turtle1.setAnimated(true);
    turtle1.setWidth(420);
    turtle1.setHeight(280);
    turtle1.setOriginX(34);
    turtle1.setOriginY(38);
    turtle1.setDisable(true);
    turtle1.setVisible(false);
    turtle1.setAnimationspeed(130);
    root.getChildren().add(turtle1);
    button4.setLayoutX(535);
    button4.setLayoutY(331);
    button4.setPrefHeight(57);
    button4.setPrefWidth(59);
    button4.setOnAction(
    (event) -> {button4_Action(event);} 
    );
    root.getChildren().add(button4);
    button5.setLayoutX(471);
    button5.setLayoutY(387);
    button5.setPrefHeight(57);
    button5.setPrefWidth(59);
    button5.setOnAction(
    (event) -> {button5_Action(event);} 
    );
    root.getChildren().add(button5);
    button6.setLayoutX(535);
    button6.setLayoutY(387);
    button6.setPrefHeight(57);
    button6.setPrefWidth(59);
    button6.setOnAction(
    (event) -> {button6_Action(event);} 
    );
    root.getChildren().add(button6);
    button7.setLayoutX(599);
    button7.setLayoutY(387);
    button7.setPrefHeight(57);
    button7.setPrefWidth(59);
    button7.setOnAction(
    (event) -> {button7_Action(event);} 
    );
    root.getChildren().add(button7);
    label1.setLayoutX(51);
    label1.setLayoutY(346);
    label1.setPrefHeight(20);
    label1.setPrefWidth(118);
    label1.setText("text");
    root.getChildren().add(label1);
    button8.setLayoutX(175);
    button8.setLayoutY(385);
    button8.setPrefHeight(25);
    button8.setPrefWidth(75);
    button8.setOnAction(
    (event) -> {button8_Action(event);} 
    );
    root.getChildren().add(button8);
    label2.setLayoutX(44);
    label2.setLayoutY(384);
    label2.setPrefHeight(20);
    label2.setPrefWidth(126);
    label2.setText("text");
    root.getChildren().add(label2);
    button9.setLayoutX(311);
    button9.setLayoutY(391);
    button9.setPrefHeight(25);
    button9.setPrefWidth(75);
    button9.setOnAction(
    (event) -> {button9_Action(event);} 
    );
    root.getChildren().add(button9);
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
    turtle1.setVisible(true);
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

  public void button4_Action(Event evt) {
    for (int i = tade.LocationX(); i < 0; i--) {
      if (spielfeld1[i][tade.LocationY()].getEisblockart() == 1) {
        label1.setText("Verloren :(((((((((");
        int x = tade.LocationX()-i;
        i = 300000;
        turtle1.turnto(90);
        turtle1.move(70*x);
        return;
      } // end of if
      
      if (spielfeld1[i][tade.LocationY()].getEisblockart() == 2) {
        label1.setText("Super!");
        int y = tade.LocationX()-i-1;
        i = 300000;
        turtle1.turnto(90);
        turtle1.move(70*y);
        return;
      } // end of if  
    } 
    turtle1.turnto(90);
    turtle1.move(70*10);
  } // end of button4_Action

  public void button5_Action(Event evt) {
    for (int i = tade.LocationY(); i < 0; i--) {
      if (spielfeld1[tade.LocationX()][i].getEisblockart() == 1) {
        label1.setText("Verloren :(((((((((");
        int x = tade.LocationY()-i;
        i = 300000;
        turtle1.turnto(180);
        turtle1.move(70*x);
        return;
      } // end of if
      
      if (spielfeld1[tade.LocationX()][i].getEisblockart() == 2) {
        label1.setText("Super!");
        int y = tade.LocationY()-i-1;
        i = 300000;
        turtle1.turnto(180);
        turtle1.move(70*y);
        return;
      } // end of if
    }
    //turtle1.turnto(180);
    //turtle1.move(70*10);
  } // end of button5_Action

  public void button6_Action(Event evt) {
    for (int i = tade.LocationX(); i < 4; i++) {
      if (spielfeld1[i][tade.LocationY()].getEisblockart() == 1) {
        label1.setText("Verloren :(((((((((");
        int x = i-tade.LocationX();
        i = 300000;
        turtle1.turnto(-90);
        turtle1.move(70*x);
        return;
      } // end of if
      
      if (spielfeld1[i][tade.LocationY()].getEisblockart() == 2) {
        label1.setText("Super!");
        int y = (i-1)-tade.LocationX();
        i = 300000;
        turtle1.turnto(-90);
        turtle1.move(70*y);
        return;
      } // end of if  
    } 
    turtle1.turnto(-90);
    turtle1.move(70*10);
  } // end of button6_Action                               

  public void button7_Action(Event evt) {
    for (int i = tade.LocationY(); i < 6; i++) {
      if (spielfeld1[tade.LocationX()][i].getEisblockart() == 1) {
        label1.setText("Verloren :(((((((((");
        int x = i-tade.LocationY();
        i = 300000;
        turtle1.turnto(0);
        //turtle1.setRotate(0);
        turtle1.move(70*x);
        return;
      } // end of if
      
      if (spielfeld1[tade.LocationX()][i].getEisblockart() == 2) {
        label1.setText("Super!");
        int y = (i-1)-tade.LocationY();
        i = 300000;
        turtle1.turnto(0);
        turtle1.move(70*y);
        return;
      } // end of if
    }
    turtle1.turnto(0);
    turtle1.move(70*10);
  } // end of button7_Action
    
  public void button8_Action(Event evt) {
    label1.setText("" + tade.LocationX());
    label2.setText("" + tade.LocationY());
  } // end of button8_Action
    
  public void button9_Action(Event evt) {
    turtle1.move(70*5);
    turtle1.turnto(-90);
    turtle1.move(70*3);
  } // end of button9_Action

    // Ende Methoden
} // end of class TurtleaufdemEis

