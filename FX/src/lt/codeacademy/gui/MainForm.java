package lt.codeacademy.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainForm extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("MK Test!");

		StackPane root = new StackPane();
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
		primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
			public void handle(final KeyEvent keyEvent) {
				switch (keyEvent.getCode()) {
				case UP:
					upArrow();
					break;
				case DOWN:
					downArrow();
					break;
				case LEFT:
					leftArrow();
					break;
				case RIGHT:
					rightArrow();
					break;
				default:
					break;
				}
				keyEvent.consume();
			}

		});
	}

	private void upArrow() {
		System.out.println("Up");

	}

	private void rightArrow() {
		System.out.println("Right");
	}

	private void leftArrow() {
		System.out.println("Left");
	}

	private void downArrow() {
		System.out.println("Down");
	}
}
