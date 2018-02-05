package com.ico.yk.mydemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author yangbo
 * @since 2018/2/5
 * @mail 903023560@qq.com
 */

public class LeftMenuFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.main_menu,null);
        return view;
    }

}
