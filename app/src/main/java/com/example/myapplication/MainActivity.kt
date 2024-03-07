package com.example.myapplication
import com.example.myapplication.RequestManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RequestManager manager = new RequestManager(this);

        manager.getNewsHEadlines();

    }
    private final OnFetchDataListener<NEws>
}