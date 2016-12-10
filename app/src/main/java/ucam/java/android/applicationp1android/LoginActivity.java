package ucam.java.android.applicationp1android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;


import ucam.java.android.applicationp1android.dao.LoginDAO;
import ucam.java.android.applicationp1android.model.Login;

import static ucam.java.android.applicationp1android.R.id.EmailText;
import static ucam.java.android.applicationp1android.R.id.LoginButton;
import static ucam.java.android.applicationp1android.R.id.SenhaText;


public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button BotaoLogin = (Button) findViewById(R.id.LoginButton);
        Button BotaoLimpar = (Button) findViewById(R.id.LimparButton);
        Button BotaoCadastrar = (Button) findViewById(R.id.CadastrarButton);
        final EditText EmailTexto = (EditText) findViewById(R.id.EmailText1);
        final EditText SenhaTexto = (EditText) findViewById(R.id.SenhaText);

        BotaoLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(LoginActivity.this, CadastroTela.class);
                startActivity(it);
            }
        });

        BotaoLimpar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                EmailTexto.setText("");
                SenhaTexto.setText("");


            }
        });

        BotaoCadastrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Login login = new Login();
                login.setEmail(EmailTexto.getText());
                login.getSenha(SenhaTexto.getText());

                LoginDAO dao = new LoginDAO(getApplicationContext());

            }
        });

    }

}