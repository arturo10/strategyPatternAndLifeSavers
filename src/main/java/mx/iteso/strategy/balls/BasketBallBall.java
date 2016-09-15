package mx.iteso.strategy.balls;
import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;

import mx.iteso.strategy.behaviors.impl.Explode;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotExplode;


/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class BasketBallBall extends Ball {
    public BasketBallBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        type = "BasketBall ball";
        explotaibleBehavior=new Explode();
    }
}
