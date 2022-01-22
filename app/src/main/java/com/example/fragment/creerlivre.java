package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class creerlivre extends AppCompatActivity {
    Button btn,btn2;

    public static final String mypreference="mypref";
    public static  final String Name="nameKey";
    public static  final String Autor="autorKey";
    public static  final String Category="categoryKey";
    EditText autor,name,category;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creerlivre);

        btn=findViewById(R.id.buttonannuler);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(creerlivre.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn2=findViewById(R.id.buttonenregistrer);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        recupShare();
    }
    public void saveShare(){
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(Name,name.getText().toString());
        editor.putString(Autor,autor.getText().toString());
        editor.putString(Category,category.getText().toString());
        editor.apply();
        editor.commit();
    }
    public void recupShare(){
        name=findViewById(R.id.editTextTextBookName);
        autor=findViewById(R.id.editTextTextBookAutor);
        category=findViewById(R.id.editTextTextBookCategory);

        sharedPreferences=getSharedPreferences(mypreference,MODE_PRIVATE);
        if(sharedPreferences.contains(Name)){
            name.setText(sharedPreferences.getString(Name,""));
        }
        if(sharedPreferences.contains(Autor)){
            autor.setText(sharedPreferences.getString(Autor,""));
        }
        if(sharedPreferences.contains(Category)){
            category.setText(sharedPreferences.getString(Category,""));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        saveShare();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
       saveShare();
    }

    @Override
    protected void onPause() {
        super.onPause();
        saveShare();
    }

    @Override
    protected void onResume() {
        super.onResume();
        recupShare();
    }
}