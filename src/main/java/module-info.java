module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fiatalis.adminApp to javafx.fxml;
    exports com.fiatalis.adminApp;
}