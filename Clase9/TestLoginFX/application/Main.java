package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25,25,25,25));
			Text actiontarget = new Text();
			actiontarget.setId("actiontarget");
			
			grid.add(actiontarget, 1, 6);
			 
			Text scenetitle = new Text("Bienvenido");
			scenetitle.setId("bienvenido");
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grid.add(scenetitle, 0, 0, 2, 1);
			Label userName = new Label("Nombre usuario:");
			grid.add(userName, 0, 1);
			
			TextField userTextField = new TextField();
			grid.add(userTextField, 1, 1);
			Label pw = new Label("Contraseña:");
			grid.add(pw, 0, 2);
			PasswordField pwBox = new PasswordField();
			grid.add(pwBox, 1, 2);
			
			Button btn = new Button("Ingresar");
			HBox hbBtn = new HBox(10);
			hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
			hbBtn.getChildren().add(btn);
			grid.add(hbBtn, 1, 4);
			
			
			btn.setOnAction(e-> { actiontarget.setFill(Color.FIREBRICK);
			                      actiontarget.setText("Botón de ingresar presionado");
			                    });
			
			Scene scene = new Scene(grid,300,275);
			
			scene.getStylesheets().add
			 (Main.class.getResource("application.css").toExternalForm());
			
			primaryStage.setTitle("Ejemplo de Login Sencillo");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
