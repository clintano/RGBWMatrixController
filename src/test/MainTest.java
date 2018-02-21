package test;

import main.core.model.panel.LedPanel;
import main.gui.app.MatrixControllerApp;

public class MainTest {

	public static void main(String[] args) {

		MatrixControllerApp app = new MatrixControllerApp();
		app.launchApp();
	}

	public static LedPanel getAppConfig() {
		LedPanel ledPanel = new LedPanel();
		ledPanel.setCurrentAnimation(new TestAnimation());
		// ledPanel.setCurrentAnimation(RandomPop.classicalRGBColorPop(50, 1, 0));
		return ledPanel;
	}
}