package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Flotation;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Arturo Hernandez on 15/9/2016.
 */
public class WaterTubes  extends Lifesaver {
    public WaterTubes() {
        type = "Arm bands";
        deflateBehavior=new Deflatable();
        flotationBehavior=new Flotation();
    }
}
