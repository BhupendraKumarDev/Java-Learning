public class first {
    public static void main(String[] args){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "bhupendra";
        myAcc.setPassword("abcdefg");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}



/*
            JAVA ACCESS MODIFIERS

Access Modifier | Within Class | Within Package | Outside Package (Subclass) | Outside Package

1. Private      |      Y       |       N        |             N               |       N

2. Default      |      Y       |       Y        |             N               |       N

3. Protected    |      Y       |       Y        |             Y               |       N

4. Public       |      Y       |       Y        |             Y               |       Y


Y = Accessible
N = Not Accessible

NOTE:
Default means no access modifier is specified.
Default access is also called Package-Private.
*/
