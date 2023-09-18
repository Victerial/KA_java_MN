public class CodingHours {
    public static void main(final String[] args)
    {
        int allDays=17*7;
        int workDays=allDays-(17*2);
        int workingHours=workDays*6;

        System.out.println("The working hours in the semester: "+workingHours);
    
        float averageWorkHours = 17*52;

        System.out.println("Percentage: "+(workingHours/averageWorkHours)*100+"%");
    }
    
}
