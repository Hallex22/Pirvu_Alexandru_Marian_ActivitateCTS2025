package cts.Pirvu.AlexandruMarian.g1097.builder;

public class BuilderPublication implements IBuilderPublication {
    private String name;
    private int numberOfPages;
    private boolean hasISBN;
    private boolean hasAuthor;
    public BuilderPublication(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.hasISBN = false;
        this.hasAuthor = false;
    }

    public BuilderPublication setName(String name) {
        this.name = name;
        return this;
    }

    public BuilderPublication setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
        return this;
    }

    public BuilderPublication setHasISBN(boolean hasISBN) {
        this.hasISBN = hasISBN;
        return this;
    }

    public BuilderPublication setHasAuthor(boolean hasAuthor) {
        this.hasAuthor = hasAuthor;
        return this;
    }

    @Override
    public Publication build() {
        Publication publication = new Publication(name, numberOfPages, hasISBN, hasAuthor);
        return publication;
    }
}
