package com.example.bansos;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bansos.databinding.ActivityRegisterBinding;
import com.example.bansos.model.UserBansos;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class register extends AppCompatActivity {
    private int tinggidesign = 812;
    private int lebardesign = 375;
    private int dptingggi;
    private int dplebar;
    EditText txtname,txtemail,txtpassword1,txtpassword2;
    ImageButton btnregister;
    TextView btnsignin;

    ActivityRegisterBinding binding;
    FirebaseAuth auth;
    ProgressDialog dialog;
    DatabaseReference reference;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(register.this);
        setContentView(R.layout.activity_register);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        auth = FirebaseAuth.getInstance();
        dialog = new ProgressDialog(register.this);
        reference = FirebaseDatabase.getInstance().getReference("UserBansos");

        preferences = getSharedPreferences("Bansos",MODE_PRIVATE);
        editor = preferences.edit();

        binding.txtsigninregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(register.this, login.class));
            }
        });

        binding.btnregisterregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.txtnameregister.getText().toString();
                String email = binding.txtemailregister.getText().toString();
                String password = binding.txtpasswordregister.getText().toString();
                storeDatatoFirebase(name, email, password);
            }
        });

    }
    public int caltinggi(float value,int dp){
        return (int)(dp*(value/tinggidesign));
    }
    public int callebar(float value,int dp){
        return (int)(dp*(value/lebardesign));
    }


    private void storeDatatoFirebase(String name, String email, String password){
        dialog.setMessage("Silakan tunggu...");
        dialog.show();
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    FirebaseUser user = auth.getCurrentUser();
                    String unique = user.getUid();
                    UserBansos userBansos = new UserBansos(name,email,"");
                    reference.child(unique).setValue(userBansos).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            dialog.dismiss();
                            if(task.isSuccessful()) {
                                editor.putString("unique", unique);
                                editor.commit();
                                Toast.makeText(register.this, "Register berhasil", Toast.LENGTH_SHORT).show();
                                finish();
                            }
                        }
                    });
                }else {
                    Toast.makeText(register.this,"Register gagal", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}