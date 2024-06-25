module com.led.led {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.led.led to javafx.fxml;
    exports com.led.led;
}