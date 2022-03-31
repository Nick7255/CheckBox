package com.example.checkbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private CheckBox myCheckBox;
    @FXML
    private Label myLabel;
    @FXML
    private ImageView myImageView;

    Image myImage1 = new Image(getClass().getResourceAsStream("image1.png"));
    Image myImage2 = new Image(getClass().getResourceAsStream("image2.jpg"));

    public void change(ActionEvent event) {
        if (myCheckBox.isSelected()) {
            System.out.println("ON");
            myLabel.setText("ON");
            myImageView.setImage(myImage1);
        } else {
            System.out.println("OFF");
            myLabel.setText("OFF");
            myImageView.setImage(myImage2);
        }
    }
}