import java.util.ArrayList;

public class PrimeFactor {

    public static ArrayList<Integer> primeMultipliers = new ArrayList<>();

    public void primeFactorization(int number) {

        for (Integer j: multipliers(number)) {
            if (multipliers(j).size() == 2) primeMultipliers.add(j);
        }
    }

    public ArrayList<Integer> multipliers(int number) {

        ArrayList<Integer> multipliers = new ArrayList<>();

        for (int i = number; i>=1; i--) {
            if (number%i == 0) multipliers.add(i);
        }

        return multipliers;
    }

    public void printFactors() {

        for (Integer factor: primeMultipliers) System.out.print(factor + " ");
    }


    public static void main(String[] args) {

        PrimeFactor pf = new PrimeFactor();


        for (String arg: args) {
            try {
                int number = Integer.valueOf(arg);
                if (number <= 1) throw new NumberFormatException();

                pf.primeFactorization(number);
                pf.printFactors();
                primeMultipliers.clear();

            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println(String.format("'%s' is not a number or is less or equival to 1 what does not make sense", arg));
            }
        }
    }
}
