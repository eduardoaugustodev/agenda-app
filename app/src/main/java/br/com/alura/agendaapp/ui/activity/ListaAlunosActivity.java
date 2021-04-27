package br.com.alura.agendaapp.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

import br.com.alura.agendaapp.R;

public class ListaAlunosActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Lista de Aluno");
        setContentView(R.layout.activity_lista_aluno);

        List<String> lista = Arrays.asList("João","Eduardo", "Paulo");
        ListView listaAlunos = findViewById(R.id.activity_main_lista_alunos);
        listaAlunos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista));
    }
}
