package com.example.canvasdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

public class VerticalTextView extends TextView {
    
    public VerticalTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VerticalTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(heightMeasureSpec, widthMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.rotate(-90);
        canvas.translate(-getWidth(), 0);
        super.onDraw(canvas);
    }
}
