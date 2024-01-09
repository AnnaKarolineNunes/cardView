package br.com.crusoandroid.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.com.crusoandroid.cardview.R;
import br.com.crusoandroid.cardview.adapter.PostagemAdapter;
import br.com.crusoandroid.cardview.model.Postagem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>(); // array que armazena o banco de dados

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerView);

        //definir layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);
        //definir adapter
        prepararPostagens(); // metodo que funciona como  um "banco de dados"

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter( adapter);
    }

    public void prepararPostagens(){
        Postagem postagem = new Postagem("Anna Karoline" , "#tbt viagem legal", R.drawable.imagem1);
        this.postagens.add(postagem);

        postagem = new Postagem("Larissa Machado","#amei tudo isso",R.drawable.imagem2);
        this.postagens.add(postagem);

        postagem = new Postagem("Pedro Santana","# romantico",R.drawable.imagem3);
        this.postagens.add(postagem);

        postagem = new Postagem("Juliana Silva","#radical",R.drawable.imagem4);
        this.postagens.add(postagem);



    }
}