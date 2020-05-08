/**
 * CCopyright © 2016-2025 中国追溯链-一带一路 All rights reserved.
 *
 * 中国追溯链.com
 *
 * 版权所有，侵权必究！
 */

package io.cntrace.service;

import com.baomidou.mybatisplus.extension.service.IService;

import io.cntrace.entity.TokenEntity;

/**
 * 用户Token
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface TokenService extends IService<TokenEntity> {

	TokenEntity queryByToken(String token);

	/**
	 * 生成token
	 * @param userId  用户ID
	 * @return        返回token信息
	 */
	TokenEntity createToken(long userId);

	/**
	 * 设置token过期
	 * @param userId 用户ID
	 */
	void expireToken(long userId);

}
