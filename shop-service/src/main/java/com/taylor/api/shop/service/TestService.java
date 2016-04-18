package com.taylor.api.shop.service;

import com.taylor.api.shop.entity.Test;

/**
 * @ClassName: TestService
 * @Function: 测试接口.
 * @date: 2016年4月14日 上午12:53:32
 * @author Taylor
 */
public interface TestService extends BaseService<Test> {
    /**
     * @desc test(测试方法)
     * @author taylor
     * @date 2016年4月14日 上午12:53:53
     */
    public void test();

    /**
     * @desc getHello(测试)
     * @return
     * @author taylor
     * @date 2016年4月17日 下午7:32:07
     */
    public String getHello();
}
