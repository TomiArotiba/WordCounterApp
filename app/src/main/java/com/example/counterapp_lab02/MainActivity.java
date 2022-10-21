package com.example.counterapp_lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import utils.TextCounter;

public class MainActivity extends AppCompatActivity {

    private Spinner spSelectOptions;
    private EditText edPhrase;
    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edPhrase = findViewById(R.id.edPhrase);
        this.tvMain = findViewById(R.id.tvmain);

        this.spSelectOptions = (Spinner) findViewById(R.id.spSelectOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spSelectOptions.setAdapter(adapter);
    }

    public void onBtnCountClick(View view) {
        String selectedOption = this.spSelectOptions.getSelectedItem().toString();
        String defaultCharacterSelectedOption = getResources().getString(R.string.characters_selection);

        if(selectedOption.equals(defaultCharacterSelectedOption)) {
            String userInputText = this.edPhrase.getText().toString();
            if(TextUtils.isEmpty(userInputText)) {
                Toast.makeText(this, "You have not entered any text for counting", Toast.LENGTH_SHORT).show();
            }
            else {
                String charactersCount = TextCounter.getCharsCount(userInputText);
                this.tvMain.setText(charactersCount);
            }
        }
        else {
            String userInputText = this.edPhrase.getText().toString();
            String wordsCount = TextCounter.getWordsCount(userInputText);
            this.tvMain.setText(wordsCount);
        }
    }
}