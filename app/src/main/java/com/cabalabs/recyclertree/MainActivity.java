package com.cabalabs.recyclertree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cabalabs.recyclertree.Adapter.MyAdapter;
import com.cabalabs.recyclertree.Model.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView list;
    RecyclerView.LayoutManager layoutManager;
    List<Item> items = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (RecyclerView)findViewById(R.id.recycler);
        list.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        list.setLayoutManager(layoutManager);

        setData();
    }

    private void setData() {
        for(int i=0;i<20;i++)
        {
            if(i%2==0)
            {
                Item item = new Item("This is item "+(i+1),"LEVEL1AS1CZT20190209C04_009T03_9000002714.tar_V1.2", true);
                items.add(item);
            }
            else
            {
                Item item = new Item("This is item "+(i+1),"",false);
                items.add(item);
            }
        }
        MyAdapter adapter = new MyAdapter(items);
        list.setAdapter(adapter);
    }
}
