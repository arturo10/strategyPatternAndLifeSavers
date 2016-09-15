package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class VolleyBallBall extends Ball {
    public VolleyBallBall(){
        bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        type = "Volleyball ball";
        explotaibleBehavior=new Explode();
    }
}
