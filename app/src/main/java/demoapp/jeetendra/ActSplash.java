package demoapp.jeetendra;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActSplash extends AppCompatActivity {

TextView tv_ride_tag,tv_tag_mahle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_splash);
        tv_ride_tag=findViewById(R.id.tv_ride_tag);
        tv_tag_mahle=findViewById(R.id.tv_tag_mahle);


        Typeface tf = Typeface.createFromAsset(getAssets(),"gooddog.TTF");
        tv_ride_tag.setTypeface(tf);
        Typeface tfOne = Typeface.createFromAsset(getAssets(), "chunkfive.ttf");
        tv_tag_mahle.setTypeface(tfOne);



        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent i = new Intent(ActSplash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000);

    }
}
