package com.arif_ginanjar.lesson6variansmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button activity_main_bt_optionmenu, activity_main_bt_contextmenu, activity_main_bt_popupmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Varians Menu");

        activity_main_bt_optionmenu = (Button)findViewById(R.id.activity_main_bt_optionmenu);
        activity_main_bt_contextmenu = (Button)findViewById(R.id.activity_main_bt_contextmenu);
        activity_main_bt_popupmenu = (Button)findViewById(R.id.activity_main_bt_popupmenu);

        activity_main_bt_optionmenu.setOnClickListener(this);
        activity_main_bt_contextmenu.setOnClickListener(this);
        activity_main_bt_popupmenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.activity_main_bt_optionmenu:
                Intent moveOptionmenu = new Intent(MainActivity.this, OptionMenuActivity.class);
                startActivity(moveOptionmenu);

                break;

            case R.id.activity_main_bt_contextmenu:
                Intent moveContextmenu = new Intent(MainActivity.this, ContextMenuActivity.class);
                startActivity(moveContextmenu);

                break;

            case R.id.activity_main_bt_popupmenu:
                Intent movePopupmenu = new Intent(MainActivity.this, PopupMenuActivity.class);
                startActivity(movePopupmenu);

                break;

        }

    }
}
