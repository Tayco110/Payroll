package functionalities;

import employee.Salaried;
import employee.Commissioned;
import employee.Hourly;
import java.util.Scanner;
import java.util.ArrayList;

public class Employee_Functionalities
{
    private String name,address,paymentmethod,sindicate_controll,option;
    private int is_sindicate = 0,sindicate_id = -1,finded = 0,index,change_controll,tc_in_h,tc_in_m,tc_out_h,tc_out_m;
    private double union_fee = 0,salary,commission,salaryperhour,service,sale_value;

    private Salaried salaried;
    private Commissioned commissioned;
    private Hourly hourly;
    
    private Scanner input = new Scanner(System.in);

    public Employee_Functionalities()
    {

    }

    //// REGISTER EMPLOYEE METHODS///////
    public Salaried register_Salaried(int id) 
    {
        System.out.printf("Enter the employer's name: ");
        name = input.nextLine();
        System.out.printf("Enter the employer's address: ");
        address = input.nextLine();
        System.out.println("Enter the employer's payment method: ");
        System.out.println("    (1) - mail");
        System.out.println("    (2) - in hands");
        System.out.println("    (3) - bank acount");
        System.out.printf("Payment method: ");
        paymentmethod = input.nextLine();
        System.out.printf("Enter the employer's FIXED VALUE of salary: ");
        salary = input.nextDouble();
        input.nextLine();
        System.out.println("Will the employee be part of the union?");
        System.out.println("    (1) - yes");
        System.out.println("    (2) - no");
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
            sindicate_id = -1;
            is_sindicate = 0;
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
        System.out.println("    (1) - mail");
        System.out.println("    (2) - in hands");
        System.out.println("    (3) - bank acount");
        System.out.printf("Payment method: ");
        paymentmethod = input.nextLine();
        System.out.printf("Enter the employer's FIXED VALUE of salary: ");
        salary = input.nextDouble();
        System.out.printf("Enter the employer's commission: ");
        commission = input.nextDouble();
        input.nextLine();
        System.out.println("Will the employee be part of the union?");
        System.out.println("    (1) - yes");
        System.out.println("    (2) - no");
        sindicate_controll = input.nextLine();
        if(sindicate_controll.equals("yes"))
        {
            is_sindicate = 1;
            sindicate_id = (id+24);
            System.out.println("Informe a taxa mensal do sindicato: ");
            union_fee = input.nextDouble();
            input.nextLine();
        }
        else
        {
            sindicate_id = -1;
            is_sindicate = 0;
            union_fee = 0;
        }
        commissioned = new Commissioned(name,address,"Comissionado",paymentmethod,"weekly friday",id,sindicate_id,is_sindicate,union_fee,salary,commission);
        return commissioned;
    }
    public Hourly register_Hourly(int id) 
    {
        System.out.printf("Enter the employer's name: ");
        name = input.nextLine();
        System.out.printf("Enter the employer's address: ");
        address = input.nextLine();
        System.out.println("Enter the employer's payment method: ");
        System.out.println("    (1) - mail");
        System.out.println("    (2) - in hands");
        System.out.println("    (3) - bank acount");
        System.out.printf("Payment method: ");
        paymentmethod = input.nextLine();
        System.out.println("Enter the employer's SALARY PER HOUR: ");
        salaryperhour = input.nextDouble();
        input.nextLine();
        System.out.println("Will the employee be part of the union?");
        System.out.println("    (1) - yes");
        System.out.println("    (2) - no");
        sindicate_controll = input.nextLine();
        if(sindicate_controll.equals("yes"))
        {
            is_sindicate = 1;
            sindicate_id = (id+24);
            System.out.println("Informe a taxa mensal do sindicato: ");
            union_fee = input.nextDouble();
            input.nextLine();
        }
        else
        {
            sindicate_id = -1;
            is_sindicate = 0;
            union_fee = 0;
        }
        hourly = new Hourly(name, address,"Horistas",paymentmethod,"biweekly friday",id,sindicate_id,is_sindicate, union_fee, salaryperhour);
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

    ///EMPLOYEE CHANGE METHODS///
    public void change_Salaried(ArrayList<Salaried> salarieds,ArrayList<Commissioned> commissioneds,ArrayList<Hourly> hourlies, int id) 
    {
        while(true)
        {
            System.out.println("=== Informe qual atributo modificar: ===");
            System.out.println("    (1) - Nome do Empregado");
            System.out.println("    (2) - Endereço do Empregado");
            System.out.println("    (3) - Método de pagamento do Empregado");
            System.out.println("    (4) - Associar Empregado ao sindicato");
            System.out.println("    (5) - Desassociar Empregado do sindicato");
            System.out.println("    (6) - ID do sindicato");
            System.out.println("    (7) - Taxa do sindicato");
            System.out.println("    (8) - Tipo de Empregado");
            do 
            {
                System.out.println("===  Escolha uma tarefa válida  ===");
                change_controll = input.nextInt();
                System.out.println();
            }while(change_controll < 1 || change_controll > 8);
            input.nextLine();

            if(change_controll == 1)
            {
                System.out.println("Informe o novo nome: ");
                name = input.nextLine();
                for(index=0;index<salarieds.size();index++)
                {
                    salaried = salarieds.get(index);
                    if(salaried.getId() == id)
                    {
                        salaried.setName(name);
                        salarieds.add(index,salaried);
                    }
                }
                break;
            }
            else if(change_controll == 2)
            {
                System.out.println("Informe o novo endereço: ");
                address = input.nextLine();
                for(index=0;index<salarieds.size();index++)
                {
                    salaried = salarieds.get(index);
                    if(salaried.getId() == id)
                    {
                        salaried.setAddress(address);
                        salarieds.add(index,salaried);
                    }
                }
                break;
            }
            else if(change_controll == 3)
            {
                System.out.println("Informe o novo método de pagamento: ");
                paymentmethod = input.nextLine();
                for(index=0;index<salarieds.size();index++)
                {
                    salaried = salarieds.get(index);
                    if(salaried.getId() == id)
                    {
                        salaried.setPaymentmethod(paymentmethod);
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
                            salarieds.add(index,salaried);
                        }
                        else
                        {
                            System.out.println("Empregado já se encontra associado!!");
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
                        salarieds.add(index,salaried);
                    }
                    else
                    {
                        System.out.println("Emrpegado já se encontra desassociado!!");
                    }
                }
                break;
            }
            else if(change_controll == 8)
            {
                System.out.println("Informe o novo tipo: ");
                //type = input.nextLine();

                break;
            }
        }
        
    }
    public void change_Commissioned(ArrayList<Salaried> salarieds,ArrayList<Commissioned> commissioneds,ArrayList<Hourly> hourlies, int id) 
    {
        while(true)
        {
            System.out.println("=== Informe qual atributo modificar: ===");
            System.out.println("    (1) - Nome do Empregado");
            System.out.println("    (2) - Endereço do Empregado");
            System.out.println("    (3) - Método de pagamento do Empregado");
            System.out.println("    (4) - Associar Empregado ao sindicato");
            System.out.println("    (5) - Desassociar Empregado do sindicato");
            System.out.println("    (6) - Tipo de Empregado");
            do 
            {
                System.out.println("===  Escolha uma tarefa válida  ===");
                change_controll = input.nextInt();
                System.out.println();
            }while(change_controll < 1 || change_controll > 6);
            input.nextLine();

            if(change_controll == 1)
            {
                break;
            }
            else if(change_controll == 2)
            {
                break;
            }
            else if(change_controll == 3)
            {
                break;
            }
            else if(change_controll == 4)
            {
                break;
            }
            else if(change_controll == 5)
            {
                break;
            }
            else if(change_controll == 6)
            {
                break;
            }
        }
        
    }
    public void change_Hourly(ArrayList<Salaried> salarieds,ArrayList<Commissioned> commissioneds,ArrayList<Hourly> hourlies, int id) 
    {
        while(true)
        {
            System.out.println("=== Informe qual atributo modificar: ===");
            System.out.println("    (1) - Nome do Empregado");
            System.out.println("    (2) - Endereço do Empregado");
            System.out.println("    (3) - Método de pagamento do Empregado");
            System.out.println("    (4) - Associar Empregado ao sindicato");
            System.out.println("    (5) - Desassociar Empregado do sindicato");
            System.out.println("    (6) - Tipo de Empregado");
            do 
            {
                System.out.println("===  Escolha uma tarefa válida  ===");
                change_controll = input.nextInt();
                System.out.println();
            }while(change_controll < 1 || change_controll > 6);
            input.nextLine();

            if(change_controll == 1)
            {
                break;
            }
            else if(change_controll == 2)
            {
                break;
            }
            else if(change_controll == 3)
            {
                break;
            }
            else if(change_controll == 4)
            {
                break;
            }
            else if(change_controll == 5)
            {
                break;
            }
            else if(change_controll == 6)
            {
                break;
            }
        }        
    }
    ///END EMPLOYEE CHANGE METROHDS///

    ///ADD SERVICE FEE METHODS///
    public void add_service_Salaried(ArrayList<Salaried> salarieds, int id) 
    {
        System.out.printf("Enter the service fee value: ");
        service = input.nextDouble();
        input.nextLine();
        
        for(index = 0;index<salarieds.size();index++)
        {
            salaried = salarieds.get(index);
            if(salaried.getId() == id)
            {
                salaried.setService(service);
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
            System.out.println("Employee not found!!");
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
            if(commissioned.getId() == id)
            {
                commissioned.setService(service);
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
            System.out.println("Employee not found!!");
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
            if(hourly.getId() == id)
            {
                hourly.setService(service);
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
            System.out.println("Employee not found!!");
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
        System.out.println("    (1) - check in");
        System.out.println("    (2) - check out");
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
