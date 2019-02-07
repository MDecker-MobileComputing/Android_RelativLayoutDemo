package de.mide.relativelayoutdemo;

import android.app.Activity;
import android.os.Bundle;


/**
 * App demonstriert Funktionsweise und Möglichkeiten mit RelativeLayout.
 * Die App enthält mehrere Layout-Dateien, die in der "onCreate()"-Methode
 * entsprechend einzukommentieren sind (immer nur eine auf einmal!)
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class MainActivity extends Activity {

    /**
     * Bitte genau eine "setContentView()"-Anweisung einkommentieren!
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView( R.layout.width_height_kombinationen );

        //setContentView( R.layout.attribut_gravity );

        //setContentView( R.layout.align_parent_attribute );

        //setContentView( R.layout.geschwister_bezug );

        //setContentView( R.layout.geschwister_align );

        //setContentView( R.layout.ui_designer );

        //setContentView( R.layout.margin );

        //setContentView( R.layout.forward_deklaration );

        //setContentView( R.layout.ueberlappen );

        //setContentView( R.layout.aaa_bbb_ccc );

        //setContentView( R.layout.ksc_activity );
    }

}
