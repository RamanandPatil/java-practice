public class ToString {
    public static void main(String[] args) {
        Account account = new Account(10, "123-456-789",2000L);
        System.out.println();
        System.out.println(account);
    }
}

class Account {

    private long id;
    private String code;
    private Long balance;

    public Account(long id, String code, Long balance) {
        this.id = id;
        this.code = code;
        this.balance = balance;
    }

    // Override toString() here
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("{").append("id=").append(id).append(", ")
                      .append("code='").append(code).append("', ")
                      .append("balance=").append(balance)
          .append("}");
        return sb.toString();
    }
}
