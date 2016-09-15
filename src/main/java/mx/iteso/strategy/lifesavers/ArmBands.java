package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Flotation;


public class ArmBands extends Lifesaver{
    public ArmBands() {
        type = "Arm bands";
        deflateBehavior=new Deflatable();
        flotationBehavior=new Flotation();
    }
}
