public class CopyConstructor {
    public static void main(String[] args) {
        Bank B1 = new Bank("Aman", "Jaipur","acbd");
        B1.statement[0] = 10;
        B1.statement[1] = 20;
        B1.statement[2] = 30;

        Bank B2 = new Bank(B1); // copy
        B2.pass = "dcba";  // add new value of pass...
        B1.statement[1] = 100; // bez. of deep copy the statement[1] not updated...

        for(int i = 0; i< 3; i++) {
            System.out.println(B2.statement[i]);
        }
    }
}

class Bank {
    String name;
    String city;
    String pass;
    int statement[];
    
    //DEEP COPY 
    Bank(Bank B1) {
        statement = new int[3];
        this.name = B1.city;
        this.city = B1.name;
        for (int i = 0; i <statement.length; i++) {
            this.statement[i] = B1.statement[i];
        }
    }

    Bank(String name, String city, String pass) {
        statement = new int[3];
        this.name = name;
        this.city = city;
        this.pass = pass;
    }
}