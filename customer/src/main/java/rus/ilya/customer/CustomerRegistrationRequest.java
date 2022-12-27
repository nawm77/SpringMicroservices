package rus.ilya.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
