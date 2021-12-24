package com.example.project_day1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.JsonObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    List<Coffee> list ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppApi.getAppService().getCoffee().enqueue(new Callback<List<Coffee>>() {
            @Override
            public void onResponse(Call<List<Coffee>> call, Response<List<Coffee>> response) {
                list = response.body();
                initRecyclerView();
                Log.d("lanh","onResponese");
            }

            @Override
            public void onFailure(Call<List<Coffee>> call, Throwable t) {
                Log.d("lanh", "onFailure");
            }
        });
    }
    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        CoffeeAdapter adapter = new CoffeeAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}