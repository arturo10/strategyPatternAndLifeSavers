package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Flotation;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class SwimSeat extends Lifesaver {
    public SwimSeat() {
        type = "Swim seat";
        deflateBehavior=new NotDeflatable();
        flotationBehavior=new Flotation();
    }
}
