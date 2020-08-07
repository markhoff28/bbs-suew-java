package QueenproblemFx;
import javafx.application.Application;
	import javafx.geometry.Pos;
	import javafx.stage.Stage;
	import javafx.scene.Scene;
	import javafx.scene.control.Label;
	import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
	import javafx.scene.layout.GridPane;
	
public class Queemproblemfx extends Application{
	  public static final int SIZE = 32; // groeﬂe des Schachbrettes
	  
	  /* 
	   * -1 bedeutet, dass keine Dame in der i-ten Reihe platziert werden kann
	  */
	  private int[] queens = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; 

	  @Override
	  public void start(Stage primaryStage) {
	    searchPossition(); 
	    
	    GridPane schachbrett = new GridPane();
	    schachbrett.setAlignment(Pos.CENTER);
	    Label[][] labels = new Label[SIZE][SIZE];
	    for (int i = 0; i < SIZE; i++) {
	    	for (int j = 0; j < SIZE; j++) {
	    		schachbrett.add(labels[i][j] = new Label(), j, i);
	    		labels[i][j].setStyle("-fx-border-color: black");
	    		labels[i][j].setPrefSize(30, 30);
	    	}
	    }

	    Image image = new Image("img/queen.jpg", 25, 25, false, false);
	    for (int i = 0; i < SIZE; i++)
	      labels[i][queens[i]].setGraphic(new ImageView(image));

	    Scene scene = new Scene(schachbrett, 40 * SIZE, 40 * SIZE);
	    primaryStage.setTitle("Dameproblem");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	  }

	  /** 
	   * Sucht eine Positionierung f¸r die Dame innerhalb einer Zeile,
	   * um diese zu positionieren
	   */
	  private boolean searchPossition() {
	    int row = 0;
	    while (row >= 0 && row < SIZE) {
	      int j = findPosition(row);
	      if (j < 0) {
	        queens[row] = -1;
	        row--;
	      } else {
	        queens[row] = j;
	        row++;
	      }
	    }    
	    if (row == -1)
	      return false;
	    else
	      return true;
	  }

	  /**
	   * Findet die Position einer Dame innerhalb der uebergebenen Zeile
	   * @param row Zeile
	   * @return ist das Feld, in dem die Dame platziert werden kann oder -1 wenn es nicht der Fall ist
	   */
	  private int findPosition(int row) {
	    int start = queens[row] + 1;

	    for (int colum = start; colum < SIZE; colum++) {
	      if (isValid(row, colum))
	        return colum; // (row, j) 
	    }
	    return -1;
	  }
	  
	  /**
	   * Validiert Zeile und Spalte, ob die Dame positioniert werden kann oder nicht
	   * @param row Zeile
	   * @param column Spalte
	   * @return false bei einem Konflikt, true bei keinem Konflikt
	   */
	  private boolean isValid(int row, int column) {
	    for (int i = 1; i <= row; i++)
	      if (queens[row - i] == column // pruefe die Spalte
	        || queens[row - i] == column - i // pruefe Diagonale nach links oben
	        || queens[row - i] == column + i) { // pruefe Diagonale nach rechts unten
	    	  return false;
	      }    
	    return true;     
	  }

	  public static void main(String[] args) {
	    launch(args);
	  }
}
