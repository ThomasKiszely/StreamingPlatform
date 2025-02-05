module com.thomas.streamingplatform {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.thomas.streamingplatform to javafx.fxml;
    exports com.thomas.streamingplatform;
}