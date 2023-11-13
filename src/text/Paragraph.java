package text;

public class Paragraph {
    private String paragraphText;
    private int indent;
    public static final String EMPTY_PARAGRAPH = "";

    public Paragraph() {
        this.paragraphText = EMPTY_PARAGRAPH;
        this.indent = 0;
    }

    public Paragraph(int indent) {
        this.indent = indent;
        this.paragraphText = EMPTY_PARAGRAPH;
    }

    public Paragraph(int indent, String paragraphText) {
        this.indent = indent;
        this.paragraphText = paragraphText;
    }

    public String getParagraphText() {
        return paragraphText;
    }

    public void setParagraphText(String paragraphText) {
        this.paragraphText = paragraphText;
    }

    public int getIndent() {
        return indent;
    }

    public void setIndent(int indent) {
        this.indent = indent;
    }

}
