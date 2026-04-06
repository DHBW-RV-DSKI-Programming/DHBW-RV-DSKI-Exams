package main.java;

public class NewsApp {

    public static void main(String[] args) {
        Article article1 = new Article("Article 1", ArticleCategory.POLITICS, "Content 1");
        Article article2 = new Article("Article 2", ArticleCategory.SPORTS, "Content 2");
        Article article3 = new Article("Article 3", ArticleCategory.TECHNOLOGY, "Content 3");
        Article article4 = new Article("Article 4", ArticleCategory.ENTERTAINMENT, "Content 4");

        NewsPortal newsPortal = new NewsPortal();
        newsPortal.setName("Schwäbischer Kurier");
        newsPortal.addArticle(article1);
        newsPortal.addArticle(article2);
        newsPortal.addArticle(article3);
        newsPortal.addArticle(article4);

        newsPortal.printArticles();
    }

}
