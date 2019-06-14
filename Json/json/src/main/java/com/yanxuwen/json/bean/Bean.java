package com.yanxuwen.json.bean;

import java.util.List;

public class Bean {
    /**
     * code : 10000
     * message : 成功
     * body : {"data":[{"id":47,"type":2,"title":"回归版块测试","image":"http://ztjy-img-dev.szytest.com/ztnew/ad/img/2018/09/28/1538124681903616.png","imgWidth":74,"imgHeight":71,"number":1,"titleType":0,"isMainPush":0,"isMore":1,"contentList":[{"contentType":26,"contentId":"1017","image":"http://ztjy-img-dev.szytest.com/ztnew/ad/img/2019/01/16/1547630094383987.png","title":"小五新增专题001","desc":"","isMainPush":0,"beginTime":1547630051000,"pvvv":0,"mediaTotal":0}]},{"id":42,"type":2,"title":"夏日游记","image":"http://ztjy-img-dev.szytest.com/ztnew/ad/img/2018/09/19/1537345740502918.gif","imgWidth":300,"imgHeight":300,"number":1,"titleType":0,"isMainPush":0,"isMore":1,"contentList":[]},{"id":35,"type":2,"title":"除了长得好看一无是处","image":"http://ztjy-img-dev.szytest.com/ztnew/ad/img/2018/09/18/1537243176763496.jpg","imgWidth":200,"imgHeight":200,"number":1,"titleType":0,"isMainPush":0,"isMore":0,"contentList":[]},{"id":55,"type":2,"title":"竖屏视频测试1","image":"http://ztjy-img-dev.szytest.com/ztnew/ad/img/2019/01/03/1546500035149021.png","imgWidth":698,"imgHeight":267,"number":1,"titleType":0,"isMainPush":0,"isMore":0,"contentList":[{"contentType":26,"contentId":"1018","image":"http://ztjy-img-dev.szytest.com/ztnew/ad/img/2019/01/03/1546501303819644.png","title":"竖屏视频专题1","desc":"","isMainPush":0,"beginTime":1546501295000,"pvvv":0,"mediaTotal":0}]}]}
     */

    private int code;
    private String message;
    private BodyBean body;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BodyBean getBody() {
        return body;
    }

    public void setBody(BodyBean body) {
        this.body = body;
    }

    public static class BodyBean {
        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * id : 47
             * type : 2
             * title : 回归版块测试
             * image : http://ztjy-img-dev.szytest.com/ztnew/ad/img/2018/09/28/1538124681903616.png
             * imgWidth : 74
             * imgHeight : 71
             * number : 1
             * titleType : 0
             * isMainPush : 0
             * isMore : 1
             * contentList : [{"contentType":26,"contentId":"1017","image":"http://ztjy-img-dev.szytest.com/ztnew/ad/img/2019/01/16/1547630094383987.png","title":"小五新增专题001","desc":"","isMainPush":0,"beginTime":1547630051000,"pvvv":0,"mediaTotal":0}]
             */

            private int id;
            private int type;
            private String title;
            private String image;
            private int imgWidth;
            private int imgHeight;
            private int number;
            private int titleType;
            private int isMainPush;
            private int isMore;
            private List<ContentListBean> contentList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getImgWidth() {
                return imgWidth;
            }

            public void setImgWidth(int imgWidth) {
                this.imgWidth = imgWidth;
            }

            public int getImgHeight() {
                return imgHeight;
            }

            public void setImgHeight(int imgHeight) {
                this.imgHeight = imgHeight;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public int getTitleType() {
                return titleType;
            }

            public void setTitleType(int titleType) {
                this.titleType = titleType;
            }

            public int getIsMainPush() {
                return isMainPush;
            }

            public void setIsMainPush(int isMainPush) {
                this.isMainPush = isMainPush;
            }

            public int getIsMore() {
                return isMore;
            }

            public void setIsMore(int isMore) {
                this.isMore = isMore;
            }

            public List<ContentListBean> getContentList() {
                return contentList;
            }

            public void setContentList(List<ContentListBean> contentList) {
                this.contentList = contentList;
            }

            public static class ContentListBean {
                /**
                 * contentType : 26
                 * contentId : 1017
                 * image : http://ztjy-img-dev.szytest.com/ztnew/ad/img/2019/01/16/1547630094383987.png
                 * title : 小五新增专题001
                 * desc :
                 * isMainPush : 0
                 * beginTime : 1547630051000
                 * pvvv : 0
                 * mediaTotal : 0
                 */

                private int contentType;
                private String contentId;
                private String image;
                private String title;
                private String desc;
                private int isMainPush;
                private long beginTime;
                private int pvvv;
                private int mediaTotal;

                public int getContentType() {
                    return contentType;
                }

                public void setContentType(int contentType) {
                    this.contentType = contentType;
                }

                public String getContentId() {
                    return contentId;
                }

                public void setContentId(String contentId) {
                    this.contentId = contentId;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public int getIsMainPush() {
                    return isMainPush;
                }

                public void setIsMainPush(int isMainPush) {
                    this.isMainPush = isMainPush;
                }

                public long getBeginTime() {
                    return beginTime;
                }

                public void setBeginTime(long beginTime) {
                    this.beginTime = beginTime;
                }

                public int getPvvv() {
                    return pvvv;
                }

                public void setPvvv(int pvvv) {
                    this.pvvv = pvvv;
                }

                public int getMediaTotal() {
                    return mediaTotal;
                }

                public void setMediaTotal(int mediaTotal) {
                    this.mediaTotal = mediaTotal;
                }
            }
        }
    }
}
