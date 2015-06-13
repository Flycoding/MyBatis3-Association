package com.flyingh.service.impl;

import com.flyingh.service.BlogService;
import com.flyingh.vo.Blog;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BlogServiceImplTest {
    private static BlogService blogService;

    @BeforeClass
    public static void beforeClass() {
        blogService = new BlogServiceImpl();
    }

    @Test
    public void testFind() throws Exception {
        Blog blog = blogService.find(1);
        System.out.println(blog);
    }

    @AfterClass
    public static void afterClass() {
        blogService = null;
    }
}