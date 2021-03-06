package com.example.recyclerview;
import  androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {


    private TextView name, description,rating;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        extras = getIntent().getExtras();
        name = (TextView) findViewById(R.id.dNameId);
        description =(TextView) findViewById(R.id.descriptionID);
        rating = (TextView) findViewById(R.id.dRatingID);

        if (extras != null){
            name.setText(extras.getString("name"));
            description.setText(extras.getString("description"));
            rating.setText(extras.getString("rating"));
        }

    }
}