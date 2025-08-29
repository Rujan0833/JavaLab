package Part4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class q51 extends Application {
    public void start(Stage stage) {
        // FlowPane
        FlowPane fp = new FlowPane();
        fp.getChildren().addAll(new Button("F1"), new Button("F2"), new Button("F3"));

        // HBox & VBox
        HBox hb = new HBox(5, new Button("H1"), new Button("H2"));
        VBox vb = new VBox(5, new Button("V1"), new Button("V2"));

        // GridPane
        GridPane gp = new GridPane();
        gp.setHgap(5); gp.setVgap(5);
        gp.add(new Button("G1"),0,0); gp.add(new Button("G2"),1,0);
        gp.add(new Button("G3"),0,1); gp.add(new Button("G4"),1,1);

        // BorderPane
        BorderPane bp = new BorderPane();
        bp.setTop(fp); bp.setLeft(hb); bp.setRight(vb); bp.setCenter(gp);

        stage.setScene(new Scene(bp,400,300));
        stage.setTitle("JavaFX Layout Demo");
        stage.show();
    }

    public static void main(String[] args) { launch(); }
}
