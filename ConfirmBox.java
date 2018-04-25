package project;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ConfirmBox {
    static byte answer;

    public static byte display(String title, String message) {
        final Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);

        //Creating two buttons
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");
        yesButton.setStyle("-fx-background-color:#c3c4c4,\n" +
            " linear-gradient(#d6d6d6 50%, white 100%),\n" +
            " radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%);\n" +
            "-fx-background-radius: 30;\n" +
            "-fx-background-insets: 0,1,1;\n" +
            "-fx-text-fill: black;\n" +
            "-fx-font-family: \"Arial Narrow\";\n" +
            "-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
            noButton.setStyle("-fx-background-color:#c3c4c4,\n" +
            " linear-gradient(#d6d6d6 50%, white 100%),\n" +
            " radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%);\n" +
            "-fx-background-radius: 30;\n" +
            "-fx-background-insets: 0,1,1;\n" +
            "-fx-text-fill: black;\n" +
            "-fx-font-family: \"Arial Narrow\";\n" +
            "-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );");
        label.setFont(Font.font("Ar Julian", FontWeight.EXTRA_BOLD,15));
        
        yesButton.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
	    		answer = 1;
	            window.close();
            }
	    });
        
        noButton.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
	    		answer = 0;
	            window.close();
            }
	    });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yesButton, noButton);
            label.setTranslateX(10);
            label.setTranslateY(10);
            yesButton.setTranslateX(30);
            yesButton.setTranslateY(20);
            yesButton.setPrefSize(40,20);
            noButton.setTranslateX(165);
            noButton.setTranslateY(-12);
            noButton.setPrefSize(40,20);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        
        return answer;
    }
}