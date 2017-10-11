package nju.yva.web.logic;

import nju.yva.web.data.UserInfo;

/**
 * Created by Water on 2017/8/11.
 */
public interface UserLogic {
    /**
     * 用户登录
     * 传进来之后就加密
     *
     * @param id       id是注册的账号
     * @param password 密码是自己设定的
     * @return 登录成功则返回true，否则返回false
     */
    boolean userLogin(String id, String password);

    /**
     * 用户登出
     *
     * @param id 用户的id
     * @return 登出成功则返回true，否则返回false
     */
    boolean userLogout(String id);

    /**
     * 用户注册
     *
     * @param id        提供id
     * @param password  密码
     * @param name      姓名
     * @param telNum    联系方式
     * @param studentNo 学号
     * @return
     */
    boolean userRegister(String id, String password, String name, String telNum, String studentNo);


    /**
     * 修改信息
     *
     * @param modifiedInfo
     * @return
     */
    boolean userModify(UserInfo modifiedInfo);


    /**
     * 通过id获得用户的信息
     *
     * @param id 用户id
     * @return
     */
    UserInfo getUserInfo(long id);

    /**
     * 通过用户名获得用户的信息
     * @param username
     * @return
     */
    UserInfo getUserInfo(String username);
}
