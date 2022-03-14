import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TaskB extends Application 
{
    private Label resultLabel;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        Button rollButton = new Button("Roll");

        rollButton.setOnAction(new RollButtonHandler());

        resultLabel = new Label();

        Image die1Image = new Image("file:Die1.bmp");

        Image die2Image = new Image("file:Die2.bmp");

        Image die3Image = new Image("file:Die3.bmp");

        Image die4Image = new Image("file:Die4.bmp");

        Image die5Image = new Image("file:Die5.bmp");

        Image die6Image = new Image("file:Die6.bmp");

        ImageView die1imageView = new ImageView(die1Image);

        ImageView die2imageView = new ImageView(die2Image);

        ImageView die3imageView = new ImageView(die3Image);

        ImageView die4imageView = new ImageView(die4Image);

        ImageView die5imageView = new ImageView(die5Image);

        ImageView die6imageView = new ImageView(die6Image);

        HBox hbox = new HBox(10, die1imageView, die2imageView, die3imageView, die4imageView, die5imageView, die6imageView);

        VBox vbox = new VBox(10, rollButton, resultLabel);

        vbox.setAlignment(Pos.CENTER);

        vbox.setPadding(new Insets(10));

        Scene scene = new Scene(vbox);

        primaryStage.setTitle("Roll Some Dice!");

        primaryStage.setScene(scene);

        primaryStage.setScene(new Scene(hbox));

        primaryStage.show();
    }

    class RollButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            Random rand = new Random();

            int n = rand.nextInt(6);

            int m = rand.nextInt(6);

            n += 1;

            m += 1;

            if (n == 1)
            {
                ImageView die1imageView = new ImageView(new Image("file:Die1.bmp"));
            }

            if (n == 2)
            {
                ImageView die2imageView = new ImageView(new Image("file:Die2.bmp"));
            }

            if (n == 3)
            {
                ImageView die3imageView = new ImageView(new Image("file:Die3.bmp"));
            }

            if (n == 4)
            {
                ImageView die4imageView = new ImageView(new Image("file:Die4.bmp"));
            }

            if (n == 5)
            {
                ImageView die5imageView = new ImageView(new Image("file:Die5.bmp"));
            }

            if (n == 6)
            {
                ImageView die6imageView = new ImageView(new Image("file:Die6.bmp"));
            }

            if (m == 1)
            {
                ImageView die1imageView = new ImageView(new Image("file:Die1.bmp"));
            }

            if (m == 2)
            {
                ImageView die2imageView = new ImageView(new Image("file:Die2.bmp"));
            }

            if (m == 3)
            {
                ImageView die3imageView = new ImageView(new Image("file:Die3.bmp"));
            }

            if (m == 4)
            {
                ImageView die4imageView = new ImageView(new Image("file:Die4.bmp"));
            }

            if (m == 5)
            {
                ImageView die5imageView = new ImageView(new Image("file:Die5.bmp"));
            }

            if (m == 6)
            {
                ImageView die6imageView = new ImageView(new Image("file:Die6.bmp"));
            }

            resultLabel.setText(String.format("Your two random numbers are: %d and %d ", n, m));

        }
    }
}
