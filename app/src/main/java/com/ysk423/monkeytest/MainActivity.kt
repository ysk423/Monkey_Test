package com.ysk423.monkeytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //bt1のボタンオブジェクトを取得
        val bt1Click = findViewById<Button>(R.id.test_bt1)
        //リスナクラスのインスタンスを生成
        val listener01 = BtListener_toast()
        bt1Click.setOnClickListener(listener01)

        //bt2のボタンオブジェクトを取得
        val bt2Click = findViewById<Button>(R.id.test_bt2)
        //リスナクラスのインスタンスを生成
        val listener02 = BtListener_toast()
        bt2Click.setOnClickListener(listener02)
    }




}