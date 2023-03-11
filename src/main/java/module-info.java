module com.example.labb4_soduku {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labb4_soduku to javafx.fxml;
    exports com.example.labb4_soduku;
}