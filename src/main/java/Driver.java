public class Driver {
    public static void main(String[] args) {
        Account firstAccount=new Account(1,"Ford",5000.0);
        Account secondAccount=new Account(2,"Chevy",5000.0);
        //ref variable on stack,obj on heap
        //BankServiceImp bankService =new BankServiceImp() // this is tight coupling
        // if we do this the refVariable cannot refer other implementations

        //For the refVariable to use all the implementations of the interface do like below
        BankServices bankService =new BankServiceImp();
        System.out.println(firstAccount);//just printing the class name calls the toString method.
        try {
            bankService.addFundsToAccount(firstAccount,5000.0);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        try {
            bankService.addFundsToAccount(null,500.0);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }

        try{
            bankService.withdrawFundsFromAccount(firstAccount,100000.0);
        }catch(AccountException e){
            System.out.println(e.getMessage());
        }
        try {
            bankService.fundTransfer(firstAccount,secondAccount,3000.0);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        try {
            bankService.displayAccountInfo(firstAccount);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        try {
            bankService.displayAccountInfo(null);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
    }
}
