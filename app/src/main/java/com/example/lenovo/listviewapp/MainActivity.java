package com.example.lenovo.listviewapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static String NAME = "n";
    private final static String GRA = "g";
    private final static String NUM = "m";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] name = {"ww", "yy", "qq", "hh"};
        String[] grade = {" 1班 ", " 2班 ", " 3班 ", " 4班 "};
        String[] num = {"0000", "0001", "0002", "0003"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for (int i = 0; i < name.length; i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(NAME, name[i]);
            item.put(GRA, grade[i]);
            item.put(NUM, num[i]);
            items.add(item);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, items, R.layout.item, new String[]{NAME, GRA, NUM}, new int[]{R.id.txtProduct, R.id.txtPrice, R.id.txtConfiguration});

        ListView list=(ListView)findViewById(R.id.list);

        list.setAdapter(adapter);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
