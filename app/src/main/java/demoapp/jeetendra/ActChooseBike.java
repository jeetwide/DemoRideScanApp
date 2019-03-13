package demoapp.jeetendra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.yarolegovich.discretescrollview.DiscreteScrollView;

import java.util.ArrayList;
import java.util.List;

import demoapp.jeetendra.Adapters.ChooseBikeAdapter;
import demoapp.jeetendra.models.ModelBike;
import demoapp.jeetendra.models.ModelVCI;

public class ActChooseBike extends AppCompatActivity {

    private Toolbar mTopToolbar;
   // List<ModelVCI> vciList;
    List<ModelBike> bikeList;

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

        //initializing the vcilist
        bikeList = new ArrayList<>();
/*
        vciList.add(new ModelVCI("VCI000123456"));
        vciList.add(new ModelVCI("VCI000123453"));
        vciList.add(new ModelVCI("VCI000123893"));
        vciList.add(new ModelVCI("VCI000123329"));
        vciList.add(new ModelVCI("VCI000123213"));
*/

       bikeList.add(new ModelBike(R.drawable.motorcycle_png3137,"Apache RTR 160"));
       bikeList.add(new ModelBike(R.drawable.motorcycle_png3142,"Apache RTR 200"));
       bikeList.add(new ModelBike(R.drawable.motorcycle_png3147,"Apache RTR 400"));
       bikeList.add(new ModelBike(R.drawable.motor987,"Apache RTR 350"));
        DiscreteScrollView scrollView = findViewById(R.id.picker);

        scrollView.setAdapter(new ChooseBikeAdapter(ActChooseBike.this,bikeList));

    }
}
