package demoapp.jeetendra;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import demoapp.jeetendra.Adapters.VciAdapter;
import demoapp.jeetendra.models.ModelVCI;

public class MainActivity extends AppCompatActivity {


    TextView tv_toolbar_txt,tv_tag_diag;

    //a list to store all the products
    List<ModelVCI> vciList;

    //the recyclerview
    RecyclerView recyclerView;

    private Toolbar mTopToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_tag_diag=findViewById(R.id.tv_tag_diag);

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




        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        //initializing the vcilist
        vciList = new ArrayList<>();
        vciList.add(new ModelVCI("VCI000123456"));
        vciList.add(new ModelVCI("VCI000123453"));
        vciList.add(new ModelVCI("VCI000123893"));
        vciList.add(new ModelVCI("VCI000123329"));
        vciList.add(new ModelVCI("VCI000123213"));

        //creating recyclerview adapter
        VciAdapter adapter = new VciAdapter(this, vciList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

        tv_tag_diag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Searching for Device button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        

    }

}
