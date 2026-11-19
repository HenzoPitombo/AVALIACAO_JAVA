void main() {

    int tempo1 = Integer.parseInt(IO.readln("Quanto tempo você aguardou na fila, cliente 1? "));
   
    if (tempo1 < 0)
    System.out.println ("Leitura interrompida, desconsidere quaisquer resultados.");


  int tempo2 = Integer.parseInt(IO.readln("Quanto tempo você aguardou na fila, cliente 2? "));

    if (tempo2 < 0)
        System.out.println ("Leitura interrompida, desconsidere quaisquer resultados.");

    int tempo3 = Integer.parseInt(IO.readln("Quanto tempo você aguardou na fila, cliente 3? "));

if (tempo3 < 0)
    System.out.println ("Leitura interrompida, desconsidere quaisquer resultados.");



 int media = (tempo1 + tempo2 + tempo3) /3;

    if (media < 0)
        System.out.println("Leitura interrompida.");
        
   else if (media >= 0 && media <= 10)
    System.out.println("Atendimento Ágil.");

   else if (media >= 10 && media <= 20)
    System.out.println("Atendimento Regular.");

   else if (media > 20)
    System.out.println("Atendimento lento: Reforçar a Equipe.");
    }