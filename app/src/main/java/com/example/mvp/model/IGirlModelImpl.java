package com.example.mvp.model;

import com.example.jett.mvp.model.IGirlModel;
import com.example.mvp.R;
import com.example.mvp.bean.Girl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jett on 2018/6/4.
 */

public class IGirlModelImpl implements IGirlModel{
    @Override
    public void loadGirl(IGirlModel.GirlOnLoadListener girlOnLoadListener) {
        List<Girl> data = new ArrayList<Girl>();
        data.add(new Girl("http://pic3.16pic.com/00/16/45/16pic_1645919_b.jpg", "*****", "123潮流女个性字母印花无袖露脐上衣"));
        data.add(new Girl("http://pic33.photophoto.cn/20141111/0005018398216909_b.jpg", "231412星", "迷依诗诺夏天新款韩版女装性感夜店欧美风字母印花牛仔露脐背心上衣"));
        data.add(new Girl("http://pic31.nipic.com/20130729/8952533_180901746000_2.jpg", "5颗星", "迷依诗诺春夏欧美新款性感女装单排扣牛仔背心露脐上衣"));
        data.add(new Girl("http://pic12.photophoto.cn/20090911/0036036808900539_b.jpg", "5颗星", "美莉丹 新款欧美单排扣牛仔背心露脐上衣"));
        data.add(new Girl("http://pic3.16pic.com/00/16/45/16pic_1645919_b.jpg", "5颗星", "夏季新款韩版时尚个性字母无袖露脐上衣"));
        data.add(new Girl("http://imgsrc.baidu.com/imgad/pic/item/f2deb48f8c5494ee4f79f13a27f5e0fe99257ebe.jpg", "5颗星", "新款欧美单排扣牛仔背心露脐上衣"));
        data.add(new Girl("http://pic3.16pic.com/00/16/45/16pic_1645919_b.jpg", "5颗星", "夏装新款下摆波浪边挂脖露肩"));
        data.add(new Girl("http://pic3.16pic.com/00/16/45/16pic_1645919_b.jpg", "五颗星", "夏天新款欧美时尚潮流休闲百"));
        data.add(new Girl("http://imgsrc.baidu.com/imgad/pic/item/f2deb48f8c5494ee4f79f13a27f5e0fe99257ebe.jpg", "5颗星", "迷依诗诺夏季新款小香风甜美性感夜"));
        data.add(new Girl("http://pic3.16pic.com/00/16/45/16pic_1645919_b.jpg", "5颗星", "安巴克夏季新款韩版时尚套"));
        girlOnLoadListener.onComplete(data);
    }
}
