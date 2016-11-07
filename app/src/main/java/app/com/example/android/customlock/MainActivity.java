package app.com.example.android.customlock;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import java.util.Random;




public class MainActivity extends AppCompatActivity {

    String[] colorArray = {"0xff00ffff","0xff888888","0xff00ff00", "0xffff00ff", "0xffff0000",
            "0xffffff00", "0xff000000","0xFFFF00BB", "0xFFFF5900"};

    TextView tVPrompt;
    Button bHit;
    Button bArray[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        tVPrompt = (TextView) findViewById(R.id.tVPrompt);
        tVPrompt.setText("Hello There my Friend");

        bHit = (Button) findViewById(R.id.bHit);
        bHit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tVPrompt.setText("YAY U PRESSED IT!");
            }

        });

        bArray = new Button[9];
        bArray[0] = (Button) findViewById(R.id.b1);
        bArray[1] = (Button) findViewById(R.id.b2);
        bArray[2] = (Button) findViewById(R.id.b3);
        bArray[3] = (Button) findViewById(R.id.b4);
        bArray[4] = (Button) findViewById(R.id.b5);
        bArray[5] = (Button) findViewById(R.id.b6);
        bArray[6] = (Button) findViewById(R.id.b7);
        bArray[7] = (Button) findViewById(R.id.b8);
        bArray[8] = (Button) findViewById(R.id.b9);



        View.OnClickListener btnHandler = new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.b1:
                        tVPrompt.setText("You clicked Button 1");
                        break;
                    case R.id.b2:
                        tVPrompt.setText("You clicked Button 2");
                        break;
                    case R.id.b3:
                        tVPrompt.setText("You clicked Button 3");
                        break;
                    case R.id.b4:
                        tVPrompt.setText("You clicked Button 4");
                        break;
                    case R.id.b5:
                        tVPrompt.setText("You clicked Button 5");
                        break;
                    case R.id.b6:
                        tVPrompt.setText("You clicked Button 6");
                        break;
                    case R.id.b7:
                        tVPrompt.setText("You clicked Button 7");
                        break;
                    case R.id.b8:
                        tVPrompt.setText("You clicked Button 8");
                        break;
                    case R.id.b9:
                        tVPrompt.setText("You clicked Button 9");
                        break;

                    default:
                        break;

                }
            }
        };

        for (int i = 0; i < bArray.length; ++i)
        {
            bArray[i].setOnClickListener(btnHandler);
        }

        distributeColors();



    }


    public void distributeColors() {

      //  bArray[0].setBackgroundColor(Color.parseColor(0xff00ffff));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
