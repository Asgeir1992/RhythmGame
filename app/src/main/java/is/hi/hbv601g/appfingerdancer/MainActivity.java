package is.hi.hbv601g.appfingerdancer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private Button btnSignup;
    private Button btnCreateUser;
    private Button getBtnLogin;
    private Button btnPlay;
    private Button btnHighScore;
    private Button btnSettings;
    private Button btnAddTracks;
    private EditText txtUsername;
    private EditText txtPassword;
    private EditText txtEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnSignup = (Button) findViewById(R.id.btnSignup);
        btnCreateUser = (Button) findViewById(R.id.btnCreateUser);
        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        txtUsername.setVisibility(View.GONE);
        txtPassword.setVisibility(View.GONE);
        txtEmail.setVisibility(View.GONE);
        btnCreateUser.setVisibility(View.GONE);
        btnLogin.setVisibility(View.GONE);




    }

    public void playGame(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }



    public void signUp(View v){
        txtUsername.setVisibility(View.VISIBLE);
        txtPassword.setVisibility(View.VISIBLE);
        txtEmail.setVisibility(View.VISIBLE);
        btnCreateUser.setVisibility(View.VISIBLE);

    }

    public void signIn(View v){
        txtUsername.setVisibility(View.VISIBLE);
        txtPassword.setVisibility(View.VISIBLE);
        btnLogin.setVisibility(View.VISIBLE);
        txtEmail.setVisibility(View.GONE);
        btnCreateUser.setVisibility(View.GONE);




    }
}
