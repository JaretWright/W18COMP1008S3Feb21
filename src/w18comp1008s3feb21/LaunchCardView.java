package w18comp1008s3feb21;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class LaunchCardView extends Application
{

    /**
     * This method "starts" the application by loading the fxml files
     * and creating the scene
     * @param primaryStage
     * @throws Exception 
     */
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("CardView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("The greatest GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
