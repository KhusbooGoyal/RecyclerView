package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.Adapt;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ListItem> listItems = new ArrayList<>();
        //ListItem item1 = new ListItem("Movie 1","It's about someone crazy...", "Wow! Great!");
        //ListItem item2 = new ListItem("Movie 2","It's about someone yoy...", "Wow!");
        for (int i=0;i<10;i++){
            ListItem item= new ListItem("Item" + (i+1), "Description", "Excellent");
            listItems.add(item);
        }
        //listItems.add(item1);
        //listItems.add(item2);
        RecyclerView.Adapter adapter = new Adapt(this, listItems);
        recyclerView.setAdapter(adapter);
    }
}