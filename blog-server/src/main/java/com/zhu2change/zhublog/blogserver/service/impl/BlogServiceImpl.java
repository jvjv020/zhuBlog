package com.zhu2change.zhublog.blogserver.service.impl;

import com.zhu2change.zhublog.blogserver.entity.Blog;
import com.zhu2change.zhublog.blogserver.mapper.BlogMapper;
import com.zhu2change.zhublog.blogserver.service.IBlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
