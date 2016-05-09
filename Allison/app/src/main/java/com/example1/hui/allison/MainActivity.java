package com.example1.hui.allison;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// Layout
        RelativeLayout buckysLayout = new RelativeLayout(this);
        buckysLayout.setBackgroundColor(Color.GREEN);
// Button
        Button redButton = new Button(this);
        redButton.setText("Log In");
        redButton.setBackgroundColor(Color.RED);
// Username Input
        EditText username = new EditText(this);
        redButton.setId(1);
        username.setId(2);
        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(

                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(

                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //give rules position
        usernameDetails.addRule(RelativeLayout.ABOVE, redButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,
                r.getDisplayMetrics()
        );
        username.setWidth(px);



        buckysLayout.addView(redButton,buttonDetails);
        buckysLayout.addView(username,usernameDetails);
        setContentView(buckysLayout);


    }
}
