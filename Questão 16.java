/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

private int horas, minutos,segundos;

public Questão 16(int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;


public int getHoras() {
    return horas;
}

public void setHoras(int horas) {
    if ((horas > 0) && (horas <= 23)) {
        this.horas = horas;
    }
}

public int getMinutos() {
    return minutos;
}

public void setMinutos(int minutos) {
    if ((minutos >= 0 && (minutos <= 60))) {
        this.minutos = minutos;
    }
}

public int getSegundos() {
    return segundos;
}

public void setSegundos(int segundos) {
    if ((segundos >= 0) && (segundos <= 60)) {
        this.segundos = segundos;

    }

    }

public int ler () {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite a hora para saber quanto equivale em segundos \n");

    int tempo=leitor.nextInt();


    setHoras(Horas(time));
    setMinutos(Minutos(time));
    setSegundos(segundos());



}


 //Criando metodos


public int segundos(int time) {

    return  (tempo - (getHoras() * 3600) - (getMinutos() * 60));

}

private int Minutos(int time){
    return  (tempo -(getHoras()*3600))/60;
}

private  int Horas (int time){
    return  tempo/3600;
}

public  void imprimirHoras() {

    System.out.println("Horas:"+getMinutos()+ ","+getMinutos()+","+getSegundos());
}

public static void main(String[] args) {
    int horas= Horas();
    int minutos=Minutos();
    int segundos=segundos();

    System.out.println();
}
