package com.example.top10vaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Lada Granta Спорт");
        list.add("Lada Kalina");
        list.add("Lada Vesta");
        list.add("Lada SW Cross");
        list.add("Lada Kalina Спорт");
        list.add("Lada Xray");
        list.add("УАЗ Патриот");
        list.add("Niva Taravel");
        list.add("Lada Largus");
        list.add("Москвич 3");


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0){
                    startActivity(new Intent(MainActivity.this,LadaGrantaActivity.class));

                }else  if(i==1){
                    startActivity(new Intent(MainActivity.this,LadaKalinaActivity.class));
                }else  if(i==2){
                    startActivity(new Intent(MainActivity.this,LadaVestaActivity.class));

                }else if (i==3){
                    startActivity(new Intent(MainActivity.this,LadaSWCrossActivity.class));
                }else if (i==4){
                    startActivity(new Intent(MainActivity.this,LadaKalinaSActivity.class));
                }else if (i==5){
                    startActivity(new Intent(MainActivity.this,LadaXrayActivity.class));
                }else if (i==6){
                    startActivity(new Intent(MainActivity.this,UAZActivity.class));
                }else if (i==7){
                    startActivity(new Intent(MainActivity.this,NivaActivity.class));
                }else if (i==8){
                    startActivity(new Intent(MainActivity.this,LargusActivity.class));
                }else if (i==9){
                    startActivity(new Intent(MainActivity.this,MoscowActivity.class));
                }
            }
        });

    }
}