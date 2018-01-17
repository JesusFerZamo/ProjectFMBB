package com.example.jesus.projectfmbb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciarUI();
    }

    public void iniciarUI() {
        String[] titulo = getResources().getStringArray(R.array.titulo);

        int[] imagenes = {
                R.drawable.icon01,
                R.drawable.icon02,
                R.drawable.icon03,
                R.drawable.icon04
        };
        final ListView lst = (ListView) findViewById(R.id.lst);
        adapter = new ListViewAdapter(this, titulo, imagenes);
        lst.setAdapter(adapter);

        lst.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        if (position == 0) {
                            // Abre una nueva Activity:
                            /*
                            Intent intencion1 = new Intent(view.getContext(), TerceraPantalla.class);
                            intencion1.putExtra("nombre",nombre);
                            startActivity(intencion1);
                            */
                        } else if (position == 1) {
                            /*
                            Intent inten2 = new Intent(view.getContext(), CuartaPantalla.class);
                            inten2.putExtra("nombre",nombre);
                            startActivity(inten2);
                            */
                        }
                    }
                }
        );
    }
}