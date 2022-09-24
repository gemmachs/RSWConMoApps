package  id.ac.ipb.apps.rswconmoapps.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.ipb.apps.rswconmoapps.MainActivity;
import id.ac.ipb.apps.rswconmoapps.R;

public class LoginActivity extends AppCompatActivity {

    String username = "admin";
    String password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText txtUser = findViewById(R.id.txtUser);
        final EditText txtPass = findViewById(R.id.txtPass);
        Button login = findViewById(R.id.login);

        login.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                if(txtUser.getText().toString().equalsIgnoreCase(username)&& txtPass.getText().toString().equalsIgnoreCase(password)) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                } else{
                    Toast.makeText(LoginActivity.this, "Username/Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}