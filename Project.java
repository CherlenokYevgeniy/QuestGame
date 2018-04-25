package project;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Project extends Application {
    private MediaPlayer mediaplayer;
    Stage window;
    @Override
    public void start(Stage stage) throws Exception{
        //freezing the csene increasing button
        stage.setResizable(false);

        //making confirmation box, when you want to exit programm
        window = stage;
        window.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent we) {
            	we.consume();
            	closeProgram();
            }
            private void closeProgram() {
                byte response = ConfirmBox.display("Exit", "Do you really want to close?");
                if(response==1) {
                        window.close();
                }
            }
        }); 
        
        //making roots and using grigpane
        GridPane root = new GridPane();
        GridPane root2 = new GridPane();
        GridPane root3 = new GridPane();
        GridPane root4 = new GridPane();
        GridPane root5 = new GridPane();
        GridPane root6 = new GridPane();
        GridPane root7 = new GridPane();
        GridPane root8 = new GridPane();
        GridPane root9 = new GridPane();
        GridPane root10 = new GridPane();
        GridPane root11 = new GridPane();
        GridPane root12 = new GridPane();
        GridPane root100 = new GridPane();
        
        
        //making mediaplayer with 2 functions togglebutton
        ToggleGroup group = new ToggleGroup();
        ToggleButton tb1 = new ToggleButton("music");
        
        tb1.setToggleGroup(group);
        group.selectedToggleProperty().addListener(event->{
            //when toggle button pressed one time music sounds
            //when pressed twice, music stops
            if(group.getSelectedToggle() != null){
                mediaplayer.play();
            }else{
                mediaplayer.stop();
            }
        });
        //choicing music file
        Media musicFile= new Media("file:///C:/Users/Жека/Desktop/Zheka's/music/1.mp3");
        mediaplayer=new MediaPlayer(musicFile);
        //making repeatings of music file
        mediaplayer.setCycleCount(MediaPlayer.INDEFINITE);
        
        //labels for the programm
        Label lbl = new Label("If they told me what the world would become, I would not have believed them.\n"+
                "\n"+
                "First, there was the nanophage.\n"+
                "\n"+
                "The disease of transition. A digital plague that swept across the land, killing \n"+
                "thousands upon thousands of augmented souls. A heavy cost for meddling with our \n"+
                "minds and bodies.\n"+
                "\n"+
                "Then came the war. The big one. The Great Decimation. The west kill the east. The \n"+
                "east kill the west. There were no winners, except for CHIRON.\n"+
                "\n"+
                "The corporation seized power and forged the Fifth Polish Republic. A crooked empire\n"+
                "of blood and ash. There was no one left to oppose them.\n"+
                "\n"+"\n");
        
        Label lbl2 = new Label("But still, we endured. And so it goes. The rich get richer, as the poor \n"+
                "rot away in there hovels, desperately looking for ways to escape reality.\n"+
                "\n"+
                "I am what they fear. A corporate tool of oppression. A despiced leech that \n"+
                "creeps into your dreams feeds of your fears . \n"+
                "\n"+
                "If you don’t remember.\n"+
                "If you will not remember.\n"+
                "That’s when they call me.\n"+
                "To access you.\n"+
                "To gather evidence .\n"+
                "To dredge up whatever’s hiding in the darkest corners of your mind.\n"+
                "\n"+
                "My name is Cherlenok Yevgeniy.\n"+
                "I am an Observer.");
        Label lbl3 = new Label("You'll be new observer of 15th station. \n"+
                "\n"+
                "A week ago, one replicant escaped from the western colony of your station.\n"+
                "His capture will be your first mission.\n"+
                "\n"+
                "You must go to New York, Bernard Ebbers will meet you there. \n" +
                "He once worked with us, but resigned. he knows absolutely everything\n"+
                "about this city.");
        Label lbl4 = new Label("Tavern number 18. New York city. \n" +
                "\n"+
                "-How can I help you? \n" +
                "Oh, my god, I think, that you're our new observer.\n"+
                "If you're looking for Bernard Ebbers, he often sits here \n"+
                "on the second floor at the very end of the hall.\n" +
                "Do you want to drink something for my bill? \n"
                );
        Label lbl5 = new Label("Tavern number 18, second floor.\n"+
                "\n"+
                "You must be a new observer. Yevgeniy informed me of your visit.\n"+
                "If I do not doubt this is your first mission.\n"+
                "\n"+
                "What exactly do you want to know?");
        Label lbl6 = new Label("Early in the 21st Century, NEXUS CORPORATION advanced robot evolution\n"+
                "into the NEXUS phase-a being virtually identical to a human-known as a Replicant.\n"+
                "\n"+
                "The NEXUS 6 Replicants were superior in strength and agility, and at least\n"+
                "equal in intelligence, to the genetic engineers who created them.\n"+
                "Replicants were used Off-World as slave labor, in the hazardous exploration and\n"+
                "colonization of other planets. \n"+
                "\n"+
                "After a bloody mutiny by a NEXUS 6 combat team in an Off-World colony,\n"+
                " Replicants were declared illegal on earth - under penalty of death. \n"+
                "\n"+
                "This was not called execution. It was called retirement.\n"+
                "Special police squads - Observers - had orders to shoot to kill, upon\n"+
                "detection, any trespassing Replicant.\n");
        Label lbl7 = new Label("If only you could see what I've seen with your eyes.\n"+
                "\n"+
                "I have a hunch where he can be. Maybe he's in the Quarry Quarter.\n"+
                "Most replicants gather there for recharging.\n"+
                "I can not help you with anything else.\n" +
                "\n"+
                "Here my role in this mission ends.\n"+
                "Good luck.");
        Label lbl8 = new Label("Quarry Quarter, Express snackbar\n"+
                "\n"+
                "For many people in New York, Quarry Quarter represents a criminal and \n"+
                "economic hell, a place where the poorest of the poor live.\n"+
                "Shops selling alcohol and churches make up the landscape of this district.\n"+
                "In certain places along the avenue number 4, drug dealers are waiting for buyers.\n"+
                "A lot of express snackbars. Restaurants - almost anomaly.\n"+
                "There is only one supermarket, lonely standing south of the clinic for the \n"+
                "mentally ill. Everything around is represented by decadence and hopelessness.\n");
        Label lbl9 = new Label("Quarry Quarter, Main charging unit\n"+
                "\n"+
                "I know that you are looking for me, but I was not going to hide.\n"+
                "I knew that you would come here.\n"+
                "\n"+
                "The light that burns twice as bright burns half as long.\n"+
                "\n"+
                "I've seen things you people wouldn't believe. Attack ships on fire off \n"+
                "the shoulder of Orion. I watched C–beams glitter in the darkness at \n"+
                "Tannhauser Gate. All those moments will be lost in time like tears \n"+
                "in rain.\n"+
                "\n"+
                "Time to die.");
        Label lbl10 = new Label("If only you could see what I've seen with your eyes.\n"+
                "\n"+
                "I have a hunch where he can be. Maybe he's in the Quarry Quarter.\n"+
                "Most replicants gather there for recharging.\n"+
                "\n"+
                "Do you want to ask me something else?");
        Label lbl11 = new Label("Early in the 21st Century, NEXUS CORPORATION advanced robot evolution\n"+
                "into the NEXUS phase-a being virtually identical to a human-known as a Replicant.\n"+
                "The NEXUS 6 Replicants were superior in strength and agility, and at least\n"+
                "equal in intelligence, to the genetic engineers who created them.\n"+
                "Replicants were used Off-World as slave labor, in the hazardous exploration and\n"+
                "colonization of other planets. \n"+
                "After a bloody mutiny by a NEXUS 6 combat team in an Off-World colony,\n"+
                " Replicants were declared illegal on earth - under penalty of death. \n"+
                "\n"+
                "This was not called execution. It was called retirement.\n"+
                "Special police squads - Observers - had orders to shoot to kill, upon\n"+
                "detection, any trespassing Replicant.\n"+
                "\n"+
                "I can not help you with anything else.\n" +
                "Here my role in this mission ends.\n"+
                "Good luck.");
        
        //making scenes with pref size
        Scene scene = new Scene (root, 500, 300);
        Scene scene2 = new Scene (root2, 500, 300);
        Scene scene3 = new Scene (root3, 500, 300);
        Scene scene4 = new Scene (root4, 500, 300);
        Scene scene5 = new Scene (root5, 500, 300);
        Scene scene6 = new Scene (root6, 500, 300);
        Scene scene7 = new Scene (root7, 500, 300);
        Scene scene8 = new Scene (root8, 500, 300);
        Scene scene9 = new Scene (root9, 500, 300);
        Scene scene10 = new Scene (root10, 500, 300);
        Scene scene11 = new Scene (root11, 500, 300);
        Scene scene12 = new Scene (root12, 500, 300);
        
        //buttons with the names
        Button btn = new Button("START");
        Button btn2 = new Button("next");
        Button btn3 = new Button("next");
        Button btn4 = new Button("back");
        Button btn5 = new Button("next");
        Button btn6 = new Button("No sir, but thanks for the info.");
        Button btn7 = new Button("back");
        Button btn8 = new Button("What happened to that replicant?");
        Button btn9 = new Button("Why did you leave this work?");
        Button btn10 = new Button("Thank you for this help.");
        Button btn11 = new Button("next");
        Button btn12 = new Button("END of 1st chapter");
        Button btn13 = new Button("back");
        Button btn14 = new Button("Why did you leave this work?");
        Button btn15 = new Button("What happened to that replicant?");
        Button btn16 = new Button("Thank you for this help.");
        
        //setting events on buttons
        btn.setOnAction(e->stage.setScene(scene2));
        btn2.setOnAction(e->stage.setScene(scene3));
        btn3.setOnAction(e->stage.setScene(scene4));
        btn4.setOnAction(e->stage.setScene(scene2));
        btn5.setOnAction(e->stage.setScene(scene5));
        btn6.setOnAction(e->stage.setScene(scene6));
        btn7.setOnAction(e->stage.setScene(scene3));
        btn8.setOnAction(e->stage.setScene(scene7));
        btn9.setOnAction(e->stage.setScene(scene8));
        btn10.setOnAction(e->stage.setScene(scene9));
        btn11.setOnAction(e->stage.setScene(scene10));
        btn12.setOnAction(e->stage.setScene(scene));
        btn13.setOnAction(e->stage.setScene(scene));
        btn14.setOnAction(e->stage.setScene(scene11));
        btn15.setOnAction(e->stage.setScene(scene12));
        btn16.setOnAction(e->stage.setScene(scene9));
        
        //connecting roots with css
        root.setId("bkg");
        root2.setId("bkg2");
        root3.setId("bkg3");
        root4.setId("bkg4");
        root5.setId("bkg5");
        root6.setId("bkg6");
        root7.setId("bkg7");
        root8.setId("bkg8");
        root9.setId("bkg9");
        root10.setId("bkg10");
        root11.setId("bkg11");
        root12.setId("bkg12");

       //adding all buttons and labels
        root.getChildren().addAll(btn,tb1);
            btn.setTranslateX(220);
            btn.setTranslateY(140);
            btn.setPrefSize(70,20);
            tb1.setTranslateX(10);
            tb1.setTranslateY(10);
        root2.getChildren().addAll(btn2,lbl,btn13);
            lbl.setTranslateX(10);
            lbl.setTranslateY(-5);
            btn2.setTranslateX(430);
            btn2.setTranslateY(165);
            btn2.setPrefSize(50,20);
            btn13.setTranslateX(20);
            btn13.setTranslateY(165);
            btn13.setPrefSize(50,20);
        root3.getChildren().addAll(btn4,btn3,lbl2);
            lbl2.setTranslateX(10);
            lbl2.setTranslateY(10);
            btn4.setTranslateX(20);
            btn4.setTranslateY(165);
            btn4.setPrefSize(50,20);
            btn3.setTranslateX(430);
            btn3.setTranslateY(165);
            btn3.setPrefSize(50,20);
        root4.getChildren().addAll(btn5,btn7,lbl3);
            lbl3.setTranslateX(10);
            lbl3.setTranslateY(10);
            btn5.setTranslateX(430);
            btn5.setTranslateY(215);
            btn5.setPrefSize(50,20);
            btn7.setTranslateX(20);
            btn7.setTranslateY(215);
            btn7.setPrefSize(50,20);
        root5.getChildren().addAll(btn6,lbl4);
            lbl4.setTranslateX(10);
            lbl4.setTranslateY(10);
            btn6.setTranslateX(20);
            btn6.setTranslateY(222);
            btn6.setPrefSize(460,20);
        root6.getChildren().addAll(btn8,lbl5,btn14);
            lbl5.setTranslateX(10);
            lbl5.setTranslateY(10);
            btn8.setTranslateX(20);
            btn8.setTranslateY(230);
            btn8.setPrefSize(460,20);
            btn14.setTranslateX(20);
            btn14.setTranslateY(200);
            btn14.setPrefSize(460,20);
        root7.getChildren().addAll(lbl6,btn9);
            lbl6.setTranslateX(10);
            lbl6.setTranslateY(10);
            btn9.setTranslateX(20);
            btn9.setTranslateY(175);
            btn9.setPrefSize(460,20);
        root8.getChildren().addAll(btn10,lbl7);
            lbl7.setTranslateX(10);
            lbl7.setTranslateY(10);
            btn10.setTranslateX(20);
            btn10.setTranslateY(215);
            btn10.setPrefSize(460,20);
        root9.getChildren().addAll(btn11,lbl8);
            lbl8.setTranslateX(10);
            lbl8.setTranslateY(10);
            btn11.setTranslateX(430);
            btn11.setTranslateY(210);
            btn11.setPrefSize(50,20);
        root10.getChildren().addAll(btn12,lbl9);
            lbl9.setTranslateX(10);
            lbl9.setTranslateY(10);
            btn12.setTranslateX(175);
            btn12.setTranslateY(180);
            btn12.setPrefSize(150,20);
        root11.getChildren().addAll(btn15,lbl10);
            lbl10.setTranslateX(10);
            lbl10.setTranslateY(10);
            btn15.setTranslateX(20);
            btn15.setTranslateY(230);
            btn15.setPrefSize(460,20);
        root12.getChildren().addAll(btn16,lbl11);
            lbl11.setTranslateX(10);
            lbl11.setTranslateY(10);
            btn16.setTranslateX(20);
            btn16.setTranslateY(160);
            btn16.setPrefSize(460,20);
        
        
        //programm scenes connecting with css
        scene.getStylesheets().addAll(this.getClass().getResource("style1.css").toExternalForm());
        scene2.getStylesheets().addAll(this.getClass().getResource("style1.css").toExternalForm());
        scene3.getStylesheets().addAll(this.getClass().getResource("style1.css").toExternalForm());
        scene4.getStylesheets().addAll(this.getClass().getResource("style1.css").toExternalForm());
        scene5.getStylesheets().addAll(this.getClass().getResource("style1.css").toExternalForm());
        scene6.getStylesheets().addAll(this.getClass().getResource("style1.css").toExternalForm());
        scene7.getStylesheets().addAll(this.getClass().getResource("style1.css").toExternalForm());
        scene8.getStylesheets().addAll(this.getClass().getResource("style1.css").toExternalForm());
        scene9.getStylesheets().addAll(this.getClass().getResource("style1.css").toExternalForm());
        scene10.getStylesheets().addAll(this.getClass().getResource("style1.css").toExternalForm());
        scene11.getStylesheets().addAll(this.getClass().getResource("style1.css").toExternalForm());
        scene12.getStylesheets().addAll(this.getClass().getResource("style1.css").toExternalForm());
        
        //name of the programm
        stage.setTitle("Quest Game (1st ch)");
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
   