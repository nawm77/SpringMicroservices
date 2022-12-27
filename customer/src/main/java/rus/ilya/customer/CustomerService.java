package rus.ilya.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepo customerRepo) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        customerRepo.save(customer);
    }
}
