package com.qianfeng.mingyihui.yiliaoquan.util;

import com.qianfeng.mingyihui.other.utils.MingYiHuiHttpUtil;
import com.qianfeng.mingyihui.other.utils.MingYiHuiTask;

/**
 * Created by HeFengCai
 * 2016/2/24.
 * 医疗圈模块的所有网络请求都在这里
 */
public class YiLiaoQuanHttpUtil {
    /**
     * 医疗圈的广告url
     */
    public static final String URL_YILIAOQUAN_AD="http://219.232.241.119:8066/myh/circle/findMedicalCircleAdv";

    /**
     * 推荐医疗圈的url
     */
    public static final String URL_YILIAOQUAN_YILIAO="http://219.232.241.119:8066/myh/circle/findMedicalCircleList";

    /**
     * 妇儿热聊url
     */
    public static final String URL_YILIAOQUAN_FUER="http://219.232.241.119:8066/myh/circle/pageCircleTitle?start=0&circleId=1&limit=20";
    /**
     * 粉红丝带url
     */
    public static final String URL_YILIAOQUAN_FENHONG="http://219.232.241.119:8066/myh/circle/pageCircleTitle?start=0&circleId=2&limit=20";
    /**
     * 中医养生url
     */
    public static final String URL_YILIAOQUAN_ZHONGYI="http://219.232.241.119:8066/myh/circle/pageCircleTitle?start=0&circleId=3&limit=20";
    /**
     * 美小护服务圈url
     */
    public static final String URL_YILIAOQUAN_MEIHU="http://219.232.241.119:8066/myh/circle/pageCircleTitle?start=0&circleId=4&limit=20";
    public static void getJsonString(final String url,MingYiHuiTask.RequestCallback callback){
        //创建一个请求
        MingYiHuiTask.Request request=new MingYiHuiTask.Request() {
            @Override
            public Object doRequest() {
                return MingYiHuiHttpUtil.doGet(url);
            }
        };
        //创建一个任务
        MingYiHuiTask task=new MingYiHuiTask(request,callback);
        //执行任务
        task.execute();
    }
}
