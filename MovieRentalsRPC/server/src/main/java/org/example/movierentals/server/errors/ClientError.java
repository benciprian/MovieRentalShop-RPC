package org.example.movierentals.server.errors;

public enum ClientError {
    CLIENT_NOT_FOUND ("Client not found."),
    CLIENTS_NOT_FOUND("Clients not found."),
    CLIENT_NOT_ADDED("Client not added."),
    CLIENT_NOT_UPDATED("Client not updated."),
    CLIENT_NOT_DELETED("Client not deleted."),
    CLIENT_NAME_NO_MATCH("No Client name matched.");

    private final String errorMessage;

    ClientError(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
