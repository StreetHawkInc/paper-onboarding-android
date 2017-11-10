package com.ramotion.paperonboarding;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;

public class GlideTransformationClass extends BitmapTransformation {

    private int radius = 0;
    private int IMG_CORNER_RADIUS_LIMIT = 40;

    public GlideTransformationClass(Context context) {
        super(context);
    }

    public GlideTransformationClass(Context context, int radius) {
        super(context);
        this.radius = radius;
    }

    @Override
    protected Bitmap transform(BitmapPool pool, Bitmap toTransform, int outWidth, int outHeight) {
        Bitmap bitmap = null;
        if(radius > IMG_CORNER_RADIUS_LIMIT){
            bitmap = circleCrop(pool, toTransform);
        }else{
            bitmap = rectangleCrop(pool, toTransform);
        }
        return bitmap;
    }

    private Bitmap rectangleCrop(BitmapPool pool, Bitmap source) {
        if (source == null) return null;

        int width = source.getWidth();
        int height = source.getHeight();

        Bitmap result = pool.get(width, height, Bitmap.Config.ARGB_8888);
        if (result == null) {
            result = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }

        Canvas canvas = new Canvas(result);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(source, BitmapShader.TileMode.CLAMP, BitmapShader.TileMode.CLAMP));


        float right = width - 5;
        float bottom = height - 5;

        canvas.drawRoundRect(new RectF(5, 5, right, bottom), radius, radius, paint);
        return result;
    }

    private Bitmap circleCrop(BitmapPool pool, Bitmap source) {
        if (source == null) return null;

        int size = Math.min(source.getWidth(), source.getHeight());
        int x = (source.getWidth() - size) / 2;
        int y = (source.getHeight() - size) / 2;

        Bitmap squared = Bitmap.createBitmap(source, x, y, size, size);

        Bitmap result = pool.get(size, size, Bitmap.Config.ARGB_8888);
        if (result == null) {
            result = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);
        }

        Canvas canvas = new Canvas(result);
        Paint paint = new Paint();
        paint.setShader(new BitmapShader(squared, BitmapShader.TileMode.CLAMP, BitmapShader.TileMode.CLAMP));
        paint.setAntiAlias(true);
        float r = size / 2f;
        canvas.drawCircle(r, r, r, paint);
        return result;
    }

    @Override public String getId() {
        return getClass().getName();
    }
}