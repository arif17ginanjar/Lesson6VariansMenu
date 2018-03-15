package com.arif_ginanjar.lesson6variansmenu;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ContextMenuActivity extends AppCompatActivity {
    ListView activity_context_menu_lv_nama;
    String nama_nama[] = {"Mangga", "Jeruk", "Apel", "Strawberry", "Alpukat", "Anggur"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);
        setTitle("Context Menu");

        activity_context_menu_lv_nama = (ListView)findViewById(R.id.activity_context_menu_lv_nama);

        ArrayAdapter<String> list_nama = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nama_nama);
        activity_context_menu_lv_nama.setAdapter(list_nama);

        registerForContextMenu(activity_context_menu_lv_nama);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Pilih Option");
        menu.add(0, v.getId(), 0, "Tuang");
        menu.add(0, v.getId(),0,"Peyeum");
        menu.add(0,v.getId(),0,"Piceun");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "Tuang"){
            Toast.makeText(getApplicationContext(), "Mangga sok tuang", Toast.LENGTH_LONG).show();
        }
        else if (item.getTitle() == "Peyeum"){
            Toast.makeText(getApplicationContext(), "Peyeum hela ameh Asak", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "Piceun weh Buruk mah", Toast.LENGTH_LONG).show();
        }

        return true;
    }
}