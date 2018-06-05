package com.sutdy.work.weex_20180601.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.Group;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.GridView;

import com.sutdy.work.weex_20180601.R;
import com.taobao.weex.IWXRenderListener;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：weex_20180601
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/6/1 17:09
 * 修改备注
 */
public class netWorkActivity extends AppCompatActivity implements IWXRenderListener {
    private FrameLayout container;
    private WXSDKInstance wxsdkInstance;
    private static String TEST_URL = "http://dotwe.org/raw/dist/6fe11640e8d25f2f98176e9643c08687.bundle.js";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.network_layout);
        initView();
    }

    private void initView() {
        //get WXIntance
        wxsdkInstance = new WXSDKInstance(this);
        wxsdkInstance.registerRenderListener(this);
        container = (FrameLayout) findViewById(R.id.container);
        Map<String, Object> opions = new HashMap<>();
        opions.put(WXSDKInstance.BUNDLE_URL, TEST_URL);
        wxsdkInstance.renderByUrl("page"
                , TEST_URL, opions, null, 100, 100, WXRenderStrategy.APPEND_ONCE);
    }

    @Override
    public void onViewCreated(WXSDKInstance instance, View view) {
        if(view.getParent()!=null){
            ((GridView)container.getParent()).removeView(view);
        }
        container.addView(view);
    }

    @Override
    public void onRenderSuccess(WXSDKInstance instance, int width, int height) {

    }

    @Override
    public void onRefreshSuccess(WXSDKInstance instance, int width, int height) {

    }

    @Override
    public void onException(WXSDKInstance instance, String errCode, String msg) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        wxsdkInstance.onActivityStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        wxsdkInstance.onActivityResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        wxsdkInstance.onActivityPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        wxsdkInstance.onActivityStop();
    }

}
