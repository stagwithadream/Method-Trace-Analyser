package method_trace_analyser.view;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApplication extends Application {
	 
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/FXML/Main.fxml"));
			Scene scene = new Scene(root);
			System.out.println("yey");
			scene.getStylesheets().add(getClass().getResource("/css/main.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
			 
		}
	  
	}
	public static void main(String[] args) {
		launch(args);
	}
}