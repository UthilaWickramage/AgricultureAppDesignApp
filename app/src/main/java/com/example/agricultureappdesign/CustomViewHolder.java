package com.example.agricultureappdesign;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textView1;
    TextView textView2;
    public CustomViewHolder(@NonNull View view){
        super(view);
        imageView = view.findViewById(R.id.imageView4);
        textView1 = view.findViewById(R.id.textView7);
        textView2 = view.findViewById(R.id.textView8);
    }
}
