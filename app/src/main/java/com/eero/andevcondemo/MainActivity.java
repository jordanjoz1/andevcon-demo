package com.eero.andevcondemo;

import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText inputView;
    private TextView outputView;

    ArrayList<Pair<Integer, Integer>> history = new ArrayList<Pair<Integer, Integer>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputView = (EditText) findViewById(R.id.input_field);
        outputView = (TextView) findViewById(R.id.output);

        inputView.addTextChangedListener(new InputTextWatcher());

        solver = new Solver();
    }

    Solver solver;

    private class InputTextWatcher implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable.toString())) return;
            int input = Integer.valueOf(editable.toString());
            int output = solver.fibonacci(input);
            history.add(new Pair<Integer, Integer>(input, output));
            String textOutput = String.valueOf(output);
            outputView.setText(String.valueOf(output));
            // hacking
        }
    }


}
