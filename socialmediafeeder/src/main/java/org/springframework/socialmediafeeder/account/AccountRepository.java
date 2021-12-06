package org.springframework.socialmediafeeder.account;

public interface AccountRepository {

    void createAccount(Account account) throws UsernameAlreadyInUseException;

    Account findAccountByUsername(String username);
}
