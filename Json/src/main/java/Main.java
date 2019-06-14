import com.yanxuwen.json.JsonUtils;
import com.yanxuwen.json.bean.Bean;
import com.yanxuwen.json.bean.DataBean;

public class Main {

    public static void main(String[] args) {
        // 1、解析body -> data -> 0
        String data_0 = JsonUtils.parse(json,String.class,"body","data",0);
        System.out.println("data -> 0： " + data_0);

        // 2、解析body -> data -> 0 -> title
        String title = JsonUtils.parse(json,String.class,"body","data",0,"title");
        System.out.println("title： " + title);

        // 3、解析body -> data -> 0  转化为实体类
        DataBean data = JsonUtils.parse(json, DataBean.class,"body","data",0);
        //用DataBean去取title 看是否正确
        System.out.println("DataBean -> title： " + data.getTitle());

        // 4、直接将整串json转换为实体类
        Bean bean = JsonUtils.parse(json, Bean.class);
        //用Bean去取title 看是否正确
        System.out.println("Bean -> title： " + bean.getBody().getData().get(0).getTitle());

        // 5、实体类转换为json,用的是FastJson的用法
        String jsonStr = JsonUtils.toString(bean);
        System.out.println(jsonStr);
    }



    static String json = "{\n" +
            "\t\"code\": 10000,\n" +
            "\t\"message\": \"成功\",\n" +
            "\t\"body\": {\n" +
            "\t\t\"data\": [{\n" +
            "\t\t\t\"id\": 47,\n" +
            "\t\t\t\"type\": 2,\n" +
            "\t\t\t\"title\": \"回归版块测试\",\n" +
            "\t\t\t\"image\": \"http://ztjy-img-dev.szytest.com/ztnew/ad/img/2018/09/28/1538124681903616.png\",\n" +
            "\t\t\t\"imgWidth\": 74,\n" +
            "\t\t\t\"imgHeight\": 71,\n" +
            "\t\t\t\"number\": 1,\n" +
            "\t\t\t\"titleType\": 0,\n" +
            "\t\t\t\"isMainPush\": 0,\n" +
            "\t\t\t\"isMore\": 1,\n" +
            "\t\t\t\"contentList\": [{\n" +
            "\t\t\t\t\"contentType\": 26,\n" +
            "\t\t\t\t\"contentId\": \"1017\",\n" +
            "\t\t\t\t\"image\": \"http://ztjy-img-dev.szytest.com/ztnew/ad/img/2019/01/16/1547630094383987.png\",\n" +
            "\t\t\t\t\"title\": \"小五新增专题001\",\n" +
            "\t\t\t\t\"desc\": \"\",\n" +
            "\t\t\t\t\"isMainPush\": 0,\n" +
            "\t\t\t\t\"beginTime\": 1547630051000,\n" +
            "\t\t\t\t\"pvvv\": 0,\n" +
            "\t\t\t\t\"mediaTotal\": 0\n" +
            "\t\t\t}]\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": 42,\n" +
            "\t\t\t\"type\": 2,\n" +
            "\t\t\t\"title\": \"夏日游记\",\n" +
            "\t\t\t\"image\": \"http://ztjy-img-dev.szytest.com/ztnew/ad/img/2018/09/19/1537345740502918.gif\",\n" +
            "\t\t\t\"imgWidth\": 300,\n" +
            "\t\t\t\"imgHeight\": 300,\n" +
            "\t\t\t\"number\": 1,\n" +
            "\t\t\t\"titleType\": 0,\n" +
            "\t\t\t\"isMainPush\": 0,\n" +
            "\t\t\t\"isMore\": 1,\n" +
            "\t\t\t\"contentList\": []\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": 35,\n" +
            "\t\t\t\"type\": 2,\n" +
            "\t\t\t\"title\": \"除了长得好看一无是处\",\n" +
            "\t\t\t\"image\": \"http://ztjy-img-dev.szytest.com/ztnew/ad/img/2018/09/18/1537243176763496.jpg\",\n" +
            "\t\t\t\"imgWidth\": 200,\n" +
            "\t\t\t\"imgHeight\": 200,\n" +
            "\t\t\t\"number\": 1,\n" +
            "\t\t\t\"titleType\": 0,\n" +
            "\t\t\t\"isMainPush\": 0,\n" +
            "\t\t\t\"isMore\": 0,\n" +
            "\t\t\t\"contentList\": []\n" +
            "\t\t}, {\n" +
            "\t\t\t\"id\": 55,\n" +
            "\t\t\t\"type\": 2,\n" +
            "\t\t\t\"title\": \"竖屏视频测试1\",\n" +
            "\t\t\t\"image\": \"http://ztjy-img-dev.szytest.com/ztnew/ad/img/2019/01/03/1546500035149021.png\",\n" +
            "\t\t\t\"imgWidth\": 698,\n" +
            "\t\t\t\"imgHeight\": 267,\n" +
            "\t\t\t\"number\": 1,\n" +
            "\t\t\t\"titleType\": 0,\n" +
            "\t\t\t\"isMainPush\": 0,\n" +
            "\t\t\t\"isMore\": 0,\n" +
            "\t\t\t\"contentList\": [{\n" +
            "\t\t\t\t\"contentType\": 26,\n" +
            "\t\t\t\t\"contentId\": \"1018\",\n" +
            "\t\t\t\t\"image\": \"http://ztjy-img-dev.szytest.com/ztnew/ad/img/2019/01/03/1546501303819644.png\",\n" +
            "\t\t\t\t\"title\": \"竖屏视频专题1\",\n" +
            "\t\t\t\t\"desc\": \"\",\n" +
            "\t\t\t\t\"isMainPush\": 0,\n" +
            "\t\t\t\t\"beginTime\": 1546501295000,\n" +
            "\t\t\t\t\"pvvv\": 0,\n" +
            "\t\t\t\t\"mediaTotal\": 0\n" +
            "\t\t\t}]\n" +
            "\t\t}]\n" +
            "\t}\n" +
            "}";
}
