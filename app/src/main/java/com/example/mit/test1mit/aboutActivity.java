package com.example.mit.test1mit;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by MIT on 12-May-17.
 */

public class aboutActivity extends AppCompatActivity {

    ImageView imgview;
    TextView jype,aboutText;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        imgview=(ImageView) findViewById(R.id.about1);
        imgview.setImageResource(R.drawable.wer);
        jype=(TextView)findViewById(R.id.jype);
        jype.setSelected(true);
        jype.setSingleLine(true);
        aboutText=(TextView)findViewById(R.id.aboutText);
        aboutText.setText("Got7 (Hangul: 갓세븐) is a South Korean boy group formed by JYP Entertainment. The group is composed of seven members: JB, Mark, Jackson, Jinyoung, Youngjae, BamBam, and Yugyeom. Got7 debuted in January 2014 with the release of their first EP Got It?, which peaked at number two on the Gaon Album Chart and number one on Billboard's World Albums Chart. The group gained attention for their stage performances, which include elements of martial arts tricking.\n" +
                "\n" +
                "In late 2014 Got7 signed with Sony Music Entertainment Japan and ventured into the Japanese market to release their debut Japanese-language single \"Around the World\". They returned to South Korea a month later to release their first full-length studio album Identify, topping the nation's charts. In 2015, Got7 released the EPs Just Right and Mad, which yielded their most commercially successful single, \"Just Right\". In 2016, they released their first full-length Japanese studio album, Moriagatteyo, debuting at number three on the Oricon Albums Chart. They then went on to release their fifth Korean EP Flight Log: Departure and their second full-length studio album Flight Log: Turbulence, both chart-toppers. In 2017, Got7 released their sixth EP Flight Log: Arrival, featuring the single \"Never Ever\". The album is the third and final part of the group's Flight Log series, and became their highest selling album with more than 300,000 copies sold.");

    }
}
