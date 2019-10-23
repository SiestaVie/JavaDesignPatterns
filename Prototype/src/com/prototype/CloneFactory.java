package com.prototype;

public class CloneFactory {
    private Article article;

    public CloneFactory(Article article) {
        this.article = article;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Article makeCopyOfArticle() {
        return (Article) article.clone();
    }

    public void cloneCompare(Article article, Article clone) {
        if (article != clone) {
            System.out.println("Article are different objects");
            if (article.equals(clone)) {
                System.out.println("And they are identical");
            } else {
                System.out.println("But they are not identical");
            }
        } else {
            System.out.println("Article objects are the same");
        }
    }

}
