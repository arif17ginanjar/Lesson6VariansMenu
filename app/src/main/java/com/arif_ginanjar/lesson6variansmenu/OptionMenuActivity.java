package com.arif_ginanjar.lesson6variansmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

public class OptionMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);
        setTitle("Option Menu");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option_menu_menu1:
                Toast.makeText(getApplicationContext(), "Menu 1 sudah dipilih", Toast.LENGTH_LONG).show();

                return true;

            case R.id.option_menu_menu2:
                Toast.makeText(getApplicationContext(), "Menu 2 sudah dipilih", Toast.LENGTH_LONG).show();

                return true;

            case R.id.option_menu_menu3:
                Toast.makeText(getApplicationContext(), "Menu 3 sudah dipilih", Toast.LENGTH_LONG).show();

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
