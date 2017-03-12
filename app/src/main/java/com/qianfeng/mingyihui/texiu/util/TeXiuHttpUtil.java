package com.qianfeng.mingyihui.texiu.util;

import com.qianfeng.mingyihui.other.utils.MingYiHuiHttpUtil;
import com.qianfeng.mingyihui.other.utils.MingYiHuiTask;

/**
 * 特需模块的请求都在这里
 * Created by HeFengCai
 * 2016/2/20.
 *
 */
public class TeXiuHttpUtil {
    /**
     * 广告请求的url
     */
    public static final String URL_TEXIU_AD="http://219.232.241.119:8066/myh/adv/page?pageNum=0&pageSize=20";
    /**
     * 问诊请求的url
     */
    public static final String URL_TEXIU_WENZHEN="http://219.232.241.119:8066/myh/privDoctor/page?pageNum=0&pageSize=20&depId=1&sort=0&docType=1";

    /**
     * 陪诊请求的url
     */
    public static final String URL_TEXIU_PEIZHEN="http://219.232.241.119:8066/myh/chaper/getResource";
    /**
     * 出诊请求的url
     */
    public static final String URL_TEXIU_CHUZHEN="http://219.232.241.119:8066/myh/privDoctor/page?pageNum=0&pageSize=20&docType=3";
    /**
     * 义诊请求的url
     */
    public static final String URL_TEXIU_YIZHEN="http://219.232.241.119:8066/myh/privDoctor/page?pageNum=0&pageSize=20&depId=1&sort=0&docType=2";

    public static void requestAd(final String url,MingYiHuiTask.RequestCallback callback){
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
