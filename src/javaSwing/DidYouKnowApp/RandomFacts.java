package javaSwing.DidYouKnowApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFacts {
    static final String[] facts = {
            "Être amoureux vous rend fainéant.",
            "<html>Si vous vous sentez <em>seul au Japon</em>, vous pouvez louer un homme.</html>",
            "Le soleil est en fait blanc.",
            "<html>La plus petite grenouille toxique au monde, fait moins de 1cm et sa peau est 200 fois plus toxique que la morphine.</html>",
            "<html>L'intelligence d'un homme diminue quand il est à côté d'une femme.</html>",
            "<html>Les personnes nées en décembre réussissent moins bien dans la vie.</html>",
            "On peut vraiment mourir de rire.",
            "Un escargot peut dormir pendant 3 ans.",
            "La bière ne fait pas prendre du ventre.",
            "<html>Pour la première fois en 40 ans, de la neige est tombée dans le Sahara, au sud de l'Algérie.</html>"
    };

    public static String getRandomFacts() {
        Random rand = new Random();
        int randNumber = rand.nextInt(facts.length);
        return facts[randNumber];
    }
}

