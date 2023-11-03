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
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        LayoutInflater inflater = getLayoutInflater();
        List<Integer> allProducts  = new ArrayList<>();
        allProducts.add(R.mipmap.workers);
        allProducts.add(R.mipmap.crop_disease);
        allProducts.add(R.mipmap.machinery);
        allProducts.add(R.mipmap.crop_disease);
        allProducts.add(R.mipmap.workers);
        allProducts.add(R.mipmap.machinery);
        allProducts.add(R.mipmap.seeds);
        allProducts.add(R.mipmap.workers);


        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = inflater.inflate(R.layout.picture_layout, parent, false);
                return new PictureViewHolder(view);
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                PictureViewHolder pictureViewHolder = (PictureViewHolder) holder;

                Resources resources = getResources();
                pictureViewHolder.imageView.setImageDrawable(ResourcesCompat.getDrawable(resources, allProducts.get(position), null));


            }

            @Override
            public int getItemCount() {
                return allProducts.size();
            }
        };


        RecyclerView recyclerView = findViewById(R.id.recyclerView2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity2.this);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}

class PictureViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    public PictureViewHolder(@NonNull View view){
        super(view);
        imageView = view.findViewById(R.id.imageView7);
    }
}