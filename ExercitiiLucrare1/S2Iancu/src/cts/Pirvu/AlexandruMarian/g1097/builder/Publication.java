package cts.Pirvu.AlexandruMarian.g1097.builder;

public class Publication implements AbstractPublication {
    private String name;
    private int numberOfPages;
    private boolean hasISBN;
    private boolean hasAuthor;

    public Publication(String name, int numberOfPages, boolean hasISBN, boolean hasAuthor) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.hasISBN = hasISBN;
        this.hasAuthor = hasAuthor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Publication{");
        sb.append("name='").append(name).append('\'');
        sb.append(", numberOfPages=").append(numberOfPages);
        sb.append(", hasISBN=").append(hasISBN);
        sb.append(", hasAuthor=").append(hasAuthor);
        sb.append('}');
        return sb.toString();
    }
}
