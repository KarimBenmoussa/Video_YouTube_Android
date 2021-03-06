package com.example.karim_utilisateur.tdyoutube.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.karim_utilisateur.tdyoutube.Constants;
import com.example.karim_utilisateur.tdyoutube.R;
import com.example.karim_utilisateur.tdyoutube.interfaces.OnSearchSelectedListener;

public class SearchActivity extends AppCompatActivity implements OnSearchSelectedListener {


    private EditText search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        search = (EditText)findViewById(R.id.editSearch);
    }

    @Override
    public void onSearchSelected(View view) {
        ListActivity.start(this, search.getText().toString().replace(' ','+'));
    }
}
