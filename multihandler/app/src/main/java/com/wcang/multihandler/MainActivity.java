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
    private Handler anotherHandler;


    public class TestThread extends Thread {
        public Handler handler;
        @Override
        public void run() {
            setName("TestThread");
            Looper.prepare();
            // Handler will automatically binds to Looper that is attached to current thread
            // unless specified otherwise
            handler = new Handler() {
                @Override
                public void handleMessage(Message msg) {
                    Date date = (Date) msg.obj;
                    Log.i(TAG, String.format("Original Handler Thread %s timestamp %s", getName(), date.toString()));
                }
            };
            Looper.loop();
            Log.i(TAG, "Goodbye cruel world");
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

                if (v.getId() == R.id.button) {
                    Message msg = testThread.handler.obtainMessage(0, new Date());
                    testThread.handler.sendMessage(msg);
                }
            }
        });


        final Button anotherButton = findViewById(R.id.button2);
        anotherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (anotherHandler == null) {
                    anotherHandler = new Handler(testThread.handler.getLooper()) {
                        @Override
                        public void handleMessage(Message msg) {
                            Date date = (Date) msg.obj;
                            Log.i(TAG, String.format("Another Handler Thread %s timestamp %s", Thread.currentThread().getName(), date.toString()));                        }
                    };
                }
                if (v.getId() == R.id.button2) {
                    Message msg = anotherHandler.obtainMessage(0, new Date());
                    anotherHandler.sendMessage(msg);
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
