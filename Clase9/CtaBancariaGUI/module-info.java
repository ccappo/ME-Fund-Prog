module ComboBoxDemo {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	//opens application to javafx.graphics, javafx.fxml, javafx.base;
	opens application to javafx.graphics, javafx.fxml, javafx.base;
}
