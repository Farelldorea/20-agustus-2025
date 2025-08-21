public class AccountTest2 {
public static void main(String[] args){
SavingsAccountt sa1 = new SavingsAccountt();

System.out.println("---Transaksi ucup---");
sa1.name = "ucup";
sa1.deposit(5000);
sa1.balance += sa1.calcInterest();
sa1.withdraw(200);
System.out.println("saldo setelah : "+sa1.balance);

SavingsAccountt sa2 = new SavingsAccountt();

System.out.println("---Transaksi farell---");
sa2.name = "farell";
sa2.deposit(10000);
sa2.balance += sa2.calcInterest();
sa2.withdraw(500);
System.out.println("saldo setelah : "+sa2.balance);



}//end class AccountTest
}
