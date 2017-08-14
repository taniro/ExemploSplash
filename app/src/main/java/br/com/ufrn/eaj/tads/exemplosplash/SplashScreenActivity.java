package br.com.ufrn.eaj.tads.exemplosplash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //inicializa tudo que precisa exibir na MainActivity
                //Coloca tudo num bundle
                //inicia a tela principal
                startActivity(new Intent(getBaseContext(),MainActivity.class));
                finish();
            }
        }, 5000);
    }
}
