module JavaFX_toGIT {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
