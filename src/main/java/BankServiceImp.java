public class BankServiceImp implements BankServices {
//business logic
    @Override
    public Double addFundsToAccount(Account accountObjRef, Double amount) throws AccountException {
        if(accountObjRef==null)
        {
//            System.out.println("Account cant be null");
//            return null;
            throw new AccountException("Account cant be null");
        }
        if(amount<=0)
        {
//            System.out.println("Amount must be greater than 0 ");
            throw new AccountException("Amount must be greater than 0");
        }
        accountObjRef.setBalance(accountObjRef.getBalance()+amount);
        return accountObjRef.getBalance();

    }

    @Override
    public Double withdrawFundsFromAccount(Account accountObjRef, Double amount) throws AccountException {
        if(accountObjRef==null)
        {
//            System.out.println("Account cant be null");
//            return null;
            throw new AccountException("Account cant be null");
        }
        if(amount<=0)
        {
//            System.out.println("Amount must be greater than 0 ");
            throw new AccountException("Amount must be greater than 0");
        }
        if(accountObjRef.getBalance()<amount)
        {
//            System.out.println("Insufficient balance");
            throw new AccountException("Insufficient balance");
        }
        accountObjRef.setBalance(accountObjRef.getBalance()-amount);
        return accountObjRef.getBalance();
    }

    @Override
    public Boolean fundTransfer(Account fromAccount, Account toAccount, Double amount) throws AccountException {
        if(fromAccount==null || toAccount==null)
        {
            throw new AccountException("Accounts must be valid");
        }
        if(amount<=0)
        {
//            System.out.println("Amount must be greater than zero.");
            throw new AccountException("Amount must be greater than zero.");
        }

        if(fromAccount.getBalance()<amount)
        {
//            System.out.println("Insufficient balance on fromAccount");
            throw new AccountException("Insufficient balance on fromAccount");
        }
        toAccount.setBalance(toAccount.getBalance()+amount);
        fromAccount.setBalance(fromAccount.getBalance()-amount);
        return true;
    }

    @Override
    public void displayAccountInfo(Account accountObjRef) throws AccountException {
        if(accountObjRef==null)
        {
            throw new AccountException("Account must be valid!!!");
        }

        System.out.println("Account name: "+accountObjRef.getName());
        System.out.println("Account id: "+accountObjRef.getId());
        System.out.println("Account balance: "+accountObjRef.getBalance());
    }
}
