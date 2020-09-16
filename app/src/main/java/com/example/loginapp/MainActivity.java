package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ResourceBundle;


public class MainActivity extends AppCompatActivity implements  View.OnClickListener, View.OnLongClickListener   {
private TextView tv;
    private EditText name,password,email,id;
private Button loginbtn,clearbtn;
private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView6);
    name=findViewById(R.id.name);
    password=findViewById(R.id.password);
    email=findViewById(R.id.editTextTextEmailAddress);
    id=findViewById(R.id.id);
    checkBox=findViewById(R.id.checkBox);
    loginbtn=findViewById(R.id.loginbtn);
    loginbtn.setOnClickListener(this);
    clearbtn=findViewById(R.id.clearbtn);
clearbtn.setOnLongClickListener(this);

    }

    @Override
    public void onClick(View view) {
if(loginbtn==view){
    if(name.getText().toString().equals("")||password.getText().toString().equals("")||email.getText().toString().equals("")||id.getText().toString().equals("")) {
        Toast.makeText(this, "error! empty fields...", Toast.LENGTH_LONG).show();
    }
    else {
        Bundle bundle=new Bundle();
        Intent intent = new Intent(this, secactivity.class);

        Person person=new Person(name.getText().toString(),password.getText().toString(),email.getText().toString(),id.getText().toString(),checkBox.isChecked());
        bundle.putSerializable("person",person);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
    }

    @Override
    public boolean onLongClick(View view) {
        if(view.getId()==R.id.clearbtn){
            name.setText("");
        password.setText("");
        email.setText("");
        id.setText("");
        checkBox.setChecked(false);
        }
        return true;
    }
}