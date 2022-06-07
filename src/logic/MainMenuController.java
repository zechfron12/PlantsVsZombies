package logic;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.Objects;


public class MainMenuController {

    public ImageView playGame;
    @FXML
    public AnchorPane mainRoot;

    
    @FXML
    public void exitGame() {
        System.exit(0);
    }

    
    @FXML
    public void showLevelMenu() throws Exception {
        AnchorPane Apane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("LevelMenu.fxml")));
        mainRoot.getChildren().setAll(Apane);
    }

}
