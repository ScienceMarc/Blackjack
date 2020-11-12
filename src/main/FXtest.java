import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage; 

public class FXtest extends Application{
    @Override
    public void start(Stage stage) {
        Circle test = new Circle(125, 125, 80);
        test.setFill(Color.BLUE);

        Group root = new Group(test);
        Scene scene = new Scene(root, 250, 275, Color.ORANGE);

        stage.setScene(scene);
        stage.setTitle("Test");
        stage.show();
    }
}