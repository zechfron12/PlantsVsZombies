module plants.vs.zombies.main {
    requires javafx.controls;
    requires javafx.media;
    requires javafx.fxml;

    opens application;
    opens logic;
    opens entity;
    opens assets.sounds;

}