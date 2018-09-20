package com.wq.gun.mapper;


import com.wq.common.entity.RoleVO;
import com.wq.gun.model.Role;
import com.wq.gun.model.RoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);


    /**
     * 分页查询所有的角色列表
     * @return
     */
    List<Role> findList();

    /**
     * 获取角色相关的数据
     * @param id
     * @return
     */
    RoleVO findRoleAndPerms(Integer id);

    /**
     * 根据用户id获取角色数据
     * @param userId
     * @return
     */
    List<Role> getRoleByUserId(Integer userId);

    List<Role> getRoles();
}