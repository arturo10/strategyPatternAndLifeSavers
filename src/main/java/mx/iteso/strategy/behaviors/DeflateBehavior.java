package mx.iteso.strategy.behaviors;


public interface DeflateBehavior {
    public static String DEFLATE="I'm deflating!";
    public static String INFLATE="I'm inflating!";
    public static String NOTDEFLATE="I can't deflate!";
    public static String NOTINFLATE="I can't inflate!";

    public String deflate();

    public String inflate();
}
