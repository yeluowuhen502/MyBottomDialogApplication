package marsjiang.myapplication;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import me.shaohui.bottomdialog.BaseBottomDialog;

/**
 * Created by Jiang on 2016/10/25.
 */

public class MyBottomDialog extends BaseBottomDialog {
    @Override
    public int getLayoutRes() {
        return R.layout.layout;
    }

    @Override
    public void bindView(View v) {
        Button btn = (Button) v.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"haha",Toast.LENGTH_SHORT).show();
                Log.d("haha","hahhahah");
                dismiss();
            }
        });
    }
}
