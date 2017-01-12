package robertapengelly.support.view;

import  android.os.Build;
import  android.view.View;

import  robertapengelly.support.view.animation.AnimatorProxy;

public final class ViewHelper {

    public static float getAlpha(View view) {
    
        if (Build.VERSION.SDK_INT < 11)
            return AnimatorProxy.wrap(view).getAlpha();
        
        return view.getAlpha();
    
    }
    
    public static float getPivotX(View view) {
    
        if (Build.VERSION.SDK_INT < 11)
            return AnimatorProxy.wrap(view).getPivotX();
        
        return view.getPivotX();
    
    }
    
    public static float getPivotY(View view) {
    
        if (Build.VERSION.SDK_INT < 11)
            return AnimatorProxy.wrap(view).getPivotY();
        
        return view.getPivotY();
    
    }
    
    public static float getRotation(View view) {
    
        if (Build.VERSION.SDK_INT < 11)
            return AnimatorProxy.wrap(view).getRotation();
        
        return view.getRotation();
    
    }
    
    public static float getRotationX(View view) {
    
        if (Build.VERSION.SDK_INT < 11)
            return AnimatorProxy.wrap(view).getRotationX();
        
        return view.getRotationX();
    
    }
    
    public static float getRotationY(View view) {
    
        if (Build.VERSION.SDK_INT < 11)
            return AnimatorProxy.wrap(view).getRotationY();
        
        return view.getRotationY();
    
    }
    
    public static float getScaleX(View view) {
    
        if (Build.VERSION.SDK_INT < 11)
            return AnimatorProxy.wrap(view).getScaleX();
        
        return view.getScaleX();
    
    }
    
    public static float getScaleY(View view) {
    
        if (Build.VERSION.SDK_INT < 11)
            return AnimatorProxy.wrap(view).getScaleY();
        
        return view.getScaleY();
    
    }
    
    public static float getScrollX(View view) {
    
        if (Build.VERSION.SDK_INT < 11)
            return AnimatorProxy.wrap(view).getScrollX();
        
        return view.getScrollX();
    
    }
    
    public static float getScrollY(View view) {
    
        if (Build.VERSION.SDK_INT < 11)
            return AnimatorProxy.wrap(view).getScrollY();
        
        return view.getScrollY();
    
    }
    
    public static float getTranslationX(View view) {
    
        if (Build.VERSION.SDK_INT < 11)
            return AnimatorProxy.wrap(view).getTranslationX();
        
        return view.getTranslationX();
    
    }
    
    public static float getTranslationY(View view) {
    
        if (Build.VERSION.SDK_INT < 11)
            return AnimatorProxy.wrap(view).getTranslationY();
        
        return view.getTranslationY();
    
    }
    
    public static float getX(View view) {
    
        if (Build.VERSION.SDK_INT < 11)
            return AnimatorProxy.wrap(view).getX();
        
        return view.getX();
    
    }
    
    public static float getY(View view) {
    
        if (Build.VERSION.SDK_INT < 11)
            return AnimatorProxy.wrap(view).getY();
        
        return view.getY();
    
    }
    
    public static void setAlpha(View view, float alpha) {
    
        if (Build.VERSION.SDK_INT < 11)
            AnimatorProxy.wrap(view).setAlpha(alpha);
        else
            view.setAlpha(alpha);
    
    }
    
    public static void setPivotX(View view, float pivotX) {
    
        if (Build.VERSION.SDK_INT < 11)
            AnimatorProxy.wrap(view).setPivotX(pivotX);
        else
            view.setPivotX(pivotX);
    
    }
    
    public static void setPivotY(View view, float pivotY) {
    
        if (Build.VERSION.SDK_INT < 11)
            AnimatorProxy.wrap(view).setPivotY(pivotY);
        else
            view.setPivotY(pivotY);
    
    }
    
    public static void setRotation(View view, float rotation) {
    
        if (Build.VERSION.SDK_INT < 11)
            AnimatorProxy.wrap(view).setRotation(rotation);
        else
            view.setRotation(rotation);
    
    }
    
    public static void setRotationX(View view, float rotationX) {
    
        if (Build.VERSION.SDK_INT < 11)
            AnimatorProxy.wrap(view).setRotationX(rotationX);
        else
            view.setRotationX(rotationX);
    
    }
    
    public static void setRotationY(View view, float rotationY) {
    
        if (Build.VERSION.SDK_INT < 11)
            AnimatorProxy.wrap(view).setRotationY(rotationY);
        else
            view.setRotationY(rotationY);
    
    }
    
    public static void setScaleX(View view, float scaleX) {
    
        if (Build.VERSION.SDK_INT < 11)
            AnimatorProxy.wrap(view).setScaleX(scaleX);
        else
            view.setScaleX(scaleX);
    
    }
    
    public static void setScaleY(View view, float scaleY) {
    
        if (Build.VERSION.SDK_INT < 11)
            AnimatorProxy.wrap(view).setScaleY(scaleY);
        else
            view.setScaleY(scaleY);
    
    }
    
    public static void setScrollX(View view, int scrollX) {
    
        if (Build.VERSION.SDK_INT < 14)
            AnimatorProxy.wrap(view).setScrollX(scrollX);
        else
            view.setScrollX(scrollX);
    
    }
    
    public static void setScrollY(View view, int scrollY) {
    
        if (Build.VERSION.SDK_INT < 14)
            AnimatorProxy.wrap(view).setScrollY(scrollY);
        else
            view.setScrollY(scrollY);
    
    }
    
    public static void setTranslationX(View view, float translationX) {
    
        if (Build.VERSION.SDK_INT < 11)
            AnimatorProxy.wrap(view).setTranslationX(translationX);
        else
            view.setTranslationX(translationX);
    
    }
    
    public static void setTranslationY(View view, float translationY) {
    
        if (Build.VERSION.SDK_INT < 11)
            AnimatorProxy.wrap(view).setTranslationY(translationY);
        else
            view.setTranslationY(translationY);
    
    }
    
    public static void setX(View view, float x) {
    
        if (Build.VERSION.SDK_INT < 11)
            AnimatorProxy.wrap(view).setX(x);
        else
            view.setX(x);
    
    }
    
    public static void setY(View view, float y) {
    
        if (Build.VERSION.SDK_INT < 11)
            AnimatorProxy.wrap(view).setY(y);
        else
            view.setX(y);
    
    }

}