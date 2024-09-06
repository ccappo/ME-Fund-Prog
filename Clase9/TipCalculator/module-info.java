module TipCalculator {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens calculator to javafx.controls, javafx.graphics, javafx.fxml;
}
