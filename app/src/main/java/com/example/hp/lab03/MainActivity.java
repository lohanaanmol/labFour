package com.example.hp.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.ArrayMap;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    Toolbar t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        t= findViewById(R.id.toolbar);
        setSupportActionBar(t);
        final ArrayList<String> listItem=new ArrayList <String>();
        for(int i=0; i<50; i++){
            listItem.add("Samsung" + i);
        }

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
                lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value= lv.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();
            }
        });


}
public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_main,menu);
            return true;
        }
        public boolean onOptionsItemSelected(MenuItem item){
            switch (item.getItemId()) {
                case R.id.action_search:
                    Toast.makeText(getApplicationContext(), item.getTitle(),
                            Toast.LENGTH_LONG).show();
                    return true;
                case R.id.action_settings:
                    Toast.makeText(getApplicationContext(), item.getTitle(),
                            Toast.LENGTH_LONG).show();
                    return true;
                case R.id.action_about:
                    Toast.makeText(getApplicationContext(), item.getTitle(),
                            Toast.LENGTH_LONG).show();
                    return true;
                default:
                    return false;

            }
            //return super.onOptionsItemSelected(item);
        }
    }
