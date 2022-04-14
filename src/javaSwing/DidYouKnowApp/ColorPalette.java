package javaSwing.DidYouKnowApp;

import java.awt.*;
import java.util.Random;

public class ColorPalette {
    static final String[] colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7" // light gray
    };
    public static Color getRandomColor () {
        Random rand = new Random();
        int randNumber = rand.nextInt(colors.length);
        return Color.decode(colors[randNumber]);
    }
}
