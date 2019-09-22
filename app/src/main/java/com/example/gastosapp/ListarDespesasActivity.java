package com.example.gastosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListarDespesasActivity extends AppCompatActivity {


    private ListView listView;
    private DespesaDAO dao;
    private List<Despesa> despesas;
    private List<Despesa> despesasFiltradas = new ArrayList<>();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_despesas);

        listView = findViewById(R.id.listar);
        dao = new DespesaDAO(this);
        despesas = dao.obterTodos();
        despesasFiltradas.addAll(despesas);

        ArrayAdapter<Despesa> adapter = new ArrayAdapter<Despesa>(this, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);





    }
}
