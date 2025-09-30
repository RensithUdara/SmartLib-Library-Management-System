package Model;
import java.time.LocalDate;
import java.util.Random;
public class MembershipCard {
   int randomCode ;

    public int expireDate() {
        int currentDate = LocalDate.now().getYear();
        int datePlusTwoYears = currentDate+2;
        

        return datePlusTwoYears;
    }

    public int cardNum() {
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }
}




