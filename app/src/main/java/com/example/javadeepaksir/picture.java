package com.example.javadeepaksir;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class picture extends AppCompatActivity {

    ImageSwitcher imageSwitcher;
    int[] images ={R.drawable.albert,R.drawable.elon,R.drawable.hawking};
    int length;
    int img_index=0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        imageSwitcher = (ImageSwitcher) findViewById(R.id.is_image);

        length=images.length;

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);

                return imageView;
            }
        });
        imageSwitcher.setImageResource(images[0]);

    }

    public void nextButton(View view)
    {
        img_index=img_index+1;
        if(img_index==images.length)
        {
            img_index=0;
        }
        imageSwitcher.setImageResource(images[img_index]);

    }
    public void backButton(View view)
    {
        img_index=img_index-1;
        if(img_index<0)
        {
            img_index=images.length-1;
        }
        imageSwitcher.setImageResource(images[img_index]);


    }
}