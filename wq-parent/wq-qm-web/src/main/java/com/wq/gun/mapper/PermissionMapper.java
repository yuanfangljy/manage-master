package com.wq.gun.mapper;

import com.wq.common.entity.PermissionVO;
import com.wq.gun.model.Permission;
import com.wq.gun.model.PermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper {
    long countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionExample example);

    Permission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    /**
     * 查找所有权限数据
     * @return
     */
    List<Permission> findAll();

    /**
     * 查找所有子节点
     * @param pid
     * @return
     */
    List<Permission> findChildPerm(int pid);

    /**
     * 查询权限树列表
     * @return
     */
    List<PermissionVO> findPerms();

    /**
     * 根据角色id获取权限数据
     * @param roleId
     * @return
     */
    List<Permission> findPermsByRole(Integer roleId);

    List<PermissionVO> getUserPerms(Integer userId);
}