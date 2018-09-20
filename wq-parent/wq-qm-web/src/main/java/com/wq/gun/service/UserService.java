package com.wq.gun.service;


import com.wq.common.entity.UserDTO;
import com.wq.common.entity.UserRolesVO;
import com.wq.common.entity.UserSearchDTO;
import com.wq.common.util.PageDataResult;
import com.wq.gun.model.User;

/**
 * @项目名称：army_gun
 * @类名称：  UserService
 * @类描述：  用户接口类
 * @创建人：liujiayi
 * @创建时间：2018/9/18 9:00
 * @修改时间：2018/9/18 9:00
 * @version：1.0
 */
@SuppressWarnings("all")
public interface UserService {

    /**
     *@Description:  功能描述（根据手机号查询用户信息）
     *@Author:       刘家义
     *@CreateDate:   2018/9/18 9:02
    */
    public User findUserByMobile(String mobile) throws Exception;


    /**
     * 分页查询用户列表
     * @param page
     * @param limit
     * @return
     */
    PageDataResult getUsers(UserSearchDTO userSearch, int page, int limit);

    /**
     *	设置用户【新增或更新】
     * @param user
     * @param roleIds
     * @return
     */
    String setUser(User user, String roleIds);

    /**
     * 设置用户是否离职
     * @param id
     * @param isJob
     * @param insertUid
     * @return
     */
    String setJobUser(Integer id, Integer isJob, Integer insertUid,
                      Integer version);

    /**
     * 删除用户
     * @param id
     * @param isDel
     * @return
     */
    String setDelUser(Integer id, Integer isDel, Integer insertUid,
                      Integer version);

    /**
     * 查询用户数据
     * @param id
     * @return
     */
    UserRolesVO getUserAndRoles(Integer id);

    /**
     * 发送短信验证码
     * @param user
     * @return
     */
    String sendMsg(UserDTO user);


    /**
     * 根据手机号发送短信验证码
     * @param mobile
     * @return
     */
    String sendMessage(int userId, String mobile);

    /**
     * 修改用户手机号
     * @param id
     * @param password
     * @return
     */
    int updatePwd(Integer id, String password);

    /**
     * 锁定用户
     * @param id
     * @param isLock  0:解锁；1：锁定
     * @return
     */
    int setUserLockNum(Integer id, int isLock);
}
