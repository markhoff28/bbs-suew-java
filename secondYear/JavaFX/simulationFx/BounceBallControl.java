package simulationFx;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;


public class BounceBallControl extends Application {
	 public static final int WIDTH  = 1000;
	 public static final int HEIGHT = 900;
	 public static final int mountOfPeople = 200;
	 
	  public void start(Stage primaryStage) {
	    BallPane ballPane = new BallPane(); // Create a ball pane

	    // Pause and resume animation
//	    ballPane.setOnMousePressed(e -> ballPane.pause());
//	    ballPane.setOnMouseReleased(e -> ballPane.play());

	    // Increase and decrease animation   
	    ballPane.setOnKeyPressed(e -> {
	      if (e.getCode() == KeyCode.UP) {
	        ballPane.increaseSpeed();
	      } 
	      else if (e.getCode() == KeyCode.DOWN) {
	        ballPane.decreaseSpeed();
	      }
	    });



	    // Create a scene and place it in the stage
	    Scene scene = new Scene(ballPane, 1000, 1000);
	    primaryStage.setTitle("Get Corona"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage

	    // Must request focus after the primary stage is displayed
	    ballPane.requestFocus();
	  }

	  /**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   */
	  public static void main(String[] args) {
	    launch(args);
	  }
	


}
