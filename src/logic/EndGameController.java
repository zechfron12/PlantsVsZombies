package logic;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;


public class EndGameController {

    
    @FXML
    public Button mainMenuButton;
    @FXML
    private AnchorPane endGame;
    @FXML
    private ImageView zombiesAteYourBrains;
    @FXML
    private ImageView youAteZombiesBrains;
    @FXML
    private ImageView youWon;
    @FXML
    private ImageView nextLevelButton;
    @FXML
    private ImageView plantImage;

    @FXML
    public void ToMainMenu() throws IOException {
        AnchorPane Apane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainMenu.fxml")));
        endGame.getChildren().setAll(Apane);
    }

    @FXML
    public void ToNextLevel() throws IOException {
        AnchorPane Apane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("LevelMenu.fxml")));
        endGame.getChildren().setAll(Apane);
    }

    @FXML
    public void initialize() {
        zombiesAteYourBrains.setVisible(false);
        youAteZombiesBrains.setVisible(false);
        youWon.setVisible(false);
        plantImage.setVisible(false);
        nextLevelButton.setVisible(false);
        nextLevelButton.setDisable(true);
    }

    @FXML
    public void endGameUI(int level, boolean gameWin) {
        if (!gameWin) {
            zombiesAteYourBrains.setVisible(true);
        } else {
            if (level == 5) {
                youAteZombiesBrains.setVisible(true);
            } else {
                youWon.setVisible(true);
                nextLevelButton.setVisible(true);
                nextLevelButton.setDisable(false);
                plantImage.setVisible(true);
                if (level == 1) {
                    plantImage.setImage((new Image(Objects.requireNonNull(this.getClass().getResource("/assets/images/Level2.png")).toExternalForm())));
                } else if (level == 2) {
                    plantImage.setImage((new Image(Objects.requireNonNull(this.getClass().getResource("/assets/images/Level3.png")).toExternalForm())));
                } else if (level == 3) {
                    plantImage.setImage((new Image(Objects.requireNonNull(this.getClass().getResource("/assets/images/Level4.png")).toExternalForm())));
                } else if (level == 4) {
                    plantImage.setImage((new Image(Objects.requireNonNull(this.getClass().getResource("/assets/images/Level2.png")).toExternalForm())));
                }
            }

        }

    }

}

