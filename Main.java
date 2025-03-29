public class Main {
    public static void main(String[] args) {

        ClinicoGeral clinicoGeral = new ClinicoGeral();
        clinicoGeral.trabalhaNoHospital = true;
        clinicoGeral.atendeEmCasa = true;

        clinicoGeral.tratarPaciente();
        clinicoGeral.receitar();

        System.out.println();


        Cirurgiao cirurgiao = new Cirurgiao();
        cirurgiao.trabalhaNoHospital = true;

        cirurgiao.tratarPaciente();
        cirurgiao.fazerIncisao();
    }
}
