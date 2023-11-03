package com.example.agricultureappdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        LayoutInflater inflater = getLayoutInflater();

        List<Services> allServices = Services.allServices();

        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = inflater.inflate(R.layout.service_layout, parent, false);
                return new ServiceHolder(view);
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                ServiceHolder serviceHolder = (ServiceHolder) holder;
                serviceHolder.textView1.setText(allServices.get(position).getName());

                Resources resources = getResources();
                serviceHolder.imageView.setImageDrawable(ResourcesCompat.getDrawable(resources, allServices.get(position).getImage(), null));

            }

            @Override
            public int getItemCount() {
                return allServices.size();
            }
        };


        RecyclerView recyclerView = findViewById(R.id.RecyclerView3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity3.this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}