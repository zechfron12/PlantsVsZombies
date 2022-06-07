package entity.zombie;


import entity.Plant;
import entity.Zombie;
import javafx.scene.layout.Pane;
import logic.GameController;


public class FunnelHeadZombie extends Zombie {

    
    public FunnelHeadZombie(int x, int y, int lane) {
        super(12, 2, x, y, 134, 124, lane, "/assets/gif/funnelheadzombie.gif");
    }

    @Override
    public void attacking(Pane pane) {
    }

    @Override
    public void attacking() {
        eatPlant();
    }

    @Override
    public void eatPlant() {
        synchronized (GameController.allPlants) {
            for (Plant plant : GameController.allPlants) {
                if (plant.getRow() == getLane()) {
                    if (Math.abs(plant.getX() - getImage().getX()) <= 20) {
                        super.actEat(plant);
                    }
                }
            }
        }
    }
}
