module com.example.csc311_gui_basics {
    requires javafx.controls;
    requires javafx.fxml;
/**
 * specifies additional libraries we need for the applciaiton
 */

    opens com.example.csc311_gui_basics to javafx.fxml;
    exports com.example.csc311_gui_basics;
}