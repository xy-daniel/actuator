package org.javaboy.actuator.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * info自定义配置---->代码的有限即要高于application的配置
 */
@Component
public class DDGInfo implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        Map<String, Object> map = new HashMap<>();
        map.put("email", "1207350458@qq.com");
        builder.withDetail("author", map);
    }
}
