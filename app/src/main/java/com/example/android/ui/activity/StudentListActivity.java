package com.example.android.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        setTitle("Estudando Android");
        List<String> alunos = new ArrayList<>(
                Arrays.asList("Alice", "André", "Paulo", "Ellen", "Patoi Paulinho", "Mamusca"));
        ListView listaDeAlunos = findViewById(R.id.activity_listView_lista_de_alunos); //busca pelo ID, R
        listaDeAlunos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos));

    }
}
