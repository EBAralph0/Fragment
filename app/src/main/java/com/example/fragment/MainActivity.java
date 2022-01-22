package com.example.fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //gerer les fragments
        BottomNavigationView bottomNav=findViewById(R.id.bottomBar);
        bottomNav.setOnNavigationItemSelectedListener(navView);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentManager,new home()).commit();




    }

    private BottomNavigationView.OnNavigationItemSelectedListener navView=
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    //selectionner le fragment a afficher
                    Fragment selectedFragment=null;
                    if(item.getItemId()==R.id.home){
                        selectedFragment=new home();
                    }
                    if(item.getItemId()==R.id.search){
                        selectedFragment=new search();
                    }
                    switch ((item.getItemId())){
                        case R.id.home:
                            selectedFragment=new home();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentManager,
                                    selectedFragment).commit();
                            break;
                        case R.id.search:
                            selectedFragment=new search();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentManager,
                                    selectedFragment).commit();
                            break;
                        case R.id.profile:
                            selectedFragment=new profile();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentManager,
                                    selectedFragment).commit();
                            break;
                        case R.id.livrer:
                            createbook();
                            break;
                    }
                    return true;
                }
            };
    public  void createbook(){
        Intent intent=new Intent(MainActivity.this,creerlivre.class);
        startActivity(intent);
        finish();
    }
}