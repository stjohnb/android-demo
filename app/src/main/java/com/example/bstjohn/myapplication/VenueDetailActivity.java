package com.example.bstjohn.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class VenueDetailActivity extends Activity {

    @InjectView(R.id.detail_image)
    ImageView detailsImage;

    @InjectView((R.id.detail_text))
    TextView detailText;


    @InjectView((R.id.detail_description))
    TextView description;

    @InjectView((R.id.detail_open_in_browser))
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue_detail);
        ButterKnife.inject(this);
        initButtons();
        initImage();
    }

    private void initImage() {
        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(detailsImage);
    }

    private void initButtons() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.gilt.com"));
                startActivity(intent);
            }
        });
    }

}
