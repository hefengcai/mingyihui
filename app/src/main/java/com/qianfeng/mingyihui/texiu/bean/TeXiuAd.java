package com.qianfeng.mingyihui.texiu.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/2/20.
 */
public class TeXiuAd {

    /**
     * status : 200
     * message : 请求成功
     * body : {"pageSize":20,"pageNum":1,"totalCount":3,"totalPage":1,"list":[{"id":31,"redirect":"http://mp.weixin.qq.com/s?__biz=MjM5MDUyMDE2MQ==&mid=401085497&idx=1&sn=ec43fb2b72bd0c4d21b0d326a20ef21c#rd","inset":null,"content":"无","img":"http://219.232.241.117/M00/01/C1/2-jxdVaBegfwDrXJAAHbbXYxyhA863.png","iosImg":"http://219.232.241.117/M00/01/C1/2-jxdVaBegeAFHBqAAOwJ2Ijo0I934.png","beginTime":1451232000000,"endTime":1482854400000,"origin":2,"onTop":10,"online":1,"title":"尿失禁&mdash;&mdash;您遇到的&ldquo;尴尬&rdquo;事儿","updateTimestamp":1451297738000,"createtime":null},{"id":25,"redirect":"http://mp.weixin.qq.com/s?__biz=MjM5MDUyMDE2MQ==&mid=209711677&idx=1&sn=adf516f50918638e719c178a2ad7712a#rd","inset":null,"content":"无","img":"http://219.232.241.117/M00/01/B7/2-jxdVXLMIKi2Mg9AAKPTu4RGXY149.png","iosImg":"http://219.232.241.117/M00/01/B7/2-jxdVXLMIKh2qVOAAMUyurpZGI509.png","beginTime":1439308800000,"endTime":1469721600000,"origin":2,"onTop":5,"online":1,"title":"朱大夫分享《牙齿与健康》同期还抽取680元洗牙套餐大奖！","updateTimestamp":1444808514000,"createtime":1437018100000},{"id":23,"redirect":"http://mp.weixin.qq.com/s?__biz=MjM5MDUyMDE2MQ==&mid=209514163&idx=1&sn=059eba6e199e21e0bb6bdcf4a53b7f35#rd","inset":null,"content":"无","img":"http://219.232.241.117/M00/01/B6/2-jxdVW4-4eh-94gAAFdnEDi4-Y699.png","iosImg":"http://219.232.241.117/M00/01/B6/2-jxdVW4-4iRXuz4AAGR966fx8U297.png","beginTime":1435680000000,"endTime":1469721600000,"origin":2,"onTop":3,"online":1,"title":"王殊教授解密乳腺增生不是病！","updateTimestamp":1439798997000,"createtime":null}]}
     * timestamp : 1455928919433
     * exception : null
     */

    private int status;
    private String message;
    /**
     * pageSize : 20
     * pageNum : 1
     * totalCount : 3
     * totalPage : 1
     * list : [{"id":31,"redirect":"http://mp.weixin.qq.com/s?__biz=MjM5MDUyMDE2MQ==&mid=401085497&idx=1&sn=ec43fb2b72bd0c4d21b0d326a20ef21c#rd","inset":null,"content":"无","img":"http://219.232.241.117/M00/01/C1/2-jxdVaBegfwDrXJAAHbbXYxyhA863.png","iosImg":"http://219.232.241.117/M00/01/C1/2-jxdVaBegeAFHBqAAOwJ2Ijo0I934.png","beginTime":1451232000000,"endTime":1482854400000,"origin":2,"onTop":10,"online":1,"title":"尿失禁&mdash;&mdash;您遇到的&ldquo;尴尬&rdquo;事儿","updateTimestamp":1451297738000,"createtime":null},{"id":25,"redirect":"http://mp.weixin.qq.com/s?__biz=MjM5MDUyMDE2MQ==&mid=209711677&idx=1&sn=adf516f50918638e719c178a2ad7712a#rd","inset":null,"content":"无","img":"http://219.232.241.117/M00/01/B7/2-jxdVXLMIKi2Mg9AAKPTu4RGXY149.png","iosImg":"http://219.232.241.117/M00/01/B7/2-jxdVXLMIKh2qVOAAMUyurpZGI509.png","beginTime":1439308800000,"endTime":1469721600000,"origin":2,"onTop":5,"online":1,"title":"朱大夫分享《牙齿与健康》同期还抽取680元洗牙套餐大奖！","updateTimestamp":1444808514000,"createtime":1437018100000},{"id":23,"redirect":"http://mp.weixin.qq.com/s?__biz=MjM5MDUyMDE2MQ==&mid=209514163&idx=1&sn=059eba6e199e21e0bb6bdcf4a53b7f35#rd","inset":null,"content":"无","img":"http://219.232.241.117/M00/01/B6/2-jxdVW4-4eh-94gAAFdnEDi4-Y699.png","iosImg":"http://219.232.241.117/M00/01/B6/2-jxdVW4-4iRXuz4AAGR966fx8U297.png","beginTime":1435680000000,"endTime":1469721600000,"origin":2,"onTop":3,"online":1,"title":"王殊教授解密乳腺增生不是病！","updateTimestamp":1439798997000,"createtime":null}]
     */

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
        private int pageSize;
        private int pageNum;
        private int totalCount;
        private int totalPage;
        /**
         * id : 31
         * redirect : http://mp.weixin.qq.com/s?__biz=MjM5MDUyMDE2MQ==&mid=401085497&idx=1&sn=ec43fb2b72bd0c4d21b0d326a20ef21c#rd
         * inset : null
         * content : 无
         * img : http://219.232.241.117/M00/01/C1/2-jxdVaBegfwDrXJAAHbbXYxyhA863.png
         * iosImg : http://219.232.241.117/M00/01/C1/2-jxdVaBegeAFHBqAAOwJ2Ijo0I934.png
         * beginTime : 1451232000000
         * endTime : 1482854400000
         * origin : 2
         * onTop : 10
         * online : 1
         * title : 尿失禁&mdash;&mdash;您遇到的&ldquo;尴尬&rdquo;事儿
         * updateTimestamp : 1451297738000
         * createtime : null
         */

        private List<ListEntity> list;

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public void setList(List<ListEntity> list) {
            this.list = list;
        }

        public int getPageSize() {
            return pageSize;
        }

        public int getPageNum() {
            return pageNum;
        }

        public int getTotalCount() {
            return totalCount;
        }

        public int getTotalPage() {
            return totalPage;
        }

        public List<ListEntity> getList() {
            return list;
        }

        public static class ListEntity {
            private int id;
            private String redirect;
            private Object inset;
            private String content;
            private String img;
            private String iosImg;
            private long beginTime;
            private long endTime;
            private int origin;
            private int onTop;
            private int online;
            private String title;
            private long updateTimestamp;
            private Object createtime;

            public void setId(int id) {
                this.id = id;
            }

            public void setRedirect(String redirect) {
                this.redirect = redirect;
            }

            public void setInset(Object inset) {
                this.inset = inset;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public void setIosImg(String iosImg) {
                this.iosImg = iosImg;
            }

            public void setBeginTime(long beginTime) {
                this.beginTime = beginTime;
            }

            public void setEndTime(long endTime) {
                this.endTime = endTime;
            }

            public void setOrigin(int origin) {
                this.origin = origin;
            }

            public void setOnTop(int onTop) {
                this.onTop = onTop;
            }

            public void setOnline(int online) {
                this.online = online;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setUpdateTimestamp(long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
            }

            public void setCreatetime(Object createtime) {
                this.createtime = createtime;
            }

            public int getId() {
                return id;
            }

            public String getRedirect() {
                return redirect;
            }

            public Object getInset() {
                return inset;
            }

            public String getContent() {
                return content;
            }

            public String getImg() {
                return img;
            }

            public String getIosImg() {
                return iosImg;
            }

            public long getBeginTime() {
                return beginTime;
            }

            public long getEndTime() {
                return endTime;
            }

            public int getOrigin() {
                return origin;
            }

            public int getOnTop() {
                return onTop;
            }

            public int getOnline() {
                return online;
            }

            public String getTitle() {
                return title;
            }

            public long getUpdateTimestamp() {
                return updateTimestamp;
            }

            public Object getCreatetime() {
                return createtime;
            }
        }
    }
}
