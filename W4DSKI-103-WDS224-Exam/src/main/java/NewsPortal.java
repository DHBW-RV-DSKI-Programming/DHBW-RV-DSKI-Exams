package main.java;

import java.util.ArrayList;

class NewsPortal {

    private String name;
    private ArrayList<Article> articles;

    void setName(String name) {
        this.name = name;
    }

    void printArticles() {
        System.out.println("NewsPortal: " + name);
        for (Article article : articles) {
            System.out.println(article.getTitle() + " (" + article.getArticleCategory() + "): " + article.getContent());
        }
    }

}