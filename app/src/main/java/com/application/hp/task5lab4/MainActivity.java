package com.application.hp.task5lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerAdapter adapter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<String> listData = new ArrayList<>();
    private int[] images = new int[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupImages();
        setupList();
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(images,listData,this);
        recyclerView.setAdapter(adapter);
    }

    private void setupImages() {
        for (int i=0; i<20; i++)
            images[i] = R.drawable.pic1;
    }

    private void setupList() {
        for(int i=1; i<=20; i++)
            listData.add("IMAGE : "+i);

    }
}
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.GridLayoutManager;
        import android.support.v7.widget.RecyclerView;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerAdapter adapter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<String> listData = new ArrayList<>();
    private int[] images = new int[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupImages();
        setupList();
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(images,listData,this);
        recyclerView.setAdapter(adapter);
    }

    private void setupImages() {
        for (int i=0; i<20; i++)
            images[i] = R.drawable.pic1;
    }

    private void setupList() {
        for(int i=1; i<=20; i++)
            listData.add("IMAGE : "+i);

    }
}
