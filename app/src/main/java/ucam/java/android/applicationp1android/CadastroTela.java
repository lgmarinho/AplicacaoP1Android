package ucam.java.android.applicationp1android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.database.sqlite.*;


public class CadastroTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_tela);

       Button BotaoCadastroAluno = (Button) findViewById(R.id.AlunoCadastroButton);
       Button BotaoProgresso = (Button) findViewById(R.id.ProgressoButton);
       Button BotaoInicio = (Button) findViewById(R.id.InicioButton);


        BotaoCadastroAluno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(CadastroTela.this, CadastroAluno.class);
                startActivity(it);
            }
        });

        BotaoProgresso.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(CadastroTela.this, ProgressoTela.class);
                startActivity(it);
            }
        });

        BotaoInicio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(CadastroTela.this, LoginActivity.class);
                startActivity(it);
            }
        });

    }
}
