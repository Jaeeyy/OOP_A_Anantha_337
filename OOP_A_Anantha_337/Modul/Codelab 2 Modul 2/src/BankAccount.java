//Bank Account public class
public class BankAccount {
    String NomerRekening;
    String NamaPemilik;
    double Saldo;

    //To provide information to public main class
    void displayInfo() {
        System.out.println("Nomer Rekening: " + NomerRekening);
        System.out.println("Nama Pemilik: " + NamaPemilik);
        System.out.println("Saldo: " + Saldo +"\n");

    }

    //Why do i use double instead of Interger because it can provide a decimal number.
    double depositSaldo(double Jumlah) {
        if (Jumlah > 0) {    //If the amount of Saldo that got added is 0 or negative it will go to the else option
            Saldo += Jumlah; //It adds the amount of Saldo with the amount of Jumlah that provided in the main class.
            System.out.println("Transaksi Sukses");
            System.out.println("Saldo Masuk: Rp." + Jumlah);
            System.out.println("Jumlah Saldo: Rp." + Saldo);
            System.out.println();

        }else{
            System.out.println("Mohon masukan jumlah positif!"); //the print out if inputed a negative number
        } return Saldo;
    }

    //Same as the depositSaldo datatype it uses double because it is needed to count decimal number.
    double withdrawSaldo(double Jumlah) {
        if (Jumlah > 0 && Saldo >= Jumlah) {    //the amount must be Positive or Above 0 and if Saldo is less than the Jumlah it will go to else.
            Saldo -= Jumlah;    //it substract the amount of Saldo and the amount of Jumlah that provided in the Main Class
            System.out.println("Transaksi Sukses");
            System.out.println("Penarikan Tunai: Rp." + Jumlah);
            System.out.println("Sisa Saldo: Rp." + Saldo);
            System.out.println();
        }else{
            System.out.println("Insufficient Saldo Withdrawal Gagal"); //the print out if the jumlah is negative number or Saldo that want to be withdraw is less than the jumlah
        } return Saldo;
    }
}
