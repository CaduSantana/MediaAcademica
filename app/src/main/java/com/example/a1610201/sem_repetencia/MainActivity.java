package com.example.a1610201.sem_repetencia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.a1610201.sem_repetencia.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtCalcular(View view) {
        //recupera o EditText eSemestreUm definido no layout
        EditText eSemestreUm = findViewById(R.id.eSemestreUm);

        //Recupera o conteúdo digitado pelo usuário em um string
        String sSemestreUm = eSemestreUm.getText().toString();

        //recupera o EditText eSemestreUmF definido no layout
        EditText eSemestreUmF = findViewById(R.id.eSemestreUmF);

        //Recupera o conteúdo digitado pelo usuário em um string
        String sSemestreUmF = eSemestreUmF.getText().toString();

        //recupera o EditText eSemestreUm definido no layout
        EditText eSemestreDois = findViewById(R.id.eSemestreDois);

        //Recupera o conteúdo digitado pelo usuário em um string
        String sSemestreDois = eSemestreDois.getText().toString();

        //recupera o EditText eSemestreUm definido no layout
        EditText eSemestreDoisF = findViewById(R.id.eSemestreDoisF);

        //Recupera o conteúdo digitado pelo usuário em um string
        String sSemestreDoisF = eSemestreDoisF.getText().toString();


        //Transforma os strings em doubles
        double dSemestreUm = Double.parseDouble(sSemestreUm);
        double dSemestreUmF = Double.parseDouble(sSemestreUmF);
        double dSemestreDois = Double.parseDouble(sSemestreDois);
        double dSemestreDoisF = Double.parseDouble(sSemestreDoisF);

        //Definindo critérios de aprovação
        double aprovaM=6;
        double aprovaF=0.75;

        //Cálculo
        double mediaGeral = (dSemestreUm+dSemestreDois)/2;
        double faltas = ((dSemestreUmF+dSemestreDoisF))/80;
        double freq = 1-faltas;

        //Resultado

        //recupera o TextView tvResultado definido no layout
        TextView tvResultado = findViewById(R.id.tvResultado);


        if(mediaGeral>=aprovaM&&freq>=aprovaF){
            //Recupera o conteúdo digitado pelo usuário em um string
            tvResultado.setText("Aprovado");
        }else{
            tvResultado.setText("Reprovado");
        }

        //recupera o EditText tvMG definido no layout
        TextView tvMG = findViewById(R.id.tvMG);

        //Recupera o conteúdo digitado pelo usuário em um string
        tvMG.setText(String.valueOf(mediaGeral));

        //recupera o EditText tvMG definido no layout
        TextView tvFreq = findViewById(R.id.tvFreq);

        //Recupera o conteúdo digitado pelo usuário em um string
        tvFreq.setText(String.valueOf(freq));
    }
}
