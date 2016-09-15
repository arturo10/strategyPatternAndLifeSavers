package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FlotationBehavior;

/**
 * Created by Arturo Hernandez on 15/9/2016.
 */
public class NotFlotation  implements FlotationBehavior{
    public String floating() {
        return "I am not floating";
    }
}
