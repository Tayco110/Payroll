package functionalities;

import schedule.Schedule;
import schedule.day.Day;
import employee.Commissioned;
import employee.Salaried;
import java.util.Scanner;
import employee.Hourly;
import java.util.ArrayList;

public class Shedule_Functionalities 
{
    private int index,index_employee,day_count = 0,finded = 0,finded_e = 0;
    private String current_schedule;
    private Scanner input = new Scanner(System.in);
    private Commissioned commissioned;
    private Salaried salaried;
    private Hourly hourly;
    private Day current_day;

    public Shedule_Functionalities()
    {

    }
    ///CREATE SCHEDULE METHOD///
    public void create_schedule(Schedule schedule,String type,String day) 
    {
        if(type.equals("monthly"))
        {
            schedule.setSchedules("monthly "+day);
                
            for(index = 1;index<=31;index++)
            {   
                if(schedule.getJanuary_day(index).equals(day))
                {
                    if((index + 7)>31)
                    {
                        schedule.setSchedule_January(index,"monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=28;index++)
            {
                if(schedule.getFerbruary_day(index).equals(day))
                {
                    if((index + 7) > 28)
                    {
                        schedule.setSchedule_Ferbruary(index,"monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getMarch_day(index).equals(day))
                {
                    if((index + 7) > 31)
                    {
                        schedule.setSchedule_March(index,"monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getApril_day(index).equals(day))
                {
                    if((index + 7) > 30)
                    {
                        schedule.setSchedule_April(index, "monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getMay_day(index).equals(day))
                {
                    if((index + 7) > 31)
                    {
                        schedule.setSchedule_May(index, "monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getJune_day(index).equals(day))
                {
                    if((index + 7) > 30)
                    {
                        schedule.setSchedule_June(index, "monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getJuly_day(index).equals(day))
                {
                    if((index + 7) > 31)
                    {
                        schedule.setSchedule_July(index, "monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getAugust_day(index).equals(day))
                {
                    if((index + 7) > 31)
                    {
                        schedule.setSchedule_August(index,"monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getSeptember_day(index).equals(day))
                {
                    if((index + 7) > 30)
                    {
                        schedule.setSchedule_September(index, "monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getOctober_day(index).equals(day))
                {
                    if((index + 7) > 31)
                    {
                        schedule.setSchedule_October(index, "monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getNovember_day(index).equals(day))
                {
                    if((index + 7) > 30)
                    {
                        schedule.setSchedule_November(index, "monthly "+day);
                        break;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getDecember_day(index).equals(day))
                {
                    if((index + 7) > 31)
                    {
                        schedule.setSchedule_December(index, "monthly "+day);
                        break;
                    }
                }
            }
        }
        else if(type.equals("biweekly"))
        {
            schedule.setSchedules("biweekly "+day);
            
            for(index = 1;index<=31;index++)
            {
                if(schedule.getJanuary_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_January(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=28;index++)
            {
                if(schedule.getFerbruary_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_Ferbruary(index, "biweekly "+day);
                        day_count = 0;
                    }
                }

            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getMarch_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_March(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getApril_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_April(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getMay_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_May(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getJune_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_June(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getJuly_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_July(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getAugust_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_August(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getSeptember_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_September(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getOctober_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_October(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getNovember_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_November(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getDecember_day(index).equals(day))
                {
                    day_count++;
                    if(day_count == 2)
                    {
                        schedule.setSchedule_December(index, "biweekly "+day);
                        day_count = 0;
                    }
                }
            }
        }
        else if(type.equals("weekly"))
        {
            schedule.setSchedules("weekly "+day);
            
            for(index = 1;index<=31;index++)
            {
                if(schedule.getJanuary_day(index).equals(day))
                {
                    schedule.setSchedule_January(index,"weekly "+day);
                }
            }
            for(index = 1;index<=28;index++)
            {
                if(schedule.getFerbruary_day(index).equals(day))
                {
                    schedule.setSchedule_Ferbruary(index,"weekly "+day);
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getMarch_day(index).equals(day))
                {
                    schedule.setSchedule_March(index,"weekly "+day);
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getApril_day(index).equals(day))
                {
                    schedule.setSchedule_April(index,"weekly "+day);
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getMay_day(index).equals(day))
                {
                    schedule.setSchedule_May(index,"weekly "+day);
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getJune_day(index).equals(day))
                {
                    schedule.setSchedule_June(index,"weekly "+day);
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getJuly_day(index).equals(day))
                {
                    schedule.setSchedule_July(index,"weekly "+day);
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getAugust_day(index).equals(day))
                {
                    schedule.setSchedule_August(index,"weekly "+day);
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getSeptember_day(index).equals(day))
                {
                    schedule.setSchedule_September(index,"weekly "+day);
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getOctober_day(index).equals(day))
                {
                    schedule.setSchedule_October(index,"weekly "+day);
                }
            }
            for(index = 1;index<=30;index++)
            {
                if(schedule.getNovember_day(index).equals(day))
                {
                    schedule.setSchedule_November(index,"weekly "+day);
                }
            }
            for(index = 1;index<=31;index++)
            {
                if(schedule.getDecember_day(index).equals(day))
                {
                    schedule.setSchedule_December(index,"weekly "+day);
                }
            }
        }    
    }
    //END CREATE SCHEDULE METHOD///

    ///SCHEDULE MENU///
    public void show_current_schedules(Schedule schedule) 
    {
        for(index = 0;index<schedule.schedules.size();index++)
        {
            current_schedule = schedule.schedules.get(index);
            System.out.println("    -> "+current_schedule);
        }
    }
    public void change_Salaried_schedule(ArrayList<Salaried> salarieds,Schedule schedule,int id) 
    {
        System.out.println("Enter with an valid schedule(type and day): ");
        current_schedule = input.nextLine();
        for(index=0;index<schedule.schedules.size();index++)
        {
            if(schedule.schedules.get(index).equals(current_schedule))
            {
                finded = 1;
            }
        }
        if(finded == 1)
        {
            for(index=0;index<salarieds.size();index++)
            {
                salaried = salarieds.get(index);
                if(salaried.getId() == id)
                {
                    salaried.setSchedule(current_schedule);
                    salarieds.add(index,salaried);
                    System.out.println("New schedule successfully applied!!");
                    finded_e = 1;
                }
            }
            if(finded_e != 1)
            {
                System.out.println("Employee not found!!");
            }
        }
        else
        {
            System.out.println("The typed schedule does not exist!!");
        }
        finded = 0;
        finded_e = 0;
    }
    public void change_Commissioned_schedule(ArrayList<Commissioned> commissioneds,Schedule schedule,int id) 
    {
        System.out.println("Enter with an valid schedule(type and day): ");
        current_schedule = input.nextLine();
        for(index=0;index<schedule.schedules.size();index++)
        {
            if(schedule.schedules.get(index).equals(current_schedule))
            {
                finded = 1;
            }
        }
        if(finded == 1)
        {
            for(index=0;index<commissioneds.size();index++)
            {
                commissioned = commissioneds.get(index);
                if(commissioned.getId() == id)
                {
                    commissioned.setSchedule(current_schedule);
                    commissioneds.add(index,commissioned);
                    System.out.println("New schedule successfully applied!!");
                    finded_e = 1;
                }
            }
            if(finded_e != 1)
            {
                System.out.println("Employee not found!!");
            }
        }
        else
        {
            System.out.println("The typed schedule does not exist!!");
        }
        finded = 0;
        finded_e = 0;
    }
    public void change_Hourly_schedule(ArrayList<Hourly> hourlies,Schedule schedule,int id) 
    {
        System.out.println("Enter with an valid schedule(type and day): ");
        current_schedule = input.nextLine();
        for(index=0;index<schedule.schedules.size();index++)
        {
            if(schedule.schedules.get(index).equals(current_schedule))
            {
                finded = 1;
            }
        }
        if(finded == 1)
        {
            for(index=0;index<hourlies.size();index++)
            {
                hourly = hourlies.get(index);
                if(hourly.getId() == id)
                {
                    hourly.setSchedule(current_schedule);
                    hourlies.add(index, hourly);
                    System.out.println("New schedule successfully applied!!");
                    finded_e = 1;
                }
            }
            if(finded_e != 1)
            {
                System.out.println("Employee not found!!");
            }
        }
        else
        {
            System.out.println("The typed schedule does not exist!!");
        }
        finded = 0;
        finded_e = 0;
    }
    ///END SCHEDULE MENU///
    ///PAYMENT METHOD///
    public void Payment(ArrayList<Hourly> hourlies,ArrayList<Commissioned> commissioneds,ArrayList<Salaried> salarieds,Schedule schedule,int day,int month) 
    {
        if(month == 1)
        {
            current_day = schedule.January[day-1];

            for(index = 0; index <current_day.schedules_of_the_day.size(); index++)
            {
                current_schedule = current_day.schedules_of_the_day.get(index);

                for(index_employee = 0;index_employee<salarieds.size();index_employee++)
                {
                    salaried = salarieds.get(index_employee);
                    if(salaried.getSchedule().equals(current_schedule))
                    {
                        System.out.println("Nome: "+salaried.getName());
                        System.out.println("ID: "+salaried.getId());
                        System.out.println("Salário: "+salaried.getSalary());
                        System.out.println("Método de pagamento: "+salaried.getPaymentmethod());
                    }
                }
                for(index_employee = 0;index_employee<hourlies.size();index_employee++)
                {
                    hourly = hourlies.get(index_employee);
                    if(hourly.getSchedule().equals(current_schedule))
                    {
                        System.out.println("Nome: "+hourly.getName());
                    }
                }
            }

        }
        else if(month == 2)
        {

        }
        else if(month == 3)
        {

        }
        else if(month == 4)
        {

        }
        else if(month == 5)
        {

        }
        else if(month == 6)
        {

        }
        else if(month == 7)
        {

        }
        else if(month == 8)
        {

        }
        else if(month == 9)
        {
        
        }
        else if(month == 10)
        {

        }
        else if(month == 11)
        {

        }
        else if(month == 12)
        {

        }
    }
    ///END PAYMENT METHOD///
    
}
