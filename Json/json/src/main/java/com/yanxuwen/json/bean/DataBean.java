package com.yanxuwen.json.bean;

import java.util.List;

public class DataBean {
    /**
     * image : http://ztjy-img-dev.szytest.com/ztnew/ad/img/2018/09/28/1538124681903616.png
     * number : 1
     * titleType : 0
     * imgWidth : 74
     * isMainPush : 0
     * isMore : 1
     * imgHeight : 71
     * id : 47
     * type : 2
     * title : 回归版块测试
     * contentList : [{"image":"http://ztjy-img-dev.szytest.com/ztnew/ad/img/2019/01/16/1547630094383987.png","pvvv":0,"mediaTotal":0,"contentId":"1017","isMainPush":0,"beginTime":1547630051000,"title":"小五新增专题001","contentType":26,"desc":""}]
     */

    private String image;
    private int number;
    private int titleType;
    private int imgWidth;
    private int isMainPush;
    private int isMore;
    private int imgHeight;
    private int id;
    private int type;
    private String title;
    private List<ContentListBean> contentList;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public int getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(int imgWidth) {
        this.imgWidth = imgWidth;
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

    public int getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(int imgHeight) {
        this.imgHeight = imgHeight;
    }

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

    public List<ContentListBean> getContentList() {
        return contentList;
    }

    public void setContentList(List<ContentListBean> contentList) {
        this.contentList = contentList;
    }

    public static class ContentListBean {
        /**
         * image : http://ztjy-img-dev.szytest.com/ztnew/ad/img/2019/01/16/1547630094383987.png
         * pvvv : 0
         * mediaTotal : 0
         * contentId : 1017
         * isMainPush : 0
         * beginTime : 1547630051000
         * title : 小五新增专题001
         * contentType : 26
         * desc :
         */

        private String image;
        private int pvvv;
        private int mediaTotal;
        private String contentId;
        private int isMainPush;
        private long beginTime;
        private String title;
        private int contentType;
        private String desc;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
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

        public String getContentId() {
            return contentId;
        }

        public void setContentId(String contentId) {
            this.contentId = contentId;
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

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getContentType() {
            return contentType;
        }

        public void setContentType(int contentType) {
            this.contentType = contentType;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
}
