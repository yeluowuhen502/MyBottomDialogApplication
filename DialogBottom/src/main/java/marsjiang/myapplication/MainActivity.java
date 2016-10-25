package marsjiang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout activityMain;
    private Button searchCloseBtn;

    private void assignViews() {
        activityMain = (RelativeLayout) findViewById(R.id.activity_main);
        searchCloseBtn = (Button) findViewById(R.id.search_close_btn);
        searchCloseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyBottomDialog dialog = new MyBottomDialog();
                dialog.show(getSupportFragmentManager());
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
    }
}
