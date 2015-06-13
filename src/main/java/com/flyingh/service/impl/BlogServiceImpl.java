package com.flyingh.service.impl;

import com.flyingh.mapper.BlogMapper;
import com.flyingh.service.BlogService;
import com.flyingh.util.SqlSessionFactoryUtil;
import com.flyingh.vo.Blog;
import org.apache.ibatis.session.SqlSession;

public class BlogServiceImpl implements BlogService {
    @Override
    public Blog find(int id) {
        try (SqlSession session = SqlSessionFactoryUtil.openSession()) {
            return session.getMapper(BlogMapper.class).selectBlog(1);
        }
    }
}
