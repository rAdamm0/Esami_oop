package a04.e1;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class BankAccountFactoryImpl implements BankAccountFactory{
    

    @Override
    public BankAccount createBasic() {
        return new BankAccount() {
            private int balance = 0;

            @Override
            public int getBalance() {
                return balance;
            }

            @Override
            public void deposit(int amount) {
                balance += amount;
            }

            @Override
            public boolean withdraw(int amount) {
                return amount <= balance ? (balance -= amount) >= 0 : false;
            }
            
        };
    }

    @Override
    public BankAccount createWithFee(UnaryOperator<Integer> feeFunction) {
        return new BankAccount() {
            private int balance = 0;
            @Override
            public int getBalance() {
                return balance;
            }

            @Override
            public void deposit(int amount) {
                this.balance += amount;
            }

            @Override
            public boolean withdraw(int amount) {
                return (amount + feeFunction.apply(amount)) <= balance ? (balance -= amount + feeFunction.apply(amount)) >= 0 : false;
            }
            
        };
    }

    @Override
    public BankAccount createWithCredit(Predicate<Integer> allowedCredit, UnaryOperator<Integer> rateFunction) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createWithCredit'");
    }

    @Override
    public BankAccount createWithBlock(BiPredicate<Integer, Integer> blockingPolicy) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createWithBlock'");
    }

    @Override
    public BankAccount createWithFeeAndCredit(UnaryOperator<Integer> feeFunction, Predicate<Integer> allowedCredit,
            UnaryOperator<Integer> rateFunction) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createWithFeeAndCredit'");
    }

}
