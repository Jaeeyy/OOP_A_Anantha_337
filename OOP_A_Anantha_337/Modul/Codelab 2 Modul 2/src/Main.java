public class Main {
    public static void main(String[] args) {
        //Object Bank Akun
        BankAccount Akun1 = new BankAccount();
        BankAccount Akun2 = new BankAccount();

        //Object Attribute Of Akun1
        Akun1.NomerRekening = "202410370110337";
        Akun1.NamaPemilik = "Budi Anantha Trikurnia Irawan";
        Akun1.Saldo = 10000;


        //Object Attribute Of Akun2
        Akun2.NomerRekening = "202410370110185";
        Akun2.NamaPemilik = "Shetma Ikmal Zakka";
        Akun2.Saldo = 10000;


        //Information Displayed for the first time
        Akun1.displayInfo();
        Akun2.displayInfo();

        //Amount Of Saldo that got deposited to the Object Akun1 & Akun2
        Akun1.depositSaldo(-1);
        Akun2.depositSaldo(2000);

        //Amount Of Saldo that got withdraw from the Object Akun1 & Akun2
        Akun1.withdrawSaldo(5000);
        Akun2.withdrawSaldo(7000);

        //Display Information that just got updated by deposit and withdraw
        Akun1.displayInfo();
        Akun2.displayInfo();

    }
}