package com.marz.weibo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WeiboActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button b = (Button)findViewById(R.id.btn_view);
        b.setOnClickListener(clickhandler);
    }
    
    private OnClickListener clickhandler = new OnClickListener() {
		public void onClick(View v) {
			((Button)v).setClickable(false);
		}
	};
}