package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Explode;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotExplode;

/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class GolfBall extends Ball {
    public GolfBall(){
        bounceBehavior = new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        type = "Golf ball";
        explotaibleBehavior=new NotExplode();
    }
}
