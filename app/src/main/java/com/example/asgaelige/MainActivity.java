package com.example.asgaelige;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button phrase;
    private Button color;
    private Button animal;
    private Button month;
    private Button question;
    private Button food;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phrase = (Button)findViewById(R.id.phrases_button);
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhrases();
            }
        });

        color = (Button)findViewById(R.id.colors_button);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColors();
            }
        });

        animal = (Button)findViewById(R.id.animals_button);
        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnimals();
            }
        });

        month = (Button)findViewById(R.id.months_button);
        month.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMonths();
            }
        });

        question = (Button)findViewById(R.id.question_button);
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestions();
            }
        });

        food = (Button)findViewById(R.id.food_button);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFood();
            }
        });
    }

    public void openPhrases() {
        Intent intent = new Intent(this, Phrases.class);
        startActivity(intent);
    }

    public void openColors() {
        Intent intent = new Intent(this, Colors.class);
        startActivity(intent);
    }

    public void openAnimals() {
        Intent intent = new Intent(this, Animals.class);
        startActivity(intent);
    }

    public void openMonths() {
        Intent intent = new Intent(this, Months.class);
        startActivity(intent);
    }

    public void openQuestions() {
        Intent intent = new Intent(this, Questions.class);
        startActivity(intent);
    }

    public void openFood() {
        Intent intent = new Intent(this, Food.class);
        startActivity(intent);
    }
}