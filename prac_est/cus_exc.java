package prac_est;

class CExc extends Exception {

    CExc() {
        super("You have ruined your life");
    }

}

public class cus_exc {
    void t() throws CExc {
        throw new CExc();
    }

    public static void main(String[] args) {
        cus_exc c = new cus_exc();
        try {
            c.t();
        } catch (CExc e) {
            System.out.println(e.getMessage());

        }
    }
}
