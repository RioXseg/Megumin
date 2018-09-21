package com.example.sergi.megumin;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements explotion.OnFragmentInteractionListener{

     MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        System.out.println("Creamos toast para alertar al usuario");
        Toast.makeText(this,"Toca para escuchar",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
