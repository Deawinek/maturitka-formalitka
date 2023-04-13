package com.example.douckopgr;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Menu file;

    @FXML
    private MenuItem close;

    @FXML
    private Rectangle rectangle;

    @FXML
    private TextField tf1;

    @FXML
    private Button check;

    @FXML
    private Button next;

    @FXML
    private Label score;

    @FXML
    private Text number;

    @FXML
    private Text vysledek;
    private int iscore = 0;

    @FXML
    private ImageView imgView;

    private MojeBarvy barvy[]={new MojeBarvy("red", Color.RED),new MojeBarvy("green", Color.GREEN), new MojeBarvy("blue", Color.BLUE),new MojeBarvy("yellow", Color.YELLOW), new MojeBarvy("black", Color.BLACK)};

    private MojeBarvy actBarva;
    public void closeApp(ActionEvent actionEvent) {
        Platform.exit();

    }


    public void nextColor(ActionEvent actionEvent) {
        actBarva = barvy[(int)Math.round(Math.random()*(barvy.length-1))];
        rectangle.setFill(actBarva.getBarva());
        tf1.setText("");
        vysledek.setVisible(false);
        next.setVisible(false);

    }


    public void checkName(ActionEvent actionEvent) {
        String odpoved = tf1.getText();
        if(odpoved.equalsIgnoreCase(actBarva.getName())){
            iscore += 10;
            number.setText(String.valueOf(iscore));
            vysledek.setText("Right");
            vysledek.setVisible(true);
            next.setVisible(true);
        }else {
            iscore -= 10;
            number.setText(String.valueOf(iscore));
            vysledek.setText("Falls");
            vysledek.setVisible(true);
            next.setVisible(true);
        }
    }

   // public void save()



    @Override
    public void initialize(URL location, ResourceBundle resources) {
      nextColor(null);
    }
}
