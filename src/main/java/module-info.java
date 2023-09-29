module com.example.exercicios {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicios to javafx.fxml;
    exports com.example.exercicios;
}