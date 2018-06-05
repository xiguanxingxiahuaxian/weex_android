package com.sutdy.work.weex_20180601.application;

import com.sutdy.work.weex_20180601.ImageAdapter;
import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

/**
 * 项目名称：weex_20180601
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/6/1 16:11
 * 修改备注
 */
public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //init weex and constru application
        initView();
    }
    private void initView() {
        // init code
        InitConfig initConfig = new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
        WXSDKEngine.initialize(this,initConfig);
    }
}
