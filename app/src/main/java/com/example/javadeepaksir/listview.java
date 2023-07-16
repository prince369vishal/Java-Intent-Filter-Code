package com.example.javadeepaksir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class listview extends AppCompatActivity {

    String [] name ={"Prince","Vishal","Nirmohi","Sruthi","Jyothi","Manju"};

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listView=(ListView) findViewById(R.id.listview1);
        ArrayAdapter <String> arrayAdapter=new ArrayAdapter<>(this,R.layout.ui_view_one,R.id.tv_name,name);
        listView.setAdapter(arrayAdapter);
    }
}