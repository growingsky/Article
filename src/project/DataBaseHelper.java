package project;

import project.Article;
import project.Section;

import java.util.List;

/**
 * Created by admin on 07.03.17.
 */
public class DataBaseHelper extends DataBase {
    List<Section> sections;
    List<Article> articles;
    @Override
    List<Article> getAllArticles() {
        return articles;
    }

    @Override
    void insertArticleToDataBase(Article article) {
          articles.add(article);
    }

    @Override
    void connectToDataBase() {

    }

    @Override
    void addSection(Section section) {
        sections.add(section);
    }

    @Override
    void close() {

    }
}
