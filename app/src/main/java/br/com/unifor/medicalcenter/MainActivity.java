package br.com.unifor.medicalcenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.button_cadastro)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });
    }

    //botao button_logar
    public void button_logar(View View) {

        setContentView(R.layout.activity_menuprincipal);

    }

    //botao button_cadastro
    public void button_cadastro(View View) {

        setContentView(R.layout.activity_cadastro);

    }

    //botao button_voltar
    public void button_voltar (View View){

        setContentView(R.layout.activity_main);
    }
}