//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BalancoMensal {
    public static void main(String[] args) {
        int gastosJaneiro = 1500;
        int gastosFevereiro= 1500;
        int gastosMarco = 1500;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro +gastosMarco;
        float mediaMensal = (float) gastosTrimestre /3;

        System.out.println(gastosTrimestre);

        System.out.println("Valor da média mensal =" + mediaMensal);
    }
}