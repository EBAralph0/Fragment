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

public class Adapter extends RecyclerView.Adapter<Adapter.BookViewHolder> {
    Context context;
    List<Book> bookList;

    public Adapter(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    public Adapter() {
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recycle,parent,false);
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

    public class BookViewHolder extends  RecyclerView.ViewHolder{
        ImageView bookImage;
        TextView nom;
        TextView auteur;
        TextView categorie;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            bookImage=itemView.findViewById(R.id.imageView);
            nom=itemView.findViewById(R.id.textnom);
            auteur=itemView.findViewById(R.id.textauteur);
            categorie=itemView.findViewById(R.id.textcategorie);
        }
    }
}
