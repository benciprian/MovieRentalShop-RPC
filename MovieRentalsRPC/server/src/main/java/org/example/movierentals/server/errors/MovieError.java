package org.example.movierentals.server.errors;

public enum MovieError {
    MOVIE_NOT_FOUND ("Movie not found."),
    MOVIES_NOT_FOUND("Movies not found."),
    MOVIE_NOT_ADDED("Movie not added."),
    MOVIE_NOT_UPDATED("Movie not updated."),
    MOVIE_NOT_DELETED("Movie not deleted."),
    MOVIE_TITLE_NO_MATCH("No Movie title matched.");

    private final String errorMessage;

    MovieError(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
