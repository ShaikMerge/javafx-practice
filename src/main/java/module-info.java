module com.org.fx.hellofx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.org.fx.hellofx to javafx.fxml;
    exports com.org.fx.hellofx;
}