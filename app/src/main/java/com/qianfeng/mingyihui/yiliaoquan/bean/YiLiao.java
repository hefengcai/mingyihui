package com.qianfeng.mingyihui.yiliaoquan.bean;

import java.util.List;

/**
 * Created by HeFengCai
 * 2016/2/24.
 */
public class YiLiao {

    /**
     * status : 200
     * message : 请求成功
     * body : {"items":[{"id":1,"name":"妇儿热聊","title":"妇科交流区与广大患者交流治疗心得","image":"http://219.232.241.117/M00/01/24/2-jxdVRgK7HypqE6AAAr-lxzw_o752.png","messageNum":489},{"id":2,"name":"粉红丝带","title":"关爱乳房、关爱健康，乳腺科常见病防护、保健等内容，关注乳腺健康朋友的在线交流平台","image":"http://219.232.241.117/M00/01/2B/2-jxdVRpY1SAHNaNAAAe0zr8jLo903.png","messageNum":170},{"id":3,"name":"中医养生","title":"中医养生保健爱好者在线交流","image":"http://219.232.241.117/M00/01/2B/2-jxdVRpZFjyAwL8AAAhieNN8yk056.png","messageNum":167},{"id":4,"name":"美小护服务圈","title":"为用户解决医院出诊挂号、食宿行等信息","image":"http://219.232.241.117/M00/01/24/2-jxdVRgK_mTR5EBAAA4LLD_rNY047.png","messageNum":109}]}
     * timestamp : 1456289188889
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
         * name : 妇儿热聊
         * title : 妇科交流区与广大患者交流治疗心得
         * image : http://219.232.241.117/M00/01/24/2-jxdVRgK7HypqE6AAAr-lxzw_o752.png
         * messageNum : 489
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
            private String name;
            private String title;
            private String image;
            private int messageNum;

            public void setId(int id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setMessageNum(int messageNum) {
                this.messageNum = messageNum;
            }

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public String getTitle() {
                return title;
            }

            public String getImage() {
                return image;
            }

            public int getMessageNum() {
                return messageNum;
            }
        }
    }
}
