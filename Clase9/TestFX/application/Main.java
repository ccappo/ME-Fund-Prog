package application;
	
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Text text = new Text (40,40,"Programación en JavaFX");
		text.setFont(Font.font("Arial",FontWeight.BOLD, 18));
		Pane pane = new Pane(text);
		
		Button btUp = new Button("Arriba");
		Button btDown = new Button("Abajo");
		Button btLeft = new Button("Izquierda");
		Button btRight = new Button("Derecha");
		
		HBox hBox = new HBox(btUp,btDown,btLeft,btRight);
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		
		BorderPane borderPane = new BorderPane(pane);
		borderPane.setBottom(hBox);
		
		btUp.setOnAction((ActionEvent e) -> {
			 text.setY(text.getY()> 10 ? text.getY()- 5 : 10 );
		});
		
		btDown.setOnAction( e  -> {
			 text.setY(text.getY() < pane.getHeight() ? text.getY() + 5 : pane.getHeight() );
		});
		
		btLeft.setOnAction( e  -> {
			 text.setX(text.getX() > 0 ? text.getX() - 5 : 0 );
		});
		
		btRight.setOnAction( e -> {
			 text.setX(text.getX() < pane.getWidth() - 100 ? text.getX() + 5 : pane.getWidth() -100 );
		});
		
		Scene scene = new Scene (borderPane, 400, 300);
		
		primaryStage.setTitle("Ejemplo de javafx");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
