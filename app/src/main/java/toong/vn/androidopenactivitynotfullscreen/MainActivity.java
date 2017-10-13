package toong.vn.androidopenactivitynotfullscreen;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this, DialogActivity.class), 234);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog a =
                        new AlertDialog.Builder(MainActivity.this).setMessage("as\na\na").create();
                a.show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Tag", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Tag", "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Tag", "onPause");
    }
}
