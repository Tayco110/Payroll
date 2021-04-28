import employee.Salaried;
import employee.Commissioned;
import employee.Hourly;
import java.util.ArrayList;
import java.util.Scanner;
import schedule.Schedule;
import schedule.day.Day;
import functionalities.Employee_Functionalities;
import functionalities.Shedule_Functionalities;

public class Main 
{
    public static void main(String[] args) 
    {
        int controll,index,index2;
        int idnumber = 0,id_controll,day = 1,month = 1;
        String employeetype,merda;

        Day day3;
        
        Scanner input = new Scanner(System.in);
        ArrayList<Salaried> salaried = new ArrayList<>();
        ArrayList<Commissioned> commissioned = new ArrayList<>();
        ArrayList<Hourly> hourly = new ArrayList<>();
        Schedule schedule = new Schedule();

        Employee_Functionalities functionalities = new Employee_Functionalities();
        Shedule_Functionalities shedule_Functionalities = new Shedule_Functionalities();


        do
        {
            System.out.println("**********************************************************************");
            System.out.println("                     GERENCIAR FOLHA DE PAGAMENTO                     ");
            System.out.println("**********************************************************************");
            System.out.println("[1] - Adicionar um empregado");
            System.out.println("[2] - Remover um empregado");
            System.out.println("[3] - Lançar um cartão de ponto");
            System.out.println("[4] - Lançar um resultado de venda");
            System.out.println("[5] - Lançar uma taxa de serviço");
            System.out.println("[6] - Alterar detalhes de um empregado");
            System.out.println("[7] - Rodar a folha de pagamento para HOJE");
            System.out.println("[8] - Desfazer ultima tarefa feita");
            System.out.println("[9] - Refazer ultima tarefa desfeita");
            System.out.println("[10] - Agendar um pagamento");
            System.out.println("[11] - Criar nova agenda de pagamentos");
            System.out.println("[12] - ENCERRAR");
            do
            {
                System.out.println("Escolha uma Tarefa válida: ");
                controll = input.nextInt();
                System.out.println();
            }while(controll < 1 || controll > 12);
            input.nextLine();

            if(controll == 1)
            {
                System.out.println("**********************************************************************");
                System.out.println("                    Adicionar Empregado ao sistema                    ");
                System.out.println("**********************************************************************");
                System.out.println("Digite o Tipo de Empregado:");
                employeetype = input.nextLine();
                if(employeetype.equals("Assalariado"))
                {
                    salaried.add(functionalities.register_Salaried(idnumber));
                    idnumber++;
                }
                else if(employeetype.equals("Comissionado"))
                {   
                    commissioned.add(functionalities.register_Commissioned(idnumber));
                    idnumber++;
                }
                else if(employeetype.equals("Horista"))
                {
                    hourly.add(functionalities.register_Hourly(idnumber));
                    idnumber++;
                }
                System.out.println("Empregado "+employeetype+" Adicionaddo ao sistema!!");
            }
            else if(controll == 2)
            {
                System.out.println("**********************************************************************");
                System.out.println("                     Remover Empregado do sistema                     ");
                System.out.println("**********************************************************************");
                System.out.println("Informe o tipo de empregado que será removido: ");
                employeetype = input.next();
                System.out.println("Informe o id do empregado que será removido: ");
                id_controll = input.nextInt();
                input.nextLine();

                if(employeetype.equals("Assalariado"))
                {
                    functionalities.remove_Salaried(salaried,id_controll);
                }
                else if(employeetype.equals("Comissionado"))
                {
                    functionalities.remove_Commissioned(commissioned,id_controll);
                }
                else if(employeetype.equals("Horista"))
                {
                    functionalities.remove_Houly(hourly,id_controll);
                }
            }
            else if(controll == 3)
            {
                System.out.println("**********************************************************************");
                System.out.println("                         Lançar cartão de ponto                       ");
                System.out.println("**********************************************************************");
                System.out.println("Informe o tipo de empregado: ");
                employeetype = input.nextLine();
                
                if(employeetype.equals("Horista"))
                {
                    System.out.println("Informe o id do empregado: ");
                    id_controll = input.nextInt();
                    input.nextLine();
                    functionalities.add_timecard(hourly, id_controll, day);
                }
                else
                {
                    System.out.println("O tipo de empregado não é válido!!");
                }
            }
            else if(controll == 4)
            {
                System.out.println("**********************************************************************");
                System.out.println("                        Lançar resultado de venda                     ");
                System.out.println("**********************************************************************");
                System.out.println("Informe o tipo de empregado: ");
                employeetype = input.nextLine();
                
                if(employeetype.equals("Comissionado"))
                {
                    System.out.println("Informe o id do empregado: ");
                    id_controll = input.nextInt();
                    input.nextLine();
                    functionalities.add_sale(commissioned, id_controll,day);
                }
                else
                {
                    System.out.println("O tipo de empregado não é válido!!");
                }
            }
            else if(controll == 5)
            {
                System.out.println("**********************************************************************");
                System.out.println("                         Lançar taxa de serviço                       ");
                System.out.println("**********************************************************************");
                System.out.println("Informe o tipo de empregado: ");
                employeetype = input.nextLine();
                System.out.println("Informe o id do empregado: ");
                id_controll = input.nextInt();
                input.nextLine();
                
                if(employeetype.equals("Assalariado"))
                {
                    functionalities.add_service_Salaried(salaried,id_controll);
                }
                else if(employeetype.equals("Comissionado"))
                {
                    functionalities.add_service_Comissioned(commissioned,id_controll);
                }
                else if(employeetype.equals("Horistas"))
                {
                    functionalities.add_service_Hourly(hourly,id_controll);
                }    
            }
            else if(controll == 6)
            {
                System.out.println("**********************************************************************");
                System.out.println("                     Alterar detalhes de um Empregado                 ");
                System.out.println("**********************************************************************");
                System.out.println("Informe o Tipo de empregado que terá os dados modificados: ");
                employeetype = input.next();
                System.out.println("Informe o id do empregado que terá os dados modificados:");
                id_controll = input.nextInt();
                input.nextLine();

                if(employeetype.equals("Assalariado"))
                {
                    functionalities.change_Salaried(salaried,commissioned,hourly,id_controll);
                }
                else if(employeetype.equals("Comissionado"))
                {
                    functionalities.change_Commissioned(salaried,commissioned,hourly,id_controll);
                }
                else if(employeetype.equals("Horistas"))
                {
                    functionalities.change_Hourly(salaried,commissioned,hourly,id_controll);
                }
            }
            else if(controll == 7)
            {
            
            }
            else if(controll == 8)
            {
                System.out.println("Funcionalidade não disponível");
            }
            else if(controll == 9)
            {
                System.out.println("Funcionalidade não disponível");
            }
            else if(controll == 10)
            {
                
            }
            else if(controll == 11)
            {
                shedule_Functionalities.create_schedule(schedule,"monthly","monday");

                for(index=1;index<=31;index++)
                {
                    day3 = schedule.March[index-1];

                    for(index2=0;index2<day3.schedules_of_the_day.size();index2++)
                    {
                        merda = day3.schedules_of_the_day.get(index2);
                        System.out.println(merda);
                        System.out.println(index);
                    }
                }
            }
            System.out.println(); 
        
        }while(controll != 12);
    }
    
}
