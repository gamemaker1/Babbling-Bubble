package com.example.babblingbubble;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SharedTextHandler extends AppCompatActivity {

    private Button addAsTodoButton;
    private Button sendAsMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_text_handler);

        addAsTodoButton = findViewById(R.id.add_as_todo);
        sendAsMessage = findViewById(R.id.add_as_message);

        Intent receivedIntent = getIntent();
        final String textToShare = receivedIntent.getStringExtra("textToShare");

        addAsTodoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SharedTextHandler.this, GroupQuestion.class);
                intent.putExtra("type", "todo");
                intent.putExtra("textToShare", textToShare);
                startActivity(intent);
            }
        });


        sendAsMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SharedTextHandler.this, GroupQuestion.class);
                intent.putExtra("type", "message");
                intent.putExtra("textToShare", textToShare);
                startActivity(intent);
            }
        });

    }
}
