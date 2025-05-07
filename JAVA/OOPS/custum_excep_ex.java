
    class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }
     class Bank {
        private int balance = 1000;
    
        public void withdraw(int amount) throws InsufficientFundsException {
            if (amount > balance) {
                throw new InsufficientFundsException("Withdrawal amount exceeds balance.");
            }
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining: " + balance);
        }
    }
        public class custum_excep_ex {
        public static void main(String[] args) {
            Bank b = new Bank();
            try {
                b.withdraw(1200);
            } catch (InsufficientFundsException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
    

