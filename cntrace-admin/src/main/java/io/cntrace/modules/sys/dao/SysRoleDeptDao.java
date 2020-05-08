/**
 * CCopyright © 2016-2025 中国追溯链-一带一路 All rights reserved.
 *
 * 中国追溯链.com
 *
 * 版权所有，侵权必究！
 */

package io.cntrace.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import io.cntrace.modules.sys.entity.SysRoleDeptEntity;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色与部门对应关系
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface SysRoleDeptDao extends BaseMapper<SysRoleDeptEntity> {
	
	/**
	 * 根据角色ID，获取部门ID列表
	 */
	List<Long> queryDeptIdList(Long[] roleIds);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
