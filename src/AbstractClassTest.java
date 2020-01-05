import java.util.Arrays;

public class AbstractClassTest {
    public static void main(String[] args) {
    }
}

interface AccountService {
    /**
     * It finds an account by owner id
     *
     * @param id owner unique identifier
     * @return account or null
     */
    Account_Old findAccountByOwnerId(long id);

    /**
     * It count the number of account with balance > the given value
     *
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}
// Declare and implement your AccountServiceImpl here

class Account_Old {

    private long id;
    private long balance;
    private User owner;

    public Account_Old(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class AccountServiceImpl implements AccountService {

    private Account_Old[] accountOlds;

    public AccountServiceImpl(Account_Old[] accountOlds) {
        this.accountOlds = accountOlds;
    }

    @Override public Account_Old findAccountByOwnerId(long id) {
        for (Account_Old accountOld : accountOlds) {
            if (accountOld.getOwner().getId() == id) {
                return accountOld;
            }
        }
        return null;
    }

    @Override public long countAccountsWithBalanceGreaterThan(long value) {
        return Arrays.stream(accountOlds)
                     .filter(account -> account.getBalance() > value).count();
    }
}
