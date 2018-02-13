package gie.gazz.imfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import gie.gazz.imfirebase.fregment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState==null)
        {

            getSupportFragmentManager().beginTransaction().add(R.id.abcd,new MainFragment()).commit();
        }


    }
}
