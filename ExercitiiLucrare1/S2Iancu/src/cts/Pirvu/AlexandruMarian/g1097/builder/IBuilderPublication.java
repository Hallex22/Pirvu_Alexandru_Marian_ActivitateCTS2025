package cts.Pirvu.AlexandruMarian.g1097.builder;

public interface IBuilderPublication {
    BuilderPublication setName(String name);
    BuilderPublication setNumberOfPages(int numberOfPages);
    BuilderPublication setHasISBN(boolean hasISBN);
    BuilderPublication setHasAuthor(boolean hasAuthor);
    Publication build();
}
