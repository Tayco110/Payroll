package functionalities;

import employee.Hourly;
import employee.Salaried;
import employee.Commissioned;
import java.util.ArrayList;
import java.util.Scanner;

public class Functionalities_Employee {
    private String name,address,paymentmethod,sindicate_controll,option;
    private int is_sindicate = 0,sindicate_id = -1,finded = 0,change_controll,index,tc_in_h,tc_in_m,tc_out_h,tc_out_m;
    private double union_fee = 0,salary,commission,salaryperhour,service,sale_value;

    private Salaried salaried;
    private Commissioned commissioned;
    private Hourly hourly;
    
    private Scanner input = new Scanner(System.in);

    public Functionalities_Employee(){

    }

    //// REGISTER EMPLOYEE METHODS///////
    public Salaried register_Salaried(int id) 
    {
        System.out.printf("Enter the employer's name: ");
        name = input.nextLine();
        System.out.printf("Enter the employer's address: ");
        address = input.nextLine();
        System.out.println("Enter the employer's payment method: ");
        System.out.println("    -> mail");
        System.out.println("    -> in hands");
        System.out.println("    -> bank acount");
        System.out.printf("Payment method: ");
        paymentmethod = input.nextLine();
        System.out.printf("Enter the employer's FIXED VALUE of salary: ");
        salary = input.nextDouble();
        input.nextLine();
        System.out.println("Will the employee be part of the union?");
        System.out.println("    -> yes");
        System.out.println("    -> no");
        sindicate_controll = input.nextLine();
        if(sindicate_controll.equals("yes"))
        {
            is_sindicate = 1;
            sindicate_id = (id+24);
            System.out.printf("Enter the monthly union fee value: ");
            union_fee = input.nextDouble();
            input.nextLine();
        }
        else
        {
            is_sindicate = 0;
            sindicate_id = -1;
            union_fee = 0;
        }
        salaried = new Salaried(name,address,"Salaried",paymentmethod,"monthly friday",id,sindicate_id,is_sindicate,union_fee,salary);
        return salaried;
    }
    public Commissioned register_Commissioned(int id)
    {
        System.out.printf("Enter the employer's name: ");
        name = input.nextLine();
        System.out.printf("Enter the employer's address: ");
        address = input.nextLine();
        System.out.println("Enter the employer's payment method: ");
        System.out.println("    -> mail");
        System.out.println("    -> in hands");
        System.out.println("    -> bank acount");
        System.out.printf("Payment method: ");
        paymentmethod = input.nextLine();
        System.out.printf("Enter the employer's FIXED VALUE of salary: ");
        salary = input.nextDouble();
        input.nextLine();
        System.out.printf("Enter the employer's commission: ");
        commission = input.nextDouble();
        input.nextLine();
        System.out.println("Will the employee be part of the union?");
        System.out.println("    -> yes");
        System.out.println("    -> no");
        sindicate_controll = input.nextLine();
        if(sindicate_controll.equals("yes"))
        {
            is_sindicate = 1;
            sindicate_id = (id+24);
            System.out.println("Enter the monthly union fee value: ");
            union_fee = input.nextDouble();
            input.nextLine();
        }
        else
        {
            is_sindicate = 0;
            sindicate_id = -1;
            union_fee = 0;
        }
        commissioned = new Commissioned(name,address,"Commissioned",paymentmethod,"biweekly friday",id,sindicate_id,is_sindicate,union_fee,salary,commission);
        return commissioned;
    }
    public Hourly register_Hourly(int id) 
    {
        System.out.printf("Enter the employer's name: ");
        name = input.nextLine();
        System.out.printf("Enter the employer's address: ");
        address = input.nextLine();
        System.out.println("Enter the employer's payment method: ");
        System.out.println("    -> mail");
        System.out.println("    -> in hands");
        System.out.println("    -> bank acount");
        System.out.printf("Payment method: ");
        paymentmethod = input.nextLine();
        System.out.println("Enter the employer's SALARY PER HOUR: ");
        salaryperhour = input.nextDouble();
        input.nextLine();
        System.out.println("Will the employee be part of the union?");
        System.out.println("    -> yes");
        System.out.println("    -> no");
        sindicate_controll = input.nextLine();
        if(sindicate_controll.equals("yes"))
        {
            is_sindicate = 1;
            sindicate_id = (id+24);
            System.out.println("Enter the monthly union fee value: ");
            union_fee = input.nextDouble();
            input.nextLine();
        }
        else
        {
            sindicate_id = -1;
            is_sindicate = 0;
            union_fee = 0;
        }
        hourly = new Hourly(name,address,"Hourly",paymentmethod,"weekly friday",id,sindicate_id,is_sindicate, union_fee, salaryperhour);
        return hourly;    
    }
    ///END OFF REGISTER EMPLOYEE METHODS///
    ///EMPLOYEE REMOVE METHODS///
    public void remove_Salaried(ArrayList<Salaried> salarieds,int id) 
    {
        for(index=0;index<salarieds.size();index++)
        {
            salaried = salarieds.get(index);
            if(salaried.getId() == id)
            {
                salarieds.remove(index);
                finded = 1;
                break;
            }
        }
        if(finded == 1)
        {
            System.out.println("Employee removed!!");
            finded = 0;
        }
        else
        {
            System.out.println("Employee not found!!");
        }
    }
    public void remove_Commissioned(ArrayList<Commissioned> commissioneds,int id) 
    {
        for(index=0;index<commissioneds.size();index++)
        {
            commissioned = commissioneds.get(index);
            if(commissioned.getId() == id)
            {
                commissioneds.remove(index);
                finded = 1;
                break;
            }
        }
        if(finded == 1)
        {
            System.out.println("Employee removed!!");
            finded = 0;
        }
        else
        {
            System.out.println("Employee not found!!");
        }
    }
    public void remove_Houly(ArrayList<Hourly> hourlies,int id) 
    {
        for(index=0;index<hourlies.size();index++)
        {
            hourly = hourlies.get(index);
            if(hourly.getId() == id)
            {
                hourlies.remove(index);
                finded = 1;
                break;
            }
        }
        if(finded == 1)
        {
            System.out.println("Employee removed!!");
            finded = 0;
        }
        else
        {
            System.out.println("Employee not found!!");
        }
    }
    ///END EMPLOYEE REMOVE METHODS///
    ///CHANGE EMPLOYEE///
    public void change_Salaried(ArrayList<Salaried> salarieds, int id)
    {
        while(true)
        {
            System.out.println("=== What do you want to change: ===");
            System.out.println("    (1) Name");
            System.out.println("    (2) Address");
            System.out.println("    (3) Payment method");
            System.out.println("    (4) Associate employee to union");
            System.out.println("    (5) Disassociate employee from the union");
            System.out.println("    (6) Union ID");
            System.out.println("    (7) Union fee value");
            do 
            {
                System.out.println("===  Enter a valid task  ===");
                change_controll = input.nextInt();
                System.out.println();
            }while(change_controll < 1 || change_controll > 7);
            input.nextLine();

            if(change_controll == 1)
            {
                System.out.println("Enter the new name: ");
                name = input.nextLine();
                for(index=0;index<salarieds.size();index++)
                {
                    salaried = salarieds.get(index);
                    if(salaried.getId() == id)
                    {
                        salaried.setName(name);
                        salarieds.remove(index);
                        salarieds.add(index,salaried);
                    }
                }
                break;  
            }
            else if(change_controll == 2)
            {
                System.out.println("Enter the new address: ");
                address = input.nextLine();
                for(index=0;index<salarieds.size();index++)
                {
                    salaried = salarieds.get(index);
                    if(salaried.getId() == id)
                    {
                        salaried.setAddress(address);
                        salarieds.remove(index);
                        salarieds.add(index,salaried);
                    }
                }
                break;
            }
            else if(change_controll == 3)
            {
                System.out.println("Enter the new payment method: ");
                System.out.println("    -> mail");
                System.out.println("    -> in hands");
                System.out.println("    -> bank acount");
                paymentmethod = input.nextLine();
                for(index=0;index<salarieds.size();index++)
                {
                    salaried = salarieds.get(index);
                    if(salaried.getId() == id)
                    {
                        salaried.setPaymentmethod(paymentmethod);
                        salarieds.remove(index);
                        salarieds.add(index,salaried);
                    }
                }
                break;
            }
            else if(change_controll == 4)
            {
                for(index=0;index<salarieds.size();index++)
                {
                    salaried = salarieds.get(index);
                    if(salaried.getId() == id)
                    {
                        if(salaried.getIs_sindicate() == 0)
                        {
                            salaried.setIs_sindicate(1);
                            salarieds.remove(index);
                            salarieds.add(index,salaried);
                        }
                        else
                        {
                            System.out.println("Employee is already part of the union!!");
                        }
                    }
                }
                break;
            }
            else if(change_controll == 5)
            {
                salaried = salarieds.get(index);
                if(salaried.getId() == id)
                {
                    if(salaried.getIs_sindicate() == 1)
                    {
                        salaried.setIs_sindicate(0);
                        salarieds.remove(index);
                        salarieds.add(index,salaried);
                    }
                    else
                    {
                        System.out.println("employee is already out of the the union!!");
                    }
                }
                break;
            }
            else if(change_controll == 6)
            {
                salaried = salarieds.get(index);
                if(salaried.getId() == id)
                {
                    if(salaried.getSindicate_id() != -1)
                    {
                        salaried.setSindicate_id(salaried.getSindicate_id()+7);
                        salarieds.remove(index);
                        salarieds.add(index,salaried);
                    }
                    else
                    {
                        System.out.println("employee is out of the the union!!");
                    }
                }
                break;
            }
            else if(change_controll == 7)
            {
                salaried = salarieds.get(index);
                if(salaried.getId() == id)
                {
                    if(salaried.getIs_sindicate() == 1)
                    {
                        System.out.printf("Enter the new union fee value: ");
                        union_fee = input.nextDouble();
                        input.nextLine();
                        salaried.setUnion_fee(union_fee);
                        salarieds.remove(index);
                        salarieds.add(index,salaried);
                    }
                    else
                    {
                        System.out.println("employee is out of the the union!!");
                    }
                }
                break;
            }
        }
    }
    public void change_Commissioned(ArrayList<Commissioned> commissioneds, int id)
    {
        while(true)
        {
            System.out.println("=== What do you want to change: ===");
            System.out.println("    (1) Name");
            System.out.println("    (2) Address");
            System.out.println("    (3) Payment method");
            System.out.println("    (4) Associate employee to union");
            System.out.println("    (5) Disassociate employee from the union");
            System.out.println("    (6) Union ID");
            System.out.println("    (7) Union fee value");
            do 
            {
                System.out.println("===  Enter a valid task  ===");
                change_controll = input.nextInt();
                System.out.println();
            }while(change_controll < 1 || change_controll > 7);
            input.nextLine();

            if(change_controll == 1)
            {
                System.out.println("Enter the new name: ");
                name = input.nextLine();
                for(index=0;index<commissioneds.size();index++)
                {
                    commissioned= commissioneds.get(index);
                    if(commissioned.getId() == id)
                    {
                        commissioned.setName(name);
                        commissioneds.remove(index);
                        commissioneds.add(index,commissioned);
                    }
                }
                break;  
            }
            else if(change_controll == 2)
            {
                System.out.println("Enter the new address: ");
                address = input.nextLine();
                for(index=0;index<commissioneds.size();index++)
                {
                    commissioned = commissioneds.get(index);
                    if(commissioned.getId() == id)
                    {
                        commissioned.setAddress(address);
                        commissioneds.remove(index);
                        commissioneds.add(index,commissioned);
                    }
                }
                break;
            }
            else if(change_controll == 3)
            {
                System.out.println("Enter the new payment method: ");
                System.out.println("    -> mail");
                System.out.println("    -> in hands");
                System.out.println("    -> bank acount");
                paymentmethod = input.nextLine();
                for(index=0;index<commissioneds.size();index++)
                {
                    commissioned = commissioneds.get(index);
                    if(commissioned.getId() == id)
                    {
                        commissioned.setPaymentmethod(paymentmethod);
                        commissioneds.remove(index);
                        commissioneds.add(index,commissioned);
                    }
                }
                break;
            }
            else if(change_controll == 4)
            {
                for(index=0;index<commissioneds.size();index++)
                {
                    commissioned = commissioneds.get(index);
                    if(commissioned.getId() == id)
                    {
                        if(commissioned.getIs_sindicate() == 0)
                        {
                            commissioned.setIs_sindicate(1);
                            commissioneds.remove(index);
                            commissioneds.add(index,commissioned);
                        }
                        else
                        {
                            System.out.println("Employee is already part of the union!!");
                        }
                    }
                }
                break;
            }
            else if(change_controll == 5)
            {
                commissioned = commissioneds.get(index);
                if(commissioned.getId() == id)
                {
                    if(commissioned.getIs_sindicate() == 1)
                    {
                        commissioned.setIs_sindicate(0);
                        commissioneds.remove(index);
                        commissioneds.add(index,commissioned);
                    }
                    else
                    {
                        System.out.println("employee is already out of the the union!!");
                    }
                }
                break;
            }
            else if(change_controll == 6)
            {
                commissioned = commissioneds.get(index);
                if(commissioned.getId() == id)
                {
                    if(commissioned.getSindicate_id() != -1)
                    {
                        commissioned.setSindicate_id(commissioned.getSindicate_id()+7);
                        commissioneds.remove(index);
                        commissioneds.add(index,commissioned);
                    }
                    else
                    {
                        System.out.println("employee is out of the the union!!");
                    }
                }
                break;
            }
            else if(change_controll == 7)
            {
                commissioned = commissioneds.get(index);
                if(commissioned.getId() == id)
                {
                    if(commissioned.getIs_sindicate() == 1)
                    {
                        System.out.printf("Enter the new union fee value: ");
                        union_fee = input.nextDouble();
                        input.nextLine();
                        commissioned.setUnion_fee(union_fee);
                        commissioneds.remove(index);
                        commissioneds.add(index,commissioned);
                    }
                    else
                    {
                        System.out.println("employee is out of the the union!!");
                    }
                }
                break;
            }
        }
    }
    public void change_Hourly(ArrayList<Hourly> hourlies, int id)
    {
        while(true)
        {
            System.out.println("=== What do you want to change: ===");
            System.out.println("    (1) Name");
            System.out.println("    (2) Address");
            System.out.println("    (3) Payment method");
            System.out.println("    (4) Associate employee to union");
            System.out.println("    (5) Disassociate employee from the union");
            System.out.println("    (6) Union ID");
            System.out.println("    (7) Union fee value");
            do 
            {
                System.out.println("===  Enter a valid task  ===");
                change_controll = input.nextInt();
                System.out.println();
            }while(change_controll < 1 || change_controll > 7);
            input.nextLine();

            if(change_controll == 1)
            {
                System.out.println("Enter the new name: ");
                name = input.nextLine();
                for(index=0;index<hourlies.size();index++)
                {
                    hourly = hourlies.get(index);
                    if(hourly.getId() == id)
                    {
                        hourly.setName(name);
                        hourlies.remove(index);
                        hourlies.add(index,hourly);
                    }
                }
                break;  
            }
            else if(change_controll == 2)
            {
                System.out.println("Enter the new address: ");
                address = input.nextLine();
                for(index=0;index<hourlies.size();index++)
                {
                    hourly = hourlies.get(index);
                    if(hourly.getId() == id)
                    {
                        hourly.setAddress(address);
                        hourlies.remove(index);
                        hourlies.add(index,hourly);
                    }
                }
                break;
            }
            else if(change_controll == 3)
            {
                System.out.println("Enter the new payment method: ");
                System.out.println("    -> mail");
                System.out.println("    -> in hands");
                System.out.println("    -> bank acount");
                paymentmethod = input.nextLine();
                for(index=0;index<hourlies.size();index++)
                {
                    hourly = hourlies.get(index);
                    if(hourly.getId() == id)
                    {
                        hourly.setPaymentmethod(paymentmethod);
                        hourlies.remove(index);
                        hourlies.add(index,hourly);
                    }
                }
                break;
            }
            else if(change_controll == 4)
            {
                for(index=0;index<hourlies.size();index++)
                {
                    hourly = hourlies.get(index);
                    if(hourly.getId() == id)
                    {
                        if(hourly.getIs_sindicate() == 0)
                        {
                            hourly.setIs_sindicate(1);
                            hourlies.remove(index);
                            hourlies.add(index,hourly);
                        }
                        else
                        {
                            System.out.println("Employee is already part of the union!!");
                        }
                    }
                }
                break;
            }
            else if(change_controll == 5)
            {
                hourly = hourlies.get(index);
                if(hourly.getId() == id)
                {
                    if(hourly.getIs_sindicate() == 1)
                    {
                        hourly.setIs_sindicate(0);
                        hourlies.remove(index);
                        hourlies.add(index,hourly);
                    }
                    else
                    {
                        System.out.println("employee is already out of the the union!!");
                    }
                }
                break;
            }
            else if(change_controll == 6)
            {
                hourly = hourlies.get(index);
                if(hourly.getId() == id)
                {
                    if(hourly.getSindicate_id() != -1)
                    {
                        hourly.setSindicate_id(salaried.getSindicate_id()+7);
                        hourlies.remove(index);
                        hourlies.add(index,hourly);
                    }
                    else
                    {
                        System.out.println("employee is out of the the union!!");
                    }
                }
                break;
            }
            else if(change_controll == 7)
            {
                hourly = hourlies.get(index);
                if(hourly.getId() == id)
                {
                    if(hourly.getIs_sindicate() == 1)
                    {
                        System.out.printf("Enter the new union fee value: ");
                        union_fee = input.nextDouble();
                        input.nextLine();
                        hourly.setUnion_fee(union_fee);
                        hourlies.remove(index);
                        hourlies.add(index,hourly);
                    }
                    else
                    {
                        System.out.println("employee is out of the the union!!");
                    }
                }
                break;
            }
        }
    }
    ///END CHANGE EMPLOYEE///
    ///ADD SERVICE FEE METHODS///
    public void add_service_Salaried(ArrayList<Salaried> salarieds, int id) 
    {
        System.out.printf("Enter the service fee value: ");
        service = input.nextDouble();
        input.nextLine();
        
        for(index = 0;index<salarieds.size();index++)
        {
            salaried = salarieds.get(index);
            if(salaried.getId() == id && salaried.getIs_sindicate() == 1)
            {
                salaried.setService(service);
                salarieds.remove(index);
                salarieds.add(index, salaried);
                finded = 1;
                break;
            }
        }
        if(finded == 1)
        {
            System.out.println("Successful service fee attribution!!");
            finded = 0;
        }
        else
        {
            System.out.println("Cant aply service fee to this employee!!");
        }
    }
    public void add_service_Comissioned(ArrayList<Commissioned> commissioneds, int id) 
    {
        System.out.printf("Enter the service fee value: ");
        service = input.nextDouble();
        input.nextLine();
        
        for(index = 0;index<commissioneds.size();index++)
        {
            commissioned = commissioneds.get(index);
            if(commissioned.getId() == id && commissioned.getIs_sindicate() == 1)
            {
                commissioned.setService(service);
                commissioneds.remove(index);
                commissioneds.add(index, commissioned);
                finded = 1;
                break;
            }
        }
        if(finded == 1)
        {
            System.out.println("Successful service fee attribution!!");
            finded = 0;
        }
        else
        {
            System.out.println("Cant aply service fee to this employee!!");
        }
    }
    public void add_service_Hourly(ArrayList<Hourly> hourlies, int id) 
    {
        System.out.printf("Enter the service fee value: ");
        service = input.nextDouble();
        input.nextLine();

        for(index = 0;index<hourlies.size();index++)
        {
            hourly = hourlies.get(index);
            if(hourly.getId() == id && hourly.getIs_sindicate() == 1)
            {
                hourly.setService(service);
                hourlies.remove(index);
                hourlies.add(index, hourly);
                finded = 1;
                break;
            }
        }
        if(finded == 1)
        {
            System.out.println("Successful service fee attribution!!");
            finded = 0;
        }
        else
        {
            System.out.println("Cant aply service fee to this employee!!");
        }
    }
    ///END SERVICE FEE METHODS///
    ///ADD SALE METHOD///
    public void add_sale(ArrayList<Commissioned> commissioneds, int id,int day) 
    {
        System.out.printf("Enter the sale value: ");
        sale_value = input.nextDouble();
        input.nextLine();

        for(index = 0;index<commissioneds.size();index++)
        {
            commissioned = commissioneds.get(index);
            if(commissioned.getId() == id)
            {   
                commissioned.setSales(sale_value, day);
                commissioneds.remove(index);
                commissioneds.add(index,commissioned);
                finded = 1;
                break;
            }
        }
        if(finded == 1)
        {
            System.out.println("Successful sale attribution!!");
            finded = 0;
        }
        else
        {
            System.out.println("Employee not found!!");
        }
    }
    ///END ADD SALE METHOD///
    ///ADD TIMECARD///
    public void add_timecard(ArrayList<Hourly> hourlies, int id, int day) 
    {
        System.out.println("==== What do you want? ====");
        System.out.println("    -> check in");
        System.out.println("    -> check out");
        System.out.printf("option: ");
        option = input.nextLine();
        
        if(option.equals("check in"))
        {
            System.out.println("==== check in ====");
            System.out.println("Enter the hours and minutes: ");
            System.out.printf("Hours: ");
            tc_in_h = input.nextInt();
            input.nextLine();
            System.out.printf("Minutes: ");
            tc_in_m = input.nextInt();
            input.nextLine();

            for(index=0;index<hourlies.size();index++)
            {
                hourly = hourlies.get(index);
                if(hourly.getId() == id)
                {
                    finded = 1;
                    if((hourly.getIn_hour(day) == 0) && (hourly.getOut_hour(day) == 0))
                    {
                        hourly.setTimecards_in((tc_in_h*60), tc_in_m, day);
                        hourlies.remove(index);
                        hourlies.add(index, hourly);
                        System.out.println("Successful check-in!!");
                        break;
                    }
                    else
                    {
                        System.out.println("Cannot check in!!");
                        break;
                    }   
                }
            }
            if(finded != 1)
            {
                System.out.println("Employee not found!!");
            }
            finded = 0;
        }
        else if(option.equals("check out"))
        {
            System.out.println("==== check out ====");
            System.out.println("Enter the hours and minutes: ");
            System.out.printf("Hours: ");
            tc_out_h = input.nextInt();
            input.nextLine();
            System.out.printf("Minutes: ");
            tc_out_m = input.nextInt(); 
            input.nextLine();
            for(index=0;index<hourlies.size();index++)
            {
                hourly = hourlies.get(index);
                if(hourly.getId() == id)
                {
                    finded = 1;
                    if((hourly.getOut_hour(day) == 0) && (hourly.getIn_hour(day) != 0))
                    {
                        hourly.setTimecards_out((tc_out_h*60), tc_out_m, day);
                        hourly.setWorkedours(((hourly.getOut_hour(day)+hourly.getOut_min(day))-(hourly.getIn_hour(day)+hourly.getIn_min(day))), day);
                        if(hourly.getWorkedours(day) > 480)
                        {
                            hourly.setExtra_hour((hourly.getWorkedours(day) - 480),day);
                            hourly.setWorkedours(((hourly.getOut_hour(day)+hourly.getOut_min(day))-(hourly.getIn_hour(day)+hourly.getIn_min(day))-hourly.getExtra_hour(day)), day);
                        }
                        hourlies.remove(index);
                        hourlies.add(index,hourly);
                        System.out.println("Successful check-out!!");
                        break;
                    }
                    else
                    {
                        System.out.println("Cannot check out!!");
                        break;
                    }
                }
            }
            if(finded != 1)
            {
                System.out.println("Employee not found!!");
            }
            finded = 0;
        }
        else
        {
            System.out.println("invalid opition!!");
        }   
    }
    ///END ADD TIMECARD///
}
