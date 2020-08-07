package Aufzug;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AufzugGUI extends Application implements EventHandler<ActionEvent>{
	GridPane gridPane = new GridPane();
	Scene scene = new Scene(gridPane, 600,400);
	Button button = new Button();
	Label label = new Label();
    TextField notification = new TextField ();
    TextField notification1 = new TextField ();
    TextField notification2 = new TextField ();

    double ump; //umdrehungen pro minute
	double meter;	
	double time;	
	double strecke;
	double weg;

    public static void main(String[] args) {
		launch();
	}//main end
	
	public void start (Stage primaryStage) {
		primaryStage.setTitle("Mein Aufzug");
		primaryStage.setScene(scene);
		 
		gridPane.setVgap(10);
		gridPane.setHgap(0);
		gridPane.setPadding(new Insets(5, 5, 5, 5));
	    gridPane.add(new Label("Umdrehungenpro Minute des Antriebsmotors: "), 0, 0);
	    gridPane.add(notification, 1, 0);
	    gridPane.add(new Label("Durchmesser der Seilrolle in Meter: "), 0, 1);
	    gridPane.add(notification1, 1, 1);
	    gridPane.add(new Label("Laufzeit des Aufzugs in Minuten: "), 0, 2);
	    gridPane.add(notification2, 1, 2);
	    button.setText("Senden");
		button.setOnAction(this);
		gridPane.add(button, 0, 3);
		gridPane.add(new Label("Geschwindigkeit: "), 0, 4);
		gridPane.add(new Label("Weg des Aufzuges: "), 0, 5);
//	    gridPane.setGridLinesVisible(true);
		primaryStage.show();
	}// start end
	
	@Override
	public void handle(ActionEvent event) {
		System.out.println(notification.getText());
		System.out.println(notification1.getText());
		System.out.println(notification2.getText());
//		ump = (notification.);
		strecke = (2 * Math.PI * (meter / 2) * ump) * time;
		weg  = meter * time;
	}//handle end

}
