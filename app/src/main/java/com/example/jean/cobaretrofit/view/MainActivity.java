package com.example.jean.cobaretrofit.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.jean.cobaretrofit.R;
import com.example.jean.cobaretrofit.adapter.CardViewHistory;
import com.example.jean.cobaretrofit.model.Club;
import com.example.jean.cobaretrofit.presenter.PlayerPresenter;
import com.example.jean.cobaretrofit.service.HistoryApi;

import java.util.List;

public class MainActivity extends AppCompatActivity implements HistoryView {
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private CardViewHistory cardViewClub;
    private HistoryApi apiServise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView = findViewById(R.id.rv_data);
        layoutManager = new LinearLayoutManager(this);
        PlayerPresenter playerPresenter = new PlayerPresenter(this);
        playerPresenter.getPlayers();
        recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    public void listOfPlayers(List<Club> clubs) {
        // See your Logcat :)
        cardViewClub = new CardViewHistory(clubs, MainActivity.this);
        recyclerView.setAdapter(cardViewClub);
        cardViewClub.notifyDataSetChanged(); //datanya ada yang berubah


        for (Club club : clubs) {
            Log.i( " - ikon " , club.getIkon() + "\n"
                    + " - nama " + club.getNama() +"\n"
                    + " - negara " + club.getNegara() +"\n"
                    + " - id " + club.getId() +"\n"
                    + " - history " + club.getHistory().toString() +"\n"
                    + " - team " + club.getTeam() +"\n"
                    + " - posisi " + club.getPosisi() +"\n"
                    + " - deskripsi " + club.getDeskripsi() +"\n"
                    + " - nomor " + club.getNomor() +"\n"
                    + " - gambar " + club.getGambar() +"\n"
                    + " - age " + club.getAge() + "\n");

        }
    }
}
