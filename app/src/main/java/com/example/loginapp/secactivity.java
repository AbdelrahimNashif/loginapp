package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secactivity extends AppCompatActivity implements View.OnClickListener {
private TextView tvname,tvpassword,tvEmail,tvId,tvCheckbox;
private Button backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secactivity);
        tvname=findViewById(R.id.textView);
        tvpassword=findViewById(R.id.textView2);
        tvEmail=findViewById(R.id.textView3);
        tvId=findViewById(R.id.textView4);
        tvCheckbox=findViewById(R.id.textView5);
        //String name=this.getIntent().getStringExtra("name");
       // String password=this.getIntent().getStringExtra("password");
        Intent intent = getIntent();
        Bundle bundle=intent.getExtras();

        Person p=(Person) bundle.getSerializable("person");
        tvname.setText("Name: "+p.getName());
        tvpassword.setText("Password: "+p.getPassword());
        tvEmail.setText("Email: "+p.getEmail());
        tvId.setText("Id: "+p.getId());
        if(p.getIsdetailssave())
            tvCheckbox.setText("Saved: Yes");
        else
            tvCheckbox.setText("Saved: No");

        backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}