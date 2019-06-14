一直觉得java在Json解析上不够优雅，不够简洁。传统的JSONObject的解析，真的，解析个东西简直要疯掉。
后面出了个FastJson跟Gson，虽然很好用，但是有时候也是很烦，
比如：我要解析一个很深沉的字符串。其他字符串我不要。
![](https://upload-images.jianshu.io/upload_images/6835615-c1c28b964877e6df.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
如上图：我要解析title里面的文字，其他不需要，【当然里，只需要一个一个字段，其他不需要 这种需求是真的少见】
如果我们使用FastJson跟Gson第一步肯定要先建一个类，然后json转化成实体类
然后取的时候还要一直get ,取名字取短的话还好，要是名字很长，看起来真心难受。
~~~
bean.getBody().getData().get(0).getTitle()
~~~
这种情况下，我们就需要用到一个简洁的解析   如：
~~~
 String title = JsonUtils.parse(json,String.class,"body","data",0,"title");
~~~
使用这种方式的话，我们不需要创建类，也不担心你json串是否符合你要的字段，哪层字段没有，就直接返回 “”，
$\color{red}{支持常用类型，跟实体类类型}$

当然咯，转换实体类还是非常还好用的，我们要转换某层下面的实体类也非常方便，只需要改第二个参数为实体类类型就即可，下面给一个全部的实例：
~~~
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
~~~
### 使用gradle添加依赖
~~~
compile 'com.yanxuwen:json:1.0.0'
~~~
### 使用pom添加依赖
~~~
<dependency>
	<groupId>com.yanxuwen</groupId>
	<artifactId>json</artifactId>
	<version>1.0.0</version>
</dependency>
~~~

### 博客地址  [点击跳转](https://www.jianshu.com/p/95946a15cae1)
### 如果你喜欢就去 github 帮我star下,非常感谢o(∩_∩)o~~~