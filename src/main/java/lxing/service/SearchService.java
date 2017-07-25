package lxing.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lxing.dao.ArticleDao;
import lxing.entity.Article;
import lxing.entity.Page;

/**通过lucene查询需要检索的文章
 * Created by lxing on 2017/3/12.
 */
@Service
public class SearchService {
    @Autowired
    private ArticleDao articleDao;

    //普通查询
    public List<Article> searchPage(String directoryPath, String query, int pageIndex) {

        return null;
    }


}
