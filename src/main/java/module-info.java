module com.example.analisis_algoritmos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.analisis_algoritmos to javafx.fxml;
    exports com.example.analisis_algoritmos;
}