package com.wq.gun.service;


import com.wq.common.entity.PermissionVO;
import com.wq.common.entity.RoleVO;
import com.wq.gun.model.Permission;
import com.wq.gun.model.Role;

import java.util.List;

/**
 * @项目名称：
 * @类名称：AuthService
 * @类描述：授权方法
 * @创建人：liujiayi
 * @创建时间：2018/9/18 14:56
 * @修改时间：2018/9/18 14:56
 * @version：1.0
 */
public interface AuthService {
    int addPermission(Permission permission);

    List<Permission> permList();

    int updatePerm(Permission permission);

    Permission getPermission(int id);

    String delPermission(int id);

    /**
     * 查询所有角色
     * @return
     */
    List<Role> roleList();

    /**
     * 关联查询权限树列表
     * @return
     */
    List<PermissionVO> findPerms();

    /**
     * 添加角色
     * @param role
     * @param permIds
     * @return
     */
    String addRole(Role role, String permIds);

    RoleVO findRoleAndPerms(Integer id);

    /**
     * 更新角色并授权
     * @param role
     * @param permIds
     * @return
     */
    String updateRole(Role role, String permIds);

    /**
     * 删除角色以及它对应的权限
     * @param id
     * @return
     */
    String delRole(int id);

    /**
     * 查找所有角色
     * @return
     */
    List<Role> getRoles();

    /**
     * 根据用户获取角色列表
     * @param userId
     * @return
     */
    List<Role> getRoleByUser(Integer userId);

    /**
     * 根据角色id获取权限数据
     * @param id
     * @return
     */
    List<Permission> findPermsByRoleId(Integer id);

    /**
     * 根据用户id获取权限数据
     * @param id
     * @return
     */
    List<PermissionVO> getUserPerms(Integer id);
}