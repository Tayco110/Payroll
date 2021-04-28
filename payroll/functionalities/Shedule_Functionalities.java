package functionalities;

import schedule.Schedule;

public class Shedule_Functionalities 
{
    private int index,day_count = 0;

    public Shedule_Functionalities()
    {

    }

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
                        
                        if((index + 14) > 31)
                        {
                            day_count = 1;
                            break;
                        }
                        else
                        {
                            schedule.setSchedule_January(index + 14, "biweekly "+day);
                        }
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
    
}
