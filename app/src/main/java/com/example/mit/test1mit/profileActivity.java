package com.example.mit.test1mit;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by MIT on 12-May-17.
 */
public class profileActivity extends Activity {

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        ImageView profile1=(ImageView)findViewById(R.id.profile1);
        profile1.setImageResource(R.drawable.f2);
    }
}
