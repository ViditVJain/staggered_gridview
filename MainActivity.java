package com.example.example3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    RecyclerViewAdapter adapter;
    ArrayList<Integer> Image;
    RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Image = new ArrayList<>(Arrays.asList(
                R.drawable.liv,R.drawable.bar,
                R.drawable.manu,R.drawable.manc,
                R.drawable.ch,
                R.drawable.th,
                R.drawable.liv,R.drawable.manc,
                R.drawable.ch,R.drawable.th,
                R.drawable.bar, R.drawable.manu
                )
        );

        recyclerView = findViewById(R.id.stagRecycleView);

        layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(this, Image);
        recyclerView.setAdapter(adapter);
    }


}