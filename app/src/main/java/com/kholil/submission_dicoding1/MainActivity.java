package com.kholil.submission_dicoding1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kholil.submission_dicoding1.adapter.ListMakananAdapter;
import com.kholil.submission_dicoding1.adapter.OnItemClickCallback;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView r_makanan;
    private ArrayList<Makanan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r_makanan = findViewById(R.id.r_makanan);
        r_makanan.setHasFixedSize(true);

        list.addAll(DataMakanan.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        r_makanan.setLayoutManager(new LinearLayoutManager(this));
        ListMakananAdapter listMakananAdapter = new ListMakananAdapter(list);
        r_makanan.setAdapter(listMakananAdapter);

        listMakananAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Makanan makanan) {
                Intent moveIntent1 = new Intent(MainActivity.this, DetailMakanan.class);
                moveIntent1.putExtra(DetailMakanan.ITEM_EXTRA, makanan);
                startActivity(moveIntent1);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.kontak_id) {
            Intent moveIntent = new Intent(MainActivity.this, KontakActivity.class);
            startActivity(moveIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}
