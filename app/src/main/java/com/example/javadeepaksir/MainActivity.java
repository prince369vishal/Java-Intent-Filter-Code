package com.example.javadeepaksir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  EditText et_my_name;
  TextView tv_name;
  Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         et_my_name = (EditText) findViewById(R.id.et_name1);
         tv_name = (TextView) findViewById(R.id.tv_name1);
         btn_login = (Button) findViewById(R.id.btn_login1);
    }

    public void logmIn(View view)
    {
        String name = et_my_name.getText().toString();
        //tv_name.setText("Email wow : "+name);
        Toast.makeText(getApplicationContext(),"Email :"+name,Toast.LENGTH_SHORT).show();
    }

    public static class adaptor_one extends BaseAdapter
    {
        Context context;
        int [] data;
        adaptor_one(Context context, int [] data)
        {
            this.context=context;
            this.data=data;
        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }
}