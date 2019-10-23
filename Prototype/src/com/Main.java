package com;
/**
 * Prototype pattern. There is a set of wikipedia articles. Implement the process of distributing articles on
 * demand for changes,while maintaining the original version for the possible restoration of the article in its
 * original form.
 */

import com.prototype.Article;
import com.prototype.CloneFactory;

public class Main {
    public static void main(String[] args) {
        CloneFactory cloneFactory = new CloneFactory(new Article("Name", "Content very simple))"));
        Article copiedArticle = cloneFactory.makeCopyOfArticle();
        cloneFactory.cloneCompare(cloneFactory.getArticle(), copiedArticle);
        cloneFactory.getArticle().setNameOfArticle("llalala");
        System.out.println(copiedArticle.getNameOfArticle());
    }
}
