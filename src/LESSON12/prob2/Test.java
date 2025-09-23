package LESSON12.prob2;

public class Test {
    public static void main(String[] args) {
        CustomerAccount acc =  new CustomerAccount("Maria","15664",1000);

        try{
            acc.deposit(-200);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            acc.withdraw(5000);
        }catch (AccountException e){
            System.out.println(e.getMessage());
        }

        try{
            acc.withdraw(980);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }

        try{
            acc.deposit(500);
            acc.withdraw(400);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total balance: $" + acc.getBalance());
    }
}
