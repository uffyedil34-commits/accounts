package com.microservices.account.repositories;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long> {

}
