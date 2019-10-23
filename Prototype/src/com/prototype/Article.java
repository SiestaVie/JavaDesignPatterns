package com.prototype;

public class Article implements Cloneable {
    private String nameOfArticle;
    private String content;

    public Article(String nameOfArticle, String content) {
        this.nameOfArticle = nameOfArticle;
        this.content = content;
    }

    public Article(Article target) {
        if (target != null) {
            this.nameOfArticle = target.nameOfArticle;
            this.content = target.content;
        }
    }

    @Override
    public Object clone() {
        return new Article(this);
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject == null || anObject.getClass() != this.getClass()) {
            return false;
        }
        Article article = (Article) anObject;
        return article.nameOfArticle == nameOfArticle && article.content == content;

    }


    @Override
    public String toString() {
        return "Article{" +
                "nameOfArticle='" + nameOfArticle + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getNameOfArticle() {
        return nameOfArticle;
    }

    public void setNameOfArticle(String nameOfArticle) {
        this.nameOfArticle = nameOfArticle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
