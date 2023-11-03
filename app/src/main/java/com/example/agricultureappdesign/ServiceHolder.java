package com.example.agricultureappdesign;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ServiceHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView1;

    public ServiceHolder(@NonNull View view){
        super(view);
        imageView = view.findViewById(R.id.imageView8);
        textView1 = view.findViewById(R.id.textView16);

    }
}
