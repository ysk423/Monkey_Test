package com.ysk423.monkeytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast

class CheckToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_toast)

        //CTV01のボタンオブジェクトを取得
        val bt1Click = findViewById<Button>(R.id.CTB01)
        //リスナクラスのインスタンスを生成
        val listener01 = BtListener_toast()
        bt1Click.setOnClickListener(listener01)

        //CTV02のボタンオブジェクトを取得
        val bt2Click = findViewById<Button>(R.id.CTB02)
        //リスナクラスのインスタンスを生成
        val listener02 = BtListener_toast()
        bt2Click.setOnClickListener(listener02)

    }


    //Toast表示メソッド
    private inner class BtListener_toast: View.OnClickListener{
        override fun onClick(view: View){
            toastMake("testtoast",0,800)
        }
    }


    //Toast作成
    private fun toastMake(message: String, x:Int, y:Int){
        val toast = Toast.makeText(applicationContext, message, Toast.LENGTH_LONG)
        //位置調整
        toast.setGravity(Gravity.CENTER,x,y)
        toast.show()
    }
}