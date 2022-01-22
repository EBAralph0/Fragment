package com.example.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.BookViewHolder> {
    Context context;
    List<Book> bookList;

    public Adapter2(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    public Adapter2() {
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.secondrecycle,parent,false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        holder.bookImage.setImageResource(bookList.get(position).getImage());
        holder.nom.setText(bookList.get(position).getName());
        holder.auteur.setText(bookList.get(position).getAutor());
        holder.categorie.setText(bookList.get(position).getCategorie());
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }



    public class BookViewHolder extends RecyclerView.ViewHolder {

        ImageView bookImage;
        TextView nom;
        TextView auteur;
        TextView categorie;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            bookImage=itemView.findViewById(R.id.imageView2);
            nom=itemView.findViewById(R.id.textViewnom);
            auteur=itemView.findViewById(R.id.textViewAuteur);
            categorie=itemView.findViewById(R.id.textViewCategorie);
        }
    }
}
