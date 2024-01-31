public interface BankServices {

    Double addFundsToAccount(Account accountObjRef,Double amount) throws AccountException;
    Double withdrawFundsFromAccount(Account accountObjRef,Double amount) throws AccountException;

    Boolean fundTransfer(Account fromAccount,Account toAccount,Double amount) throws AccountException;
    void  displayAccountInfo(Account accountObjRef) throws AccountException;
}
