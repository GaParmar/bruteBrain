import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.scene.paint.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;

public class face extends Application
{
	@Override
	public void start(Stage primaryStage)
	{

		Group root = new Group();

		Scene scene = new Scene (root, 600, 350);
		scene.setFill(Color.BLACK);
		scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

		Line sep = new Line ();
		sep.setStartX(320);
		sep.setStartY(0);
		sep.setEndX(320);
		sep.setEndY(350);
		sep.setStrokeWidth(5);
		sep.setStroke(Color.RED);

		Text conf = new Text("CONFIGURATION");
		conf.setFont(new Font(35));
		conf.setX(10);
		conf.setY(40);
		conf.setFill(Color.GREY);
		conf.setStroke(Color.WHITE);
		Text match = new Text("Matches Found");
		match.setX(350);
		match.setY(40);
		match.setFill(Color.WHITE);
		match.setStroke(Color.GREY);
		match.setFont(new Font(30));

		GridPane mat = new GridPane();
		mat.setMinSize(300, 350);
		mat.setVgap(15);
		mat.setHgap(0);
		mat.setPadding(new Insets(60, 0, 10, 10)); 

		// SETTING THE LABELS
		Text lengthLabel = new Text("LENGTH:\t");
		textConfigs(lengthLabel);	mat.add(lengthLabel, 0, 0); 
		TextField lengthField = new TextField();	mat.add(lengthField, 1, 0); lengthField.setPrefWidth(40);
		Text includeLabel = new Text("INCLUDE:\t");
		textConfigs(includeLabel);	mat.add(includeLabel, 0, 1);
		TextField includeField = new TextField();	mat.add(includeField, 1, 1); includeField.setPrefWidth(40);
		Text excludeLabel = new Text("EXCLUDE:\t");
		textConfigs(excludeLabel);	mat.add(excludeLabel, 0, 2);
		TextField excludeField = new TextField();	mat.add(excludeField, 1, 2); excludeField.setPrefWidth(40);
		Text enableLabel = new Text("ENABLE THREADING:\t");
		textConfigs(enableLabel);	mat.add(enableLabel, 0, 3);
		TextField enableField = new TextField();	mat.add(enableField, 1, 3); enableField.setPrefWidth(40);
		Text numThreadLabel = new Text("Number of threads allocated: ");
		textConfigs(numThreadLabel);	mat.add(numThreadLabel, 0, 4);
		TextField threadField = new TextField(); mat.add(threadField, 1, 4); threadField.setPrefWidth(40);

		// SETTING THE INPUT FIELDS
		CheckBox threadS = new CheckBox("");
		threadS.setIndeterminate(false);
		//threadS.setX(200); threadS.setY(200);

		//BUTTON
		Button start = new Button ("START");
		start.setLayoutX(110);
		start.setLayoutY(270);
		start.setOnAction(new EventHandler<ActionEvent>() 
			{
            @Override
            public void handle(ActionEvent event) {
                System.out.println("BUTTON CLICKED");
                try
                {
                	int len = Integer.parseInt(lengthField.getText());
                	char[] include = includeField.getText().toCharArray();
                	char[] exclude = excludeField.getText().toCharArray();
                }
                catch(NullPointerException e)
                {}
            }
        });

		root.getChildren().add(sep);
		root.getChildren().add(conf);
		root.getChildren().add(mat);/*
		root.getChildren().add(lengthLabel);
		root.getChildren().add(includeLabel);
		root.getChildren().add(excludeLabel);
		root.getChildren().add(enableLabel);
		root.getChildren().add(numThreadLabel);*/
		root.getChildren().add(match);
		root.getChildren().add(start);
		primaryStage.setTitle("ThE bRaIn");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void textConfigs(Text text)
	{
		text.setFill(Color.WHITE);
		text.setStroke(Color.GREY);
		text.setStrokeWidth(0.75);
		text.setX(10);
		text.setFont(new Font(20));
	}

	public static void main (String args[])
	{
		launch(args);
	}
}