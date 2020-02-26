package com.example.harpreet.recyclerlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PersonAdapter.itemClicked {

    ArrayList<Person> array;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        layoutManager = new LinearLayoutManager(this);
        array = new ArrayList<>();
        array.add(new Person("Manpreet","Singh","plane"));
        array.add(new Person("Harpreet","Singh","bus"));
        array.add(new Person("Parmeet","Kaur","plane"));
        array.add(new Person("Surinder","Kaur","plane"));
        array.add(new Person("Manpreet","Singh","plane"));
        array.add(new Person("Harpreet","Singh","bus"));
        array.add(new Person("Parmeet","Kaur","plane"));
        array.add(new Person("Surinder","Kaur","plane"));
        array.add(new Person("Manpreet","Singh","plane"));
        array.add(new Person("Harpreet","Singh","bus"));
        array.add(new Person("Parmeet","Kaur","plane"));
        array.add(new Person("Surinder","Kaur","plane"));
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new PersonAdapter(this,array));

    }

    @Override
    public void onItemClicked(int index) {
        Toast.makeText(this,array.get(index).getName() , Toast.LENGTH_SHORT).show();
    }
}
