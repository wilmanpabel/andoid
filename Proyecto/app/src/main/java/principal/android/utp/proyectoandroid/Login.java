package principal.android.utp.proyectoandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    Button loginL;
    EditText usuarioL, contrasenaL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginL = findViewById(R.id.btnLogin);
        usuarioL = findViewById(R.id.txtUsuario);
        contrasenaL = findViewById(R.id.txtContraseña);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
