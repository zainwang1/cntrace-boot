/**
 * CCopyright © 2016-2025 中国追溯链-一带一路 All rights reserved.
 *
 * 中国追溯链.com
 *
 * 版权所有，侵权必究！
 */

package io.cntrace.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;

import io.cntrace.modules.sys.entity.SysRoleMenuEntity;

import java.util.List;


/**
 * 角色与菜单对应关系
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysRoleMenuService extends IService<SysRoleMenuEntity> {
	
	void saveOrUpdate(Long roleId, List<Long> menuIdList);
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
	
}
