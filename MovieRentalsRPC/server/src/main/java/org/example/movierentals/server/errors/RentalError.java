package org.example.movierentals.server.errors;

public enum RentalError {
    RENTAL_NOT_FOUND ("Rental not found."),
    RENTALS_NOT_FOUND ("Rentals not found."),
    RENTAL_NOT_ADDED ("Rental not added."),
    RENTAL_NOT_UPDATED ("Rental not updated."),
    RENTAL_NOT_DELETED ("Rental not deleted."),
    RENTAL_NO_REPORT ("Data not found. No report generated."),
    RENTAL_NO_REPORT_ID_NOT_FOUND ("ID not found.");

    private final String errorMessage;

    RentalError(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
