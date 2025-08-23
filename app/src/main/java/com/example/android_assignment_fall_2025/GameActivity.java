package com.example.android_assignment_fall_2025;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GameActivity extends AppCompatActivity {

    private EditText guessInput;
    private Button submitGuessBtn;
    private Button resetGameBtn;
    private TextView feedbackView;
    private TextView counterView;

    private GameManagerSingleton gameManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TODO 1: Set content view to the correct layout file
        // Hint: Look for the layout XML associated with this activity

        gameManager = GameManagerSingleton.getInstance();

        // TODO 3: Bind UI elements (EditText, Buttons, TextViews) to their XML counterparts
        // Hint : Match variable names with IDs defined in 'layout XML associated with this activity;'


        //DO NOT MODIFY
        EdgeToEdge.enable(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //END OF DO NOT MODIFY

        // TODO 4: Implement logic for when the submit button is clicked
        // Hint : Use GameManagerSingleton to check the guess and update the UI

        // TODO 6: Implement logic for when the reset button is clicked
        // Hint : Reset the game state and clear feedback

    }
}
