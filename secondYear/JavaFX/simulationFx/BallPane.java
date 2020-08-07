package simulationFx;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class BallPane extends Pane {
	public final double radius = 5;
    private final MovableCircle predator = new MovableCircle(radius, Color.RED);
    private final Timeline animation;
    private final List<MovableCircle> circles;

    public BallPane() {
        circles=IntStream.range(0,BounceBallControl.mountOfPeople).mapToObj(i->new MovableCircle(radius, Color.GREEN))
                .collect(Collectors.toList());
        getChildren().addAll(circles);
        predator.setFill(Color.RED);
        getChildren().add(predator);

        setWidth(BounceBallControl.WIDTH);
        setHeight(BounceBallControl.HEIGHT);

        // Create an animation for moving the ball
        animation = new Timeline(new KeyFrame(Duration.millis(30), e -> moveBall()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play(); // Start animation
    }

    public final void moveBall() {
        circles.forEach(MovableCircle::moveBall);
        predator.moveBall();

    }

     public void play() {
         animation.play();

     }

     public void pause() {
         animation.pause();
     }

     public void increaseSpeed() {
         animation.setRate(animation.getRate() + 0.1);
     }

     public void decreaseSpeed() {
         animation.setRate(
                 animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);

     }

     public void addBallToPane() {
    	 int incrementalEnding = 0;	
    	 incrementalEnding++;                                      
    	 circles.add(new MovableCircle(radius, Color.GREEN));                    
    	 getChildren().add(circles.get(incrementalEnding));

     }

     public void checkForCollison() {
    	 for (int i = 0; i < getChildren().size(); i++) {                  
    		 if ((predator.intersects(circles.get(i).getBoundsInLocal()))) {
    			 getChildren().remove(circles.get(i));
    		 }
    	 }
     }

}
