module es.ieslosmontecillos.di_t1a1_shanshangfeng {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens es.ieslosmontecillos.di_t1a1_shanshangfeng to javafx.fxml;
    exports es.ieslosmontecillos.di_t1a1_shanshangfeng;
}