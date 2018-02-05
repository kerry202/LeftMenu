package com.ico.yk.mydemo;

/**
 * @author yangbo
 * @since 2018/2/5
 * @mail 903023560@qq.com
 */
public class AllInterface {

    public  interface OnMenuSlideListener{
        void onMenuSlide(float offset);
    }
    public  interface IUnlock{
        void onUnlock();
    }
    public  interface IUpdateLocation{
        void updateLocation(String totalTime, String totalDistance);
        void endLocation();
    }
}
