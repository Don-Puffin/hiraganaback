module com.example.hiraganaapi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hiraganaapi to javafx.fxml;
    exports com.example.hiraganaapi;
}