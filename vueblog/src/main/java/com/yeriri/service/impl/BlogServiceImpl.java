package com.yeriri.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yeriri.entity.Blog;
import com.yeriri.mapper.BlogMapper;
import com.yeriri.service.BlogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author y_eriri
 * @since 2021-02-09
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
