package test.svn.huige.com.shadowdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MatrixTest.mapRectTest();
        SetPolyToPoly poly = (SetPolyToPoly) findViewById(R.id.poly);
        poly.setTestPoint(4);
    }
}
