import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.application.Application;
 
@SuppressWarnings("restriction")
public class Window extends Application implements EventHandler<ActionEvent>{
 
  Button button;
 
  public static void main(String[] args) {
    launch(args);
  }
 
  public void start(Stage primaryStage) throws Exception{
    primaryStage.setTitle("Title of the window");
    button = new Button("Click me ");
    StackPane layout = new StackPane();
    layout.getChildren().add(button);
    button.setOnAction(this);
    Scene scene = new Scene(layout, 300, 250);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
 
  //Enélkül a class hibát mutat
  public void handle(ActionEvent event) {
    if(event.getSource()== button) {
      System.out.println("You clicked my button :)");
    }
  }
}