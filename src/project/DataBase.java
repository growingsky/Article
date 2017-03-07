package project;

import project.Article;
import project.Section;

import java.util.List;


public abstract class DataBase {

    abstract List<Article> getAllArticles();

    abstract void insertArticleToDataBase(Article article);

    abstract void connectToDataBase();
    abstract void addSection(Section  section);

    abstract void close();

}