package kz.app.cart.shopping.service.impl;

import kz.app.cart.shopping.dto.CustomerDTO;
import kz.app.cart.shopping.model.Customer;
import kz.app.cart.shopping.repository.CustomerRepository;
import kz.app.cart.shopping.service.ICustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class CustomerService implements ICustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer save(CustomerDTO customerDTO) {
        Customer customer;

        log.info("Start saving customer");

        if (customerDTO.getId() == null) {
            log.info("new customer");
            customer = Customer.builder()
                    .customerCode(customerDTO.getCustomerCode())
                    .customerName(customerDTO.getCustomerName())
                    .avatar(customerDTO.getAvatar())
                    .emailAddress(customerDTO.getEmailAddress())
                    .contactNumber(customerDTO.getContactNumber())
                    .completeAddress(customerDTO.getCompleteAddress())
                    .username(customerDTO.getUsername())
                    .password(customerDTO.getPassword())
                    .build();
        } else {
            log.info("not new customer");
            customer = getById(customerDTO.getId());

            customer.setCustomerCode(customerDTO.getCustomerCode());
            customer.setCustomerName(customerDTO.getCustomerName());
            customer.setAvatar(customerDTO.getAvatar());
            customer.setContactNumber(customerDTO.getContactNumber());
            customer.setEmailAddress(customerDTO.getEmailAddress());
            customer.setCompleteAddress(customerDTO.getCompleteAddress());
            customer.setUsername(customerDTO.getUsername());
            customer.setPassword(customerDTO.getPassword());
        }

        Customer savedCustomer = customerRepository.saveAndFlush(customer);
        log.info("savedCustomer = " + savedCustomer.getId());

        return savedCustomer;
    }

    @Override
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer getById(Long id) {
        return customerRepository.getById(id);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
