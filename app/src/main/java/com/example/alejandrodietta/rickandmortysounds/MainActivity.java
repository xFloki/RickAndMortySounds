package com.example.alejandrodietta.rickandmortysounds;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = new MediaPlayer();
                try {
                    mp.setDataSource("http://www.sonidosmp3gratis.com/sounds/animals020");
                    mp.prepare();
                    mp.start();
                } catch (IOException e) {
        }
        // Cambie esto loco
    }
        });
    }
}
