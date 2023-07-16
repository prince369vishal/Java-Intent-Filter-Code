package com.example.javadeepaksir;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class form extends AppCompatActivity
{
    EditText et_name, et_password, et_phone;
    RadioButton rb_male,rb_female,rb_others;
    CheckBox cb_android,cb_ios,cb_hybrid;
    Spinner sp_city;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        et_name=(EditText) findViewById(R.id.et_name);
        et_password=(EditText) findViewById(R.id.et_password);
        et_phone=(EditText) findViewById(R.id.et_number);

        cb_android=(CheckBox) findViewById(R.id.cb_android);
        cb_ios=(CheckBox) findViewById(R.id.cb_ios);
        cb_hybrid=(CheckBox) findViewById(R.id.cb_hybrid);

        rb_male=(RadioButton) findViewById(R.id.rb_male);
        rb_female=(RadioButton) findViewById(R.id.rb_female);
        rb_others=(RadioButton) findViewById(R.id.rb_others);

        sp_city=(Spinner) findViewById(R.id.sp_city);

    }

    public void submit(View view)
    {
        String name =et_name.getText().toString();
        String password=et_password.getText().toString();
        String phone=et_phone.getText().toString();

        String gender="";
        if(rb_male.isChecked())
        {
            gender=rb_male.getText().toString();

        }
        if(rb_female.isChecked())
    {
        gender=rb_female.getText().toString();

    }
        if(rb_others.isChecked())
    {
        gender=rb_others.getText().toString();

    }

        String language="";

        if(cb_android.isChecked())
        {
            language+=cb_android.getText().toString();
        }
        if(cb_ios.isChecked())
        {
            language+=cb_ios.getText().toString();
        }
        if(cb_hybrid.isChecked())
        {
            language+=cb_hybrid.getText().toString();
        }

        String city=sp_city.getSelectedItem().toString();

        String result=name+"\n"+phone+"\n"+gender+"\n"+language+"\n"+city;
        Toast toast=Toast.makeText(this,result,Toast.LENGTH_SHORT);
        toast.show();

    }
}