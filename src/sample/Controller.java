package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.scene.control.Label;
import java.lang.*;
import javafx.scene.control.Button;

import java.awt.*;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class Controller {
    public GridPane gridpane;
    public Button backwardButton;
    public Button forwardButton;
    public Label tabLabel;
    public Label QuestionLabel;
    public String totalQuestions;

    int click;

    String question;

    @FXML
    private void initialize(){
        click = 1;
        totalQuestions = "2";
        tabLabel.setText("Tab 1 out of " + totalQuestions);
        QuestionLabel.setText("Question #" + click);
    }

    public void updateScreen() {
        /*for (click = 0; click < parseInt(totalQuestions); click++){
            tabLabel.setText("Tab" + click + "out of " + totalQuestions);
        }*/
    }

    public void updateScreen1() {
        /*for (click = 0; click < parseInt(totalQuestions); click = click - 1){
            tabLabel.setText("Tab " + click + "out of " + totalQuestions);
        }*/
    }

    public void handleButtonActionForward(ActionEvent actionEvent) {
        try {
            if(click < parseInt(totalQuestions)){
                click = click + 1;
                tabLabel.setText("Tab " + click + " out of " + totalQuestions);
            }else{
                tabLabel.setText("Tab " + click + " out of " + totalQuestions);
            }
            question = "Question #" + click + ": ";
            QuestionLabel.setText(question);
            //updateScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void handleButtonActionBackward(ActionEvent actionEvent){
        try {
            if (click != 1){
                click = click - 1;
                tabLabel.setText("Tab " + click + " out of " + totalQuestions);
            }else{
                tabLabel.setText("Tab " + click + " out of " + totalQuestions);
            }
            question = "Question #" + click + ": ";
            QuestionLabel.setText(question);
            //updateScreen1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //increment a variable clicks by one on every click
    //set label text to "tab" + clicks + "out of some number"
    //make clicks public so it can be used throughout the controller class

}