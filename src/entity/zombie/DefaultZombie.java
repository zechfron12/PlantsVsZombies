package entity.zombie;

import entity.Zombie;
import javafx.scene.layout.Pane;


public class DefaultZombie extends Zombie {

    
    public DefaultZombie(int x, int y, int lane) {
        super(5, 2, x, y, 68, 118, lane, "/assets/gif/defaultzombie.gif");
    }

    @Override
    public void attacking() {
        super.eatPlant();
    }

    @Override
    public void attacking(Pane pane) {
    }
}
