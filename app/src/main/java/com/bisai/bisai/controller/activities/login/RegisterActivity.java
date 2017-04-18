package com.bisai.bisai.controller.activities.login;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.bisai.bisai.R;
import com.bisai.bisai.controller.managers.RegisterCallback;
import com.bisai.bisai.model.UserDTO;


/**
 * A Add screen that offers Add via username/baskets.
 */
public class RegisterActivity extends AppCompatActivity  {

    // UI references.
    private EditText username;
    private EditText email;
    private EditText password;
    private EditText password2;
    private UserDTO userDTO;

    // ATTR
    String playerPosicionCampo;

    private View mProgressView;
    private View mAddFormView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.register_activity);
/*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        // Set up the Add form.
        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        password2 = (EditText) findViewById(R.id.password2);

        Button registerButton= (Button) findViewById(R.id.register_button2);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptRegister(view);
            }
        });

        mAddFormView = findViewById(R.id.register_form);
        mProgressView = findViewById(R.id.register_progress);
        */
    }


}

