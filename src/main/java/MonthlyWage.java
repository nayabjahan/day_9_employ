public class MonthlyWage {
    public static final int Is_Full_time = 2;
    public static final int Employ_Rate_Per_hr = 20;

    public static final int Num_of_working_days = 2;
    public static final int Is_Part_time = 1;
    public static void main(String[] args) {
        // Variables
        int employ_Hr = 0;
        int employ_wage = 0;
        int Total_emp_Wage = 0;
        //Computation
        for (int day = 0; day < Num_of_working_days; day++) {
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case Is_Part_time:
                    employ_Hr = 4;
                    break;
                case Is_Full_time:
                    employ_Hr = 8;
                    break;
                default:
                    employ_Hr = 0;
            }
            employ_wage = Employ_Rate_Per_hr * employ_Hr;
            Total_emp_Wage += employ_wage;
            System.out.println("daily wage of employ is " + employ_wage);
        }
        System.out.println("Total wage of employ for a month " +Total_emp_Wage);
    }
}
