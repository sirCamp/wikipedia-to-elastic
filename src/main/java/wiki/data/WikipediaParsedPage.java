/**
 * @author  Alon Eirew
 */

package wiki.data;

import java.util.List;
import java.util.Objects;

public class WikipediaParsedPage {
    private final String title;
    private final transient long id;
    private final long pageId;
    private final String text;
    private final List<String> parsedParagraphs;
    private final String redirectTitle;
    private final String url;
    private final WikipediaParsedPageRelations relations;

    public WikipediaParsedPage(String title, long id, String text, List<String> parsedParagraphs, String redirectTitle,
                               WikipediaParsedPageRelations relations, String url) {
        this.title = title;
        this.id = id;
        this.pageId = id;
        this.text = text;
        this.parsedParagraphs = parsedParagraphs;
        this.redirectTitle = redirectTitle;
        this.relations = relations;
        this.url = url;
    }

    public WikipediaParsedPage(WikipediaParsedPage page) {
        this.title = page.title;
        this.id = page.id;
        this.pageId = page.id;
        this.text = page.text;
        this.parsedParagraphs = page.parsedParagraphs;
        this.redirectTitle = page.redirectTitle;
        this.relations = page.relations;
        this.url = page.url;
    }

    public String getTitle() {
        return title;
    }

    public long getId() {
        return id;
    }
    public long getPageId() {
        return pageId;
    }

    public String getText() {
        return text;
    }

    public String getRedirectTitle() {
        return redirectTitle;
    }

    public List<String> getParsedParagraphs() {
        return parsedParagraphs;
    }

    public WikipediaParsedPageRelations getRelations() {
        return relations;
    }

    public String getUrl() {
        return url;
    }

    public boolean isValid() {
        return this.text != null || this.parsedParagraphs != null || this.relations != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WikipediaParsedPage)) return false;
        WikipediaParsedPage that = (WikipediaParsedPage) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(text, that.text) && Objects.equals(parsedParagraphs, that.parsedParagraphs) && Objects.equals(redirectTitle, that.redirectTitle) && Objects.equals(url, that.url) && Objects.equals(relations, that.relations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, id, text, parsedParagraphs, redirectTitle, relations, url);
    }

    @Override
    public String toString() {
        return "WikipediaParsedPage{" +
                "title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", pageId='" + pageId + '\'' +
                ", redirectTitle='" + redirectTitle + '\'' +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
