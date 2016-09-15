package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.ExploitableBehavior;

public abstract class Ball {

    public BounceBehavior bounceBehavior;
    public DeflateBehavior deflateBehavior;
    public ExploitableBehavior explotaibleBehavior;
    public String type;

    public BounceBehavior getBounceBehavior() {
        return bounceBehavior;
    }

    public void setBounceBehavior(BounceBehavior bounceBehavior) {
        this.bounceBehavior = bounceBehavior;
    }

    public DeflateBehavior getDeflateBehavior() {
        return deflateBehavior;
    }

    public void setDeflateBehavior(DeflateBehavior deflateBehavior) {
        this.deflateBehavior = deflateBehavior;
    }

    public ExploitableBehavior getExplotaibleBehavior() {
        return explotaibleBehavior;
    }

    public void setExplotaibleBehavior(ExploitableBehavior explotaibleBehavior) {
        this.explotaibleBehavior = explotaibleBehavior;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Ball(BounceBehavior bounceBehavior) {
        setBounceBehavior(bounceBehavior);
    }

    public Ball() {

    }

    public String roll() {
        return type + " is rolling!";
    }

    public String performBounce() {
        return bounceBehavior.bounce();
    }

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }

    public String performExploitable(){return explotaibleBehavior.explode();}

}
