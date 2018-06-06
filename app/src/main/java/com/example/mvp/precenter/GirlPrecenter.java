package com.example.mvp.precenter;

import com.example.jett.mvp.model.IGirlModel;
import com.example.mvp.bean.Girl;
import com.example.mvp.model.IGirlModelImpl;
import com.example.mvp.view.IGirlView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * 所有的业务逻辑都在表示层完成
 */

public class GirlPrecenter<T extends IGirlView> {
    /**
     * 1.view层的引用
     */
    WeakReference<T> mView;
    /**
     * 2.model层的引用
     */
    IGirlModel iGirlModel=new IGirlModelImpl();

    public GirlPrecenter(T view){
        this.mView=new WeakReference<T>(view);
    }

    /**
     * 3.执行UI逻辑操作
     */
    public void fetch(){
        if(mView.get()!=null && iGirlModel!=null){
            iGirlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                @Override
                public void onComplete(List<Girl> list) {
                    mView.get().showGirls(list);
                }
            });
        }
    }
}








