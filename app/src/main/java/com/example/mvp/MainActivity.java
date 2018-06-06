package com.example.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.mvp.adapter.GirlAdapter;
import com.example.mvp.bean.Girl;
import com.example.mvp.precenter.GirlPrecenter;
import com.example.mvp.view.IGirlView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IGirlView {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.listview);
        new GirlPrecenter(this).fetch();

    }

    @Override
    public void showGirls(List<Girl> girls) {
        //model层的数据在girls中返回了
        list.setAdapter(new GirlAdapter(this,girls));
    }


}
