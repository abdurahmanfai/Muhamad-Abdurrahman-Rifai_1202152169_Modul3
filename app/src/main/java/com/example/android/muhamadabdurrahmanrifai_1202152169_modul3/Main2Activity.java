package com.example.android.muhamadabdurrahmanrifai_1202152169_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Main2Activity extends AppCompatActivity {

    private final LinkedList<String> njudul = new LinkedList<>(); //atribut judul
    private final LinkedList<String> ndesc = new LinkedList<>(); //atribut deskripsi
    private final LinkedList<Integer> nimage = new LinkedList<>(); //atribut image

    private RecyclerView recycler; //atribut recyclerview
    private ListAir list; //atribut untuk menghubungkan data listair


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        list();

        recycler=(RecyclerView)findViewById(R.id.recyclerview); //untuk implementasi recyclerview
        list = new ListAir(this,njudul,ndesc,nimage);//implementsi untuk list yaitu judul deskripsi dan image
        recycler.setAdapter(list);//untuk koneksi
        recycler.setLayoutManager(new LinearLayoutManager(this));//set untuk layout
    }

    private void list(){ //untuk memasukan list pada recyclerview
        njudul.add("Ades");
        njudul.add("Amidis");
        njudul.add("Aqua");
        njudul.add("Cleo");
        njudul.add("Club");
        njudul.add("Equil");
        njudul.add("Le minerale");
        njudul.add("Nestle");
        njudul.add("Pristine");
        njudul.add("Vit");

        ndesc.add("Ades air minum yang kemasannya dapat mudah di recycle.");
        ndesc.add("AMIDIS air minum untuk kesehatan.");
        ndesc.add("Aqua air minum yang dibeli banyak kalangan.");
        ndesc.add("Cleo air minum yang katanya berasa lebih manis.");
        ndesc.add("Club air minum yang biasanya dibeli untuk club-club.");
        ndesc.add("Equil air minum yang isinya sesuai sekali minum.");
        ndesc.add("Le minerale air minum yang ada rasanya.");
        ndesc.add("Nestle air minum yang biasanya dibeli ibu ibu.");
        ndesc.add("Pristine air minum yang memiliki manfaat untuk kesehatan.");
        ndesc.add("Vit air minum yang membuat kita menjadi lebih vit.");

        nimage.add(R.drawable.ades);
        nimage.add(R.drawable.amidis);
        nimage.add(R.drawable.aqua);
        nimage.add(R.drawable.cleo);
        nimage.add(R.drawable.club);
        nimage.add(R.drawable.equil);
        nimage.add(R.drawable.leminerale);
        nimage.add(R.drawable.nestle);
        nimage.add(R.drawable.pristine);
        nimage.add(R.drawable.vit);
    }


}
