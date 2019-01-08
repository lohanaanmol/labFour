package com.application.hp.labtask4;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        ArrayList<String> ListItem=new ArrayList<String>();
        for(int i=0; i<50; i++){
            ListItem.add("samsung"+i);
        }
        registerForContextMenu(lv);
        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1,ListItem);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value=lv.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void onCreateContextMenu(ContextMenu menu,View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.context_copy:
                Toast.makeText(getApplicationContext(),item.getTitle(), Toast.LENGTH_LONG).show();
                return true;
            case R.id.context_del:
                Toast.makeText(getApplicationContext(),item.getTitle(), Toast.LENGTH_LONG).show();
                return true;
            case R.id.context_edit:
                Toast.makeText(getApplicationContext(),item.getTitle(), Toast.LENGTH_LONG).show();
                return true;
            default:
        }
        return super.onContextItemSelected(item);
    }

}

