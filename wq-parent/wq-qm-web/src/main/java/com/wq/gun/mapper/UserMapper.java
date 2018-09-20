package com.wq.gun.mapper;

import com.wq.common.entity.UserRoleDTO;
import com.wq.common.entity.UserRolesVO;
import com.wq.common.entity.UserSearchDTO;
import com.wq.gun.model.User;
import com.wq.gun.model.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     *@Description:  功能描述（根据手机号查询用户信息）
     *@Author:       刘家义
     *@CreateDate:   2018/9/18 9:33
    */
    User selectUserByMobile(String mobile);


    /**
     * 分页查询用户数据
     * @return
     */
    List<UserRoleDTO> getUsers(@Param("userSearch") UserSearchDTO userSearch);

    /**
     * 删除用户
     * @param id
     * @param isDel
     * @return
     */
    int setDelUser(@Param("id") Integer id, @Param("isDel") Integer isDel,
                   @Param("insertUid") Integer insertUid);

    /**
     * 设置用户是否离职
     * @param id
     * @param isJob
     * @return
     */
    int setJobUser(@Param("id") Integer id, @Param("isJob") Integer isJob,
                   @Param("insertUid") Integer insertUid);

    /**
     * 查询用户及对应的角色
     * @param id
     * @return
     */
    UserRolesVO getUserAndRoles(Integer id);

    /**
     * 根据用户名和密码查找用户
     * @param username
     * @param password
     * @return
     */
    User findUser(@Param("username") String username,
                  @Param("password") String password);

    /**
     *	根据手机号获取用户数据
     * @param mobile
     * @return
     */
    User findUserByMobile(String mobile);

    /**
     * 根据用户名获取用户数据
     * @param username
     * @return
     */
    User findUserByName(String username);

    /**
     * 修改用户密码
     * @param id
     * @param password
     * @return
     */
    int updatePwd(@Param("id") Integer id, @Param("password") String password);
    /**
     * 是否锁定用户
     * @param id
     * @param isLock
     * @return
     */
    int setUserLockNum(@Param("id") Integer id, @Param("isLock") int isLock);
}