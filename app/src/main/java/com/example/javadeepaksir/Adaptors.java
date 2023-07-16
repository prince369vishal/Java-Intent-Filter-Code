package com.example.javadeepaksir;
import com.example.javadeepaksir.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class Adaptors extends AppCompatActivity {

    GridView gv_one;
    int [] images={R.drawable.hawking,R.drawable.tesla,R.drawable.elon,R.drawable.albert,R.drawable.hawking,R.drawable.elon,R.drawable.albert,R.drawable.tesla};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptors);

        gv_one=(GridView) findViewById(R.id.gv_one);

        MyAdaptor myAdaptor= new MyAdaptor(getApplicationContext(),images);
        gv_one.setAdapter(myAdaptor);


    }
}