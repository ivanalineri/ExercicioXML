package br.com.digitalhouse.exerciciodelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("LOG", "onCreate");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LOG", "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LOG", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("LOG", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LOG", "onDestroy");
    }

}
