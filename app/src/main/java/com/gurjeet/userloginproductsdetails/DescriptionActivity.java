package com.gurjeet.userloginproductsdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    Button back;
    ImageView bigImage;
    TextView prodDesc,title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        back=findViewById(R.id.btnBack);
        bigImage=findViewById(R.id.ivBigimage);
        prodDesc=findViewById(R.id.txvDesc);
        title=findViewById(R.id.txvProdTitle);


        title.setText(MainActivity.products.get(MainActivity.index).getName());
        bigImage.setImageResource(MainActivity.products.get(MainActivity.index).getImg());
        prodDesc.setText(MainActivity.products.get(MainActivity.index).getDescription());
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DescriptionActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}