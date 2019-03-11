package demoapp.jeetendra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ActChooseBike extends AppCompatActivity {

    private Toolbar mTopToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_choose_bike);

        //  tv_toolbar_txt.findViewById(R.id.tv_toolbar_txt);
        mTopToolbar=findViewById(R.id.toolbar);

        mTopToolbar.setTitle("TVS RACING");
        mTopToolbar.setTitleTextColor(getResources().getColor(R.color.colorToolTitle));
        setSupportActionBar(mTopToolbar);

       /* Typeface tf = Typeface.createFromAsset(getAssets(),"alexbrush.ttf");
        tv_toolbar_txt.setTypeface(tf);*/

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mTopToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }
}
