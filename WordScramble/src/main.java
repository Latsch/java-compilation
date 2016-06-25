import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by sebas on 25.06.2016.
 */
public class main extends Application{


    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("WordScramble");

        //Creating a GridPane container
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);


        //Adding a Label
        final Label label = new Label();
        GridPane.setConstraints(label, 0, 3);
        GridPane.setColumnSpan(label, 2);
        grid.getChildren().add(label);


        //Defining the Name text field
        final TextField name = new TextField();
        name.setPromptText("Enter a word.");
        name.setPrefColumnCount(10);
        name.getText();
        GridPane.setConstraints(name, 0, 0);
        grid.getChildren().add(name);

        //Defining the Comment text field
        final TextField comment = new TextField();
        comment.setPrefColumnCount(30);
        comment.setPromptText("Output.");
        GridPane.setConstraints(comment, 0, 2);
        grid.getChildren().add(comment);

        //Defining the Submit button
        Button submit = new Button("Submit");
        GridPane.setConstraints(submit, 1, 0);
        grid.getChildren().add(submit);

        //Setting an action for the Submit button
        submit.setOnAction(e -> {
            if (!name.getText().isEmpty()) {
                WordScramble scramble = new WordScramble();
                try {
                    String s = scramble.Scramble(name.getText());
                    s = s.replaceAll("\\p{P}","");
                    comment.setText(s);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                name.clear();
                name.setPromptText("Success!");
            } else {
                name.setPromptText("Write a word");
            }
        });

        //Defining the Clear button
        Button clear = new Button("Clear");
        GridPane.setConstraints(clear, 1, 1);
        grid.getChildren().add(clear);

        clear.setOnAction(e -> {
            name.clear();
            label.setText(null);
            name.setPromptText("Enter a word");
        });

        Scene scene = new Scene(grid, 450, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
