package com.taylor.api.shop.service;

import com.taylor.api.shop.entity.ShopUser;

/**
 * @notes:用户信息表Service接口
 *
 * @author taylor
 *
 * @date 2016-04-18 00:52:13 Email:516195940@qq.com
 */
public interface ShopUserService extends BaseService<ShopUser> {

    /**
     * @desc countShopUsers(查询用户数量)
     * @author taylor
     * @date 2016年4月18日 上午1:13:04
     */
    public Integer countShopUsers();

    /**
     * @desc queryShopUser(查询用户)
     * @author taylor
     * @date 2016年4月19日 上午12:14:05
     */
    public ShopUser queryShopUser(ShopUser shopUser);

}
