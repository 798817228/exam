package com.example.student.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import static android.widget.ListPopupWindow.WRAP_CONTENT;



public class Card extends FrameLayout {



    public Card(@NonNull Context context,int w){
        super(context);
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(w-10 ,w-10);
        lp.setMargins(5,5,5,5);

        View view = new View(context);
        view.setBackgroundColor(0x33ff00ff);
        addView(view,lp);

         tv= new TextView(context);
       // tv.setText(Integer.toString(0));
        tv.setTextSize(48);
        tv.setGravity(Gravity.CENTER);
        addView(tv,lp);

    }
    TextView tv;
    int value;
     public int getNum()
    {
        return value;
    }
    public void setNum(int num){
   value=num;

        if (num > 0)
        tv.setText(Integer.toString(num));
        else
            tv.setText("");


        switch(num)
        {
            case 0:
                tv.setBackgroundColor(0xffcdc1b4);
                break;

            case 2:
                tv.setBackgroundColor(0xffeee4da);
                tv.setTextColor(0xff000000);

                break;
            case 4:
                tv.setBackgroundColor(0xffede0c8);
                tv.setTextColor(0xff000000);


                break;
            case 8:
                tv.setBackgroundColor(0xfff2b179);
                tv.setTextColor(0xffffffff);

                break;


        }

     //   tv.setTextColor(0xffffffff);
    }

}

