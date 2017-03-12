package com.qianfeng.mingyihui.texiu.bean;

import java.util.List;

/**
 * Created by HeFengCai
 * 2016/2/23.
 */
public class PeiZhen {

    /**
     * status : 200
     * message : 请求成功
     * body : {"items":[{"id":1,"title":"全程陪诊","price":200,"oldPrice":480,"content":"1.诊前提醒：陪诊助理诊前电话沟通，嘱咐整理就诊资料及接洽等相关事宜.\r\n2.医院代办：助理代用户办理取号、排队、缴费、取检查单及取药等.\r\n3.全程陪护：陪诊范围限就诊医院内全程就医陪伴及流程建议等.\r\n4.陪护时长：指定某一医院全程陪诊时长≤4小时.\r\n5.建档服务：免费为用户注册为会员即享受免费建档服务（永久性电子病历）.\r\n6.增值服务：专科义诊中免费咨询与免费健康跟踪及随访等服务.\r\n7.后续服务：一个月内代取报告、代邮取药品等后续服务.\r\n8.免费活动：参加线下健康娱乐活动及免费体验健康产品.","iosImage":"http://219.232.241.117/M00/01/52/2-jxdVUL0kzzmOlBAAFTR3ZNp04407.png","androidImage":";http://219.232.241.117/M00/01/52/2-jxdVULyVyxIUTPAAZzrPyB8yk437.png"},{"id":3,"title":"专车陪诊","price":300,"oldPrice":680,"content":"1.专车服务：安排专车及司机单趟接送服务（接去医院或接送回家/驻地）一次.\r\n2.安全保障：车辆接送≤3人（含油驾险保险事宜）全程服务.\r\n3.车辆里程：仅限北京城区间接送服务及总30公里内路程，超出另计费用.\r\n4.诊前提醒：陪诊助理诊前电话沟通，嘱咐患者就诊及接洽时间地点等事宜.\r\n5.全程陪诊：助理院内全程陪伴用户导医导诊过程及院内医疗建议等.\r\n6.建档服务：免费为用户注册为会员且享受建档服务（电子病历免费调用）.\r\n7.增值服务：专科义诊中免费咨询与免费健康跟踪及随访等服务.\r\n8.后续服务：一个月内代取报告、代邮取药品等后续服务.\r\n9.免费活动：参加线下健康娱乐活动及免费体验健康产品.","iosImage":"http://219.232.241.117/M00/01/52/2-jxdVUL0vHwzo3AAAFD5c5B2Tk134.png","androidImage":";http://219.232.241.117/M00/01/52/2-jxdVULzISz402RAAdnM1CDXrA816.png"}]}
     * timestamp : 1456190776038
     * exception : null
     */

    private int status;
    private String message;
    private BodyEntity body;
    private long timestamp;
    private Object exception;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setBody(BodyEntity body) {
        this.body = body;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setException(Object exception) {
        this.exception = exception;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public BodyEntity getBody() {
        return body;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public Object getException() {
        return exception;
    }

    public static class BodyEntity {
        /**
         * id : 1
         * title : 全程陪诊
         * price : 200.0
         * oldPrice : 480.0
         * content : 1.诊前提醒：陪诊助理诊前电话沟通，嘱咐整理就诊资料及接洽等相关事宜.
         2.医院代办：助理代用户办理取号、排队、缴费、取检查单及取药等.
         3.全程陪护：陪诊范围限就诊医院内全程就医陪伴及流程建议等.
         4.陪护时长：指定某一医院全程陪诊时长≤4小时.
         5.建档服务：免费为用户注册为会员即享受免费建档服务（永久性电子病历）.
         6.增值服务：专科义诊中免费咨询与免费健康跟踪及随访等服务.
         7.后续服务：一个月内代取报告、代邮取药品等后续服务.
         8.免费活动：参加线下健康娱乐活动及免费体验健康产品.
         * iosImage : http://219.232.241.117/M00/01/52/2-jxdVUL0kzzmOlBAAFTR3ZNp04407.png
         * androidImage : ;http://219.232.241.117/M00/01/52/2-jxdVULyVyxIUTPAAZzrPyB8yk437.png
         */

        private List<ItemsEntity> items;

        public void setItems(List<ItemsEntity> items) {
            this.items = items;
        }

        public List<ItemsEntity> getItems() {
            return items;
        }

        public static class ItemsEntity {
            private int id;
            private String title;
            private double price;
            private double oldPrice;
            private String content;
            private String iosImage;
            private String androidImage;

            public void setId(int id) {
                this.id = id;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public void setOldPrice(double oldPrice) {
                this.oldPrice = oldPrice;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public void setIosImage(String iosImage) {
                this.iosImage = iosImage;
            }

            public void setAndroidImage(String androidImage) {
                this.androidImage = androidImage;
            }

            public int getId() {
                return id;
            }

            public String getTitle() {
                return title;
            }

            public double getPrice() {
                return price;
            }

            public double getOldPrice() {
                return oldPrice;
            }

            public String getContent() {
                return content;
            }

            public String getIosImage() {
                return iosImage;
            }

            public String getAndroidImage() {
                return androidImage;
            }
        }
    }
}
