package com.tallon;

import com.tallon.utils.OkHttpClientUtil;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * OkHttp测试
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-29 23:04
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OkHttp3Test {


    @Test
    public void testGet() {
        String url = "https://t.cn";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url).build();
        Call call = client.newCall(request);
        try {
            Response response = call.execute();
            System.out.println(response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUtilGet() {

        String url = "";
        Response data = OkHttpClientUtil.getInstance().getData(url);
        System.out.println(Objects.requireNonNull(data.body()).toString());

    }

    @Test
    public void testUtilPost() {
        String url = "";
        Map<String, String> params = new HashMap<>();

        Response response = OkHttpClientUtil.getInstance().postData(url, params);
        System.out.println(Objects.requireNonNull(response.body()).toString());
    }
}
