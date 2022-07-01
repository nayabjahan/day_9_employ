public class IsPresent {
    public static void main(String[] args) {
        int Is_present = 1;
        int Is_Absent = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == Is_present){
            System.out.println("Employ is present");
        }
        else{
            System.out.println("Employ is absent");
        }

    }
}
