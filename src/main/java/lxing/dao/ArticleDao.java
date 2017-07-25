package lxing.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lxing.entity.Article;

/**
 * 通过Hbase数据库查询lucene查到文章的主键号 Created by lxing on 2017/3/12.
 */
@Component
public class ArticleDao {
    public Article searchOnHbaseByRkey(String tableName, String rowkey) {
        
        return null;
    }
}
