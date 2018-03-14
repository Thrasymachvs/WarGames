package main;
import java.io.IOException;

import board_gui.BGE_GUI;
import board_gui.Board;
import boardgamerepo.TicTacToeBoard;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Main extends Application{

	static Board newBoard; 
	static BGE_GUI bge;
	
	public static void main(String[] args) {
        Application.launch(args);
    }
	
	
	@Override 
	public void start (Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/resources/InitialView.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("War Games");
        primaryStage.setScene(new Scene(root, 450, 450));
        primaryStage.show();
        /*
		newBoard = new TicTacToeBoard();
		
		bge = new BGE_GUI(newBoard, primaryStage);
		
		bge.startDisplay(primaryStage);
		bge.display(primaryStage);
		
		bge.mouseClickListener();
		*/
	}
	
}