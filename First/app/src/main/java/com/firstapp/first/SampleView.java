package com.firstapp.first;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class SampleView extends View {

    private Paint paint = new Paint();
    private Bitmap bmp;

    public SampleView(Context context) {
        super(context);
        setBackgroundColor(Color.WHITE);

        Resources res = context.getResources();
        bmp = BitmapFactory.decodeResource(res, R.drawable.sangsang);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setTextSize(100);
        canvas.drawText("Hello world!", 10, 100, paint);
        canvas.drawBitmap(bmp, 0,0, null);
    }
}
