package main.java;

class Article { // 1 Punkt

    private String title; // 1 Punkt
    private ArticleCategory articleCategory; // 1 Punkt
    private String content; // 1 Punkt

    Article(String title, ArticleCategory articleCategory, String content) {
        this.title = title;
        this.articleCategory = articleCategory;
        this.content = content;
    } // 1 Punkt

    String getTitle() {
        return title;
    } // 1 Punkt

    void setTitle(String title) {
        this.title = title;
    } // 1 Punkt

    ArticleCategory getArticleCategory() {
        return articleCategory;
    } // 1 Punkt

    void setArticleCategory(ArticleCategory articleCategory) {
        this.articleCategory = articleCategory;
    } // 1 Punkt

    String getContent() {
        return content;
    } // 1 Punkt

    void setContent(String content) {
        this.content = content;
    } // 1 Punkt

}

// Gesamtpunktzahl: 11 Punkte
