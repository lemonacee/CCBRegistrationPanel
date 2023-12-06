module com.example.ccbaccounterstellen {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.ccbaccounterstellen to javafx.fxml;
    exports com.example.ccbaccounterstellen;
}