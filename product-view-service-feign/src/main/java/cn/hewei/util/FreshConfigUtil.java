package cn.hewei.util;

import cn.hutool.http.HttpUtil;

import java.util.HashMap;

/**
 * Created by hewei on 2019/11/9.
 */
public class FreshConfigUtil {
    public static void main(String[] args) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json; charset=utf-8");
        System.out.println("刷新中...");
        String result = HttpUtil.createPost("http://localhost:8010/actuator/bus-refresh").addHeaders(headers).execute().body();
        System.out.println("结果：" + result);
        System.out.println("刷新完成");
    }
}
