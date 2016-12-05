package com.example.xuhua.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by xuhua on 2016/12/5.
 */

public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
