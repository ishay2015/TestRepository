package tutorial.myfirstproject.com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toast1_onClick(View view) {
        Toast.makeText(getBaseContext(),"Toast 1",Toast.LENGTH_SHORT).show();
    }
}
