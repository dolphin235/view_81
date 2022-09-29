package com.example.view_81;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {

    int i, j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        TextView textviews[][] = new TextView[9][9];

        for (i=0;i<9;i++){
            for (j=0;j<9;j++){
                String tv_name = "textview"+(Integer.toString(i))+(Integer.toString(j));
                int resID = getResources().getIdentifier(tv_name, "id", getPackageName());
                textviews[i][j] = (TextView) findViewById(resID);
            }
        }

        for (i=0;i<9;i++) {
            for (j = 0; j < 9; j++) {
                final Integer tmp_i = i;
                final Integer tmp_j = j;
                textviews[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(), Integer.toString(tmp_i)+Integer.toString(tmp_j), Toast.LENGTH_SHORT).show();
                    }
                });

            }
        }
    }
}