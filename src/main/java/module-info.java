module com.fiatalis.adminApp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fiatalis.adminApp to javafx.fxml;
    exports com.fiatalis.adminApp;
}