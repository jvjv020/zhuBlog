package com.zhu2change.zhublog.blogserver.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhu2change.zhublog.blogserver.common.lang.Result;
import com.zhu2change.zhublog.blogserver.entity.Blog;
import com.zhu2change.zhublog.blogserver.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhu
 * @since 2021-04-12
 */
@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    IBlogService iBlogService;

    //某一页博客列表
    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "1") int currPage){
        Page<Blog> page = new Page<>(currPage,5);
        IPage pageData = iBlogService.page(page,new QueryWrapper<Blog>().orderByDesc("created"));
        return Result.success(pageData);
    }
}
