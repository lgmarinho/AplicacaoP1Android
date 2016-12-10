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
import android.database.sqlite.*;


public class CadastroAluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);
        Button BotaoOK = (Button) findViewById(R.id.OkButton2);
        Button BotaoLimpar2 = (Button) findViewById(R.id.LimparButton2);
        Button BotaoInicio2 = (Button) findViewById(R.id.InicioButton2);
        final EditText NomeTexto = (EditText) findViewById(R.id.NomeText);
        final EditText EnderecoTexto = (EditText) findViewById(R.id.EnderecoText);
        final EditText EmailTexto = (EditText) findViewById(R.id.EmailText2);
        final EditText TelefoneTexto = (EditText) findViewById(R.id.TelefoneText);
        final EditText NascimentoTexto = (EditText) findViewById(R.id.DtNascText);



        BotaoInicio2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(CadastroAluno.this, LoginActivity.class);
                startActivity(it);
            }
        });




        BotaoLimpar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              NomeTexto.setText("");
              EnderecoTexto.setText("");
              EmailTexto.setText("");
              TelefoneTexto.setText("");
              NascimentoTexto.setText("");

            }
        });

    }
}
