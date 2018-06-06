package com.example.jett.mvp.model;


import com.example.mvp.bean.Girl;

import java.util.List;

/**
 * model还是原来的model
 */
public interface IGirlModel {
    /**
     * 也通过回调的方式返回数据
     * @param girlOnLoadListener
     */
    void loadGirl(GirlOnLoadListener girlOnLoadListener);

    /**
     * 设置一个回调接口
     */
    interface GirlOnLoadListener{
        void onComplete(List<Girl> list);
    }
}
















