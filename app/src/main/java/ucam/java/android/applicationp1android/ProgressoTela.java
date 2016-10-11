package ucam.java.android.applicationp1android;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DialogTitle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class ProgressoTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progresso_tela);


        Button BotaoVoltar = (Button) findViewById(R.id.VoltarButton);
        Button BotaoInicio3 = (Button) findViewById(R.id.InicioButton3);


        BotaoVoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(ProgressoTela.this, CadastroTela.class);
                startActivity(it);
            }
        });

        BotaoInicio3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(ProgressoTela.this, LoginActivity.class);
                startActivity(it);
            }
        });

    }
}
