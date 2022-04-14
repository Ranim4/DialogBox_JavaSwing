package javaSwing.DidYouKnowApp;

import java.awt.*;

public class DemoFenetre2 {

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // TODO Instancier une JFrame
                    new Fenetre2("Le saviez-vous?");
                // TODO Afficher la JFrame
            }
        });


    }
}
