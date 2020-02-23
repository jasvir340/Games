package jvtech.game_edit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView res;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        res=(TextView)findViewById(R.id.res);
        res.setText(getIntent().getExtras().getString("resu"));
    }
}
