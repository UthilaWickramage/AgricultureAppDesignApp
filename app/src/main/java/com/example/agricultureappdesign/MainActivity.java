package com.example.agricultureappdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout frameLayout = findViewById(R.id.frameLayout);


        LayoutInflater inflater = getLayoutInflater();
        inflater.inflate(R.layout.banner, frameLayout, true);
        List<Product> allProducts = Product.getAllProducts();

        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = inflater.inflate(R.layout.card_layout, parent, false);
                return new CustomViewHolder(view);
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                CustomViewHolder customViewHolder = (CustomViewHolder) holder;
                customViewHolder.textView1.setText(allProducts.get(position).getProductName());
                customViewHolder.textView2.setText(allProducts.get(position).getWeight());
                Resources resources = getResources();
                customViewHolder.imageView.setImageDrawable(ResourcesCompat.getDrawable(resources, allProducts.get(position).getImage(), null));
                customViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(intent);

                    }
                });

            }

            @Override
            public int getItemCount() {
                return allProducts.size();
            }
        };


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        BottomNavigationView bottomNavigationItemView = findViewById(R.id.bottom_navigation);

        bottomNavigationItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("id",String.valueOf(v.getId()));
            }
        });

    }
}