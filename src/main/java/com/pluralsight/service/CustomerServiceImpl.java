package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
    public CustomerServiceImpl() {
	// TODO Auto-generated constructor stub
}
   public CustomerServiceImpl(CustomerRepository customerRepo){
	   this.customerRepository=customerRepo;
   }
    
	@Override
	public List<Customer> findAll() {

		return customerRepository.findAll();

	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
