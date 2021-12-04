module com.calcul.test {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.calcul.test to javafx.fxml;
    exports com.calcul.test;
}