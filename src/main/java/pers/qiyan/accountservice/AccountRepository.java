package pers.qiyan.accountservice;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import pers.qiyan.accountservice.Account;

public interface AccountRepository extends
        CrudRepository<Account, Long> {

    List<Account> findByFirstName(String firstName);
    List<Account> findByLastName(String lastName);
    List<Account> findByFirstNameAndLastName(String firstName, String lastName);
}