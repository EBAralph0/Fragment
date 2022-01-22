package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class home extends Fragment {
    RecyclerView rclView;
    List<Book>bookList;
    View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_home, container, false);
        rclView= view.findViewById(R.id.recyclerview);
        rclView.hasFixedSize();
        addElement();

        Adapter adapter=new Adapter(getActivity(),bookList);
        rclView.setAdapter(adapter);
        rclView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter.notifyDataSetChanged();

        return view;
    }

    private void addElement() {
        bookList=new ArrayList<>();
        bookList.add(new Book("EdenZero","H. Mashima","Manga",R.drawable.ic_baseline_book_24));
        bookList.add(new Book("My Mood","H. Toriyama","Manga",R.drawable.ic_baseline_library_books_24));
        bookList.add(new Book("EdenZero","H. Mashima","Manga",R.drawable.ic_baseline_book_24));
        bookList.add(new Book("EdenZero","H. Mashima","Manga",R.drawable.ic_baseline_library_books_24));
        bookList.add(new Book("EdenZero","H. Mashima","Manga",R.drawable.ic_baseline_library_books_24));
        bookList.add(new Book("EdenZero","H. Mashima","Manga",R.drawable.ic_baseline_book_24));
    }

}