package mx.iteso.strategy.balls;
import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotExplode;

/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class TennisBall extends Ball {
    public TennisBall(){
        bounceBehavior = new NormalBounce();
        deflateBehavior = new NotDeflatable();
        type = "Tennis ball";
        explotaibleBehavior=new NotExplode();
    }
}
