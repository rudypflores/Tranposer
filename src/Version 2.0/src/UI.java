import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.event.EventHandler;

import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.geometry.Insets;


public class UI extends Application {

    public static void main(String[] args) {
          launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Main Pane Setup
        BorderPane bp = new BorderPane();
        Scene scene = new Scene(bp, 1280, 720);
        VBox verticalLayout = new VBox(25);

        // Set size of center vbox
        verticalLayout.setPrefWidth(scene.getWidth()/2);
        verticalLayout.setPrefHeight(scene.getHeight()/2);
        verticalLayout.setAlignment(Pos.CENTER);

        // Import a CSS stylesheet
        scene.getStylesheets().add(UI.class.getResource("UI.css").toExternalForm());

        // Welcome text
        Text txtWelcome = new Text("Welcome to the Transposer application!");
        txtWelcome.setId("title");

        // Begin button
        Button btnStart = new Button("Begin transposing");
        btnStart.setId("button");
        btnStart.setOnMouseClicked(event -> {

            // When mouse is clicked
            verticalLayout.getChildren().clear();

            txtWelcome.setText("What chords do you wish to transpose?");
            
            // Create a text field for the user to input chords
            TextField input = new TextField();
            input.setId("textfield");
            input.setMinHeight(35);
            input.setMaxWidth(verticalLayout.getWidth()/2);
            input.setAlignment(Pos.CENTER);

            TextField result = new TextField();
            result.setEditable(false);

            // Button that will be another option of submitting input instead of "enter"
            Button btnSubmit = new Button("Transpose");
            btnSubmit.setId("button");
            btnSubmit.setOnMouseClicked(e -> {
                String in = input.getText();

                // The text object will display the result of transposing
                result.setText(in);
                result.setId("textfield");
                result.setMinHeight(35);
                result.setMaxWidth(verticalLayout.getWidth()/2);
                result.setAlignment(Pos.CENTER);

                // Result description
                Text resultText = new Text("Results from Transposing: " + in.toUpperCase());
                resultText.setId("title");

                // Allow user to return to main screen
                Button returnToMenu = new Button("Transpose again");
                returnToMenu.setId("button");

                // When the button is clicked
                returnToMenu.setOnMouseClicked(e2 -> {
                    input.clear();
                    verticalLayout.getChildren().clear();
                    verticalLayout.getChildren().addAll(txtWelcome, input, btnSubmit);
                });

                // Allow user to return to title screen
                Button btnTitleScreen = new Button("Return to title screen");
                btnTitleScreen.setId("button");

                btnTitleScreen.setOnMouseClicked(e2 -> {
                    input.clear();
                    verticalLayout.getChildren().clear();
                    txtWelcome.setText("Welcome to the Transposer application!");
                    verticalLayout.getChildren().addAll(txtWelcome, btnStart);
                });

                // Horizontal menu for buttons
                HBox horizontalLayout = new HBox(25);
                horizontalLayout.setAlignment(Pos.CENTER);

                horizontalLayout.getChildren().addAll(btnTitleScreen, returnToMenu);

                verticalLayout.getChildren().clear();
                verticalLayout.getChildren().addAll(resultText, result, horizontalLayout);
            });

            // When enter is pressed
            scene.setOnKeyPressed(e -> {
                if(e.getCode() == KeyCode.ENTER) {

                    String in = input.getText();

                    // The text object will display the result of transposing
                    result.setText(in);
                    result.setId("textfield");
                    result.setMinHeight(35);
                    result.setMaxWidth(verticalLayout.getWidth()/2);
                    result.setAlignment(Pos.CENTER);

                    // Result description
                    Text resultText = new Text("Results from Transposing: " + in.toUpperCase());
                    resultText.setId("title");

                    // Allow user to return to main screen
                    Button returnToMenu = new Button("Transpose again");
                    returnToMenu.setId("button");

                    // When the button is clicked
                    returnToMenu.setOnMouseClicked(e2 -> {
                        input.clear();
                        verticalLayout.getChildren().clear();
                        verticalLayout.getChildren().addAll(txtWelcome, input, btnSubmit);
                    });

                    // Allow user to return to title screen
                    Button btnTitleScreen = new Button("Return to title screen");
                    btnTitleScreen.setId("button");

                    btnTitleScreen.setOnMouseClicked(e2 -> {
                        input.clear();
                        verticalLayout.getChildren().clear();
                        txtWelcome.setText("Welcome to the Transposer application!");
                        verticalLayout.getChildren().addAll(txtWelcome, btnStart);
                    });

                    // Horizontal menu for buttons
                    HBox horizontalLayout = new HBox(25);
                    horizontalLayout.setAlignment(Pos.CENTER);

                    horizontalLayout.getChildren().addAll(btnTitleScreen, returnToMenu);

                    verticalLayout.getChildren().clear();
                    verticalLayout.getChildren().addAll(resultText, result, horizontalLayout);
                }
            });

            verticalLayout.getChildren().addAll(txtWelcome, input, btnSubmit);
            bp.setCenter(verticalLayout);
        });

        // Add nodes to main center pane
        verticalLayout.getChildren().addAll(txtWelcome, btnStart);
        bp.setCenter(verticalLayout);

        // Ownership disclaimer
        VBox bottom = new VBox(25);
        bottom.setAlignment(Pos.CENTER);
        
        Text copyright = new Text("Rudy Flores 2019");
        copyright.setId("copyright");
        bottom.getChildren().add(copyright);

        bp.setBottom(bottom);
        bottom.setMargin(copyright, new Insets(25));

        primaryStage.setTitle("Transposer App");
        primaryStage.getIcons().add(new Image("file:../img/transposer.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}