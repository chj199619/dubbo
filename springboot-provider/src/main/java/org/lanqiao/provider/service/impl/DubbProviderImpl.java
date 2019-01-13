package org.lanqiao.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.lanqiao.provider.service.DubboProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service //让其作为一个dubbo服务 进行发布 暴露给服务的消费者
@Component
public class DubbProviderImpl implements DubboProvider {
    @Autowired
    DubboProvider provider;
    @Override
    public String buyTicket() {
        return "12306 购票成功";
    }
}
