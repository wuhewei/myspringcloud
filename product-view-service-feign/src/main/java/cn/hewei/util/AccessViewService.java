package cn.hewei.util;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.http.HttpUtil;

/**
 * Created by hewei on 2019/11/10.
 */
public class AccessViewService {
    public static void main(String[] args) {
        while (true) {
            ThreadUtil.sleep(1000);
            access(8010);
            access(8011);
        }
    }

    public static void access(int port) {
        try {
            String html = HttpUtil.get(String.format("http://localhost:%d/products", port));
            System.out.println("html length: " + html.length());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
