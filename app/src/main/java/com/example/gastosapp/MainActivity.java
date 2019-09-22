package com.example.gastosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText nome;
    private EditText categoria;
    private EditText local;
    private EditText dia;
    private EditText valor;
    private DespesaDAO dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nome = findViewById(R.id.edtNome);
        categoria = findViewById(R.id.edtCategoria);
        local = findViewById(R.id.edtLocal);
        dia = findViewById(R.id.edtDia);
        valor = findViewById(R.id.edtValor);
        dao = new DespesaDAO(this);

    }

    public void adicionar(View view){
        Despesa d = new Despesa();
        d.setNome(nome.getText().toString());
        d.setCategoria(categoria.getText().toString());
        d.setDia(dia.getText().toString());
        d.setLocal(local.getText().toString());
        d.setValor(valor.getText().toString());
        long id = dao.adicionarDespesa(d);

        Toast.makeText(this, "Despesa Inserida com o id "+id, Toast.LENGTH_SHORT).show();

    }
}
