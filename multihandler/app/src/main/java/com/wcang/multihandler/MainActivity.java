package com.wcang.multihandler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TestThread testThread;

    public class TestThread extends Thread {
        public Handler handler;
        @Override
        public void run() {
            setName("TestThread");
            Looper.prepare();
            handler = new Handler() {
                @Override
                public void handleMessage(Message msg) {
                    Date date = (Date) msg.obj;
                    Log.i(TAG, String.format("Thread %s timestamp %s", getName(), date.toString()));
                }
            };
            Looper.loop();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testThread = new TestThread();
        testThread.start();

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: ");
                if (v.getId() == R.id.button) {
                    Message msg = testThread.handler.obtainMessage(0, new Date());
                    testThread.handler.sendMessage(msg);
                }
            }
        });
    }
    

    @Override
    protected void onDestroy() {
        testThread.handler.getLooper().quit();
        super.onDestroy();
    }
}
