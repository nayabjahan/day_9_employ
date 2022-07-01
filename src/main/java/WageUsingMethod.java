public class WageUsingMethod {
    public static final int Is_Part_time = 1;
    public static final int Is_Full_time = 2;
    public static final int Employ_Rate_Per_hr = 20;
    public static final int Num_of_working_days = 2;
    public static final int MAX_HR_IN_MONTH= 10;
    public static int computeEmpWage()
    {
        int employ_Hr = 0;
        int totalEmpHr = 0;
        int employ_wage = 0;
        int Total_emp_Wage = 0;
        int TotalWorkingDays = 0;
        while (Total_emp_Wage <= MAX_HR_IN_MONTH && TotalWorkingDays < Num_of_working_days){
            TotalWorkingDays++;
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
            totalEmpHr += employ_Hr;
            System.out.println("Days#:" +TotalWorkingDays +" emp hour:" + employ_Hr);
        }
        Total_emp_Wage = Employ_Rate_Per_hr* employ_Hr;
        System.out.println("Total wage of employ for a month " +Total_emp_Wage);
        return Total_emp_Wage;
    }
    public static void main(String[] args){
        computeEmpWage();
    }
}
