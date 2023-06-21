package com.example.uas_papb2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class CustomButton extends AppCompatButton {

    private boolean clicked = false;
    private void init(){
        setBackgroundColor(getResources().getColor(R.color.purple_200));
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicked){
                    setBackgroundColor(getResources().getColor(R.color.purple_200));
                    clicked = false;
                } else {
                    setBackgroundColor(getResources().getColor(R.color.teal_200));
                    clicked = true;
                }
            }
        });

    }
    public CustomButton(@NonNull Context context) {
        super(context);
        init();
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
}
