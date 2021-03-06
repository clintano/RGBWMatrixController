package main.gui.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import main.core.model.panel.LedPanel;
import main.gui.views.MainViewController;
import test.MainTest;

public class MatrixControllerApp extends Application {

	private LedPanel ledPanel;

	private MainViewController mainViewController;

	public MatrixControllerApp() {
	}

	public void setLedPanel(LedPanel ledPanel) {
		this.ledPanel = ledPanel;
	}

	public void launchApp() {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root;
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MatrixControllerApp.class.getResource("/main/gui/views/MainView.fxml"));
		root = (BorderPane) loader.load();
		mainViewController = loader.getController();
		ledPanel = MainTest.getAppConfig();
		mainViewController.setLedPanel(ledPanel);

		Scene scene = new Scene(root);
		primaryStage.setTitle("Test");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
