package com.arif_ginanjar.lesson6variansmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopupMenuActivity extends AppCompatActivity implements View.OnClickListener {
    Button activity_popup_menu_bt_popmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);
        setTitle("PopUp Menu");

        activity_popup_menu_bt_popmenu = (Button)findViewById(R.id.activity_popup_menu_bt_popmenu);
        activity_popup_menu_bt_popmenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        PopupMenu activity_popupmenu_popupmenu = new PopupMenu(PopupMenuActivity.this, activity_popup_menu_bt_popmenu);
        activity_popupmenu_popupmenu.getMenuInflater().inflate(R.menu.popup_menu, activity_popupmenu_popupmenu.getMenu());

        activity_popupmenu_popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(PopupMenuActivity.this, "Kamu telah memilih : " + item.getTitle(), Toast.LENGTH_SHORT).show();

                return true;
            }
        });
        activity_popupmenu_popupmenu.show();
    }
}
