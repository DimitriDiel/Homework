package lesson28.carShowroom.dto.error;

public enum ErrorCode {

    IE_500("Internal Server Error", 500),
    IE_400("Database error", 400),
    IE_413("Car yearOfIssue validation error", 413),
    IE_415("Car price validation error", 415),
    IE_420("Car rating validation error",420);

    private String description;
    private int statusCode;

    ErrorCode(String description, int statusCode) {
        this.description = description;
        this.statusCode = statusCode;
    }
}
