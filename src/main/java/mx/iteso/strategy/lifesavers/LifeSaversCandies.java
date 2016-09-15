package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Flotation;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotFlotation;

/**
 * Created by Arturo Hernandez on 15/9/2016.
 */
public class LifeSaversCandies  extends Lifesaver {
    public LifeSaversCandies() {
        type = "Arm bands";
        deflateBehavior=new NotDeflatable();
        flotationBehavior=new NotFlotation();
    }
}
