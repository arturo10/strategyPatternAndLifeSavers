package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Explode;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotExplode;

public class BaseballBall extends Ball {
    public BaseballBall() {
        bounceBehavior = new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        type = "Baseball ball";
        explotaibleBehavior=new NotExplode();
    }
}
