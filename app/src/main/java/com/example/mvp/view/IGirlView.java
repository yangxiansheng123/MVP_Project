package com.example.mvp.view;

import com.example.mvp.bean.Girl;

import java.util.List;

/**
 * 所有的UI逻辑
 */
public interface IGirlView {
    /**
     * 显示listView中的数据(用回调)
     */
    void showGirls(List<Girl> girls);
}









