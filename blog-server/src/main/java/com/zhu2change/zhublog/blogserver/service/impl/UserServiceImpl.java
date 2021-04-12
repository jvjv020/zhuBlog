package com.zhu2change.zhublog.blogserver.service.impl;

import com.zhu2change.zhublog.blogserver.entity.User;
import com.zhu2change.zhublog.blogserver.mapper.UserMapper;
import com.zhu2change.zhublog.blogserver.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhu
 * @since 2021-04-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
