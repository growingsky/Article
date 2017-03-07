package project;

/**
 * Created by admin on 07.03.17.
 */
public class OtherArticle extends Article {
    private String sectionName;

    public OtherArticle(String sectionName) {
        this.sectionName = sectionName;
        setSection(Section.OTHER);
    }

    @Override
    protected String getTitle() {
        return super.getTitle();
    }

    @Override
    protected void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    protected String getText() {
        return super.getText();
    }

    @Override
    protected void setText(String text) {
        super.setText(text);
    }

    @Override
    protected String getAuthorName() {
        return super.getAuthorName();
    }

    @Override
    protected void setAuthorName(String authorName) {
        super.setAuthorName(authorName);
    }

    @Override
    protected Section getSection() {
        return super.getSection();
    }

    @Override
    protected void setSection(Section section) {
        super.setSection(section);
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }
}
