package deltaappdev.finalcount;

import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.Display;
import android.content.res.Configuration;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    int countt=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null){
        countt = savedInstanceState.getInt("val");}







        Button counting = (Button)findViewById(R.id.counting);
        Button reset=(Button)findViewById(R.id.reset);
        final RelativeLayout layout=(RelativeLayout)findViewById(R.id.layout);
        final TextView countView=(TextView)findViewById(R.id.countView);


        countView.setText(""+countt);
        counting.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){

                        countt++;
                        countView.setText("" +countt);

                        if(countt%5==0)

                            layout.setBackgroundColor(Color.GREEN);

                        else if (countt%5==1)

                                layout.setBackgroundColor(Color.RED);

                        else if(countt%5==2)

                            layout.setBackgroundColor(Color.YELLOW);

                        else if(countt%5==3)


                            layout.setBackgroundColor(Color.WHITE);

                        else if(countt%5==4)

                            layout.setBackgroundColor(Color.BLUE);
                    }
                }

        );





        reset.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        countt=0;
                        countView.setText(""+ countt);
                    }
                }
        );


    }

    @Override
    protected void onSaveInstanceState (Bundle outState) {
        outState.putInt("val", countt);
        super.onSaveInstanceState(outState);
    }


}

