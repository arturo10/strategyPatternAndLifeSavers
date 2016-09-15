package mx.iteso.strategy.behaviors.impl;
import mx.iteso.strategy.behaviors.ExploitableBehavior;
/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class NotExplode implements ExploitableBehavior  {
    public String explode() {
        return "I am not explotaible";
    }
}
