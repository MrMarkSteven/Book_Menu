package com.a7saturnapps.sinhalapdf.sinhalapdf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        lstBook = new ArrayList<>();
        lstBook.add(new Book("The Vegitarian","Categorie Book","Description book",R.drawable.books));
        lstBook.add(new Book("The Wild Robot","Categorie Book","Description book",R.drawable.hediedwith));
        lstBook.add(new Book("Maria Semples","Categorie Book","Description book",R.drawable.mariasemples));
        lstBook.add(new Book("The Martian","Categorie Book","Description book",R.drawable.mariasemples));
        lstBook.add(new Book("He Died with...","Categorie Book","Description book",R.drawable.hediedwith));
        lstBook.add(new Book("The Vegitarian","Categorie Book","Description book",R.drawable.privacy));
        lstBook.add(new Book("The Wild Robot","Categorie Book","Description book",R.drawable.books));
        lstBook.add(new Book("Maria Semples","Categorie Book","Description book",R.drawable.mariasemples));
        lstBook.add(new Book("The Martian","Categorie Book","Description book",R.drawable   .hediedwith));
        lstBook.add(new Book("He Died with...","Categorie Book","Description book",R.drawable.hediedwith));
        lstBook.add(new Book("The Vegitarian","Categorie Book","Description book",R.drawable.books));
        lstBook.add(new Book("The Wild Robot","Categorie Book","Description book",R.drawable.mariasemples));
        lstBook.add(new Book("Maria Semples","Categorie Book","Description book",R.drawable.mariasemples));
        lstBook.add(new Book("The Martian","Categorie Book","Description book",R.drawable.books));
        lstBook.add(new Book("He Died with...","Categorie Book","Description book",R.drawable.hediedwith));



        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);

    }
}
