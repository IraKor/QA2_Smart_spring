import org.junit.jupiter.api.Test;

public class Homework {
    @Test
    public void HomeworkResult() {
            int loan = 80500;
            int interest1 = 10;
            int interest2 = 8;
            int interest3 = 6;
            int years = 10;
            int rate = 100;
            int totalYears = 30;
            int principal = loan / totalYears;
            int principal10Years = principal * years;
            int totalInterest1 = loan * interest1 * years / rate;

            int loanNext10Years = loan - principal10Years;
            int totalInterest2 = loanNext10Years * interest2 * years / rate;

            int loanLast10Years = loanNext10Years - principal10Years;
            int totalInterest3 = loanLast10Years * interest3 * years / rate;

            int grandTotalInterests = totalInterest1 + totalInterest2 + totalInterest3;
            int grandTotalAmountPaid = loan + grandTotalInterests;

            System.out.println("Interest for first 10 years: " + totalInterest1);
            System.out.println("Interests for next 10 years: " + totalInterest2);
            System.out.println("Interests for last 10 years: " + totalInterest3);
            System.out.println("Grand total amount paid: " +grandTotalAmountPaid);




    }

    }

