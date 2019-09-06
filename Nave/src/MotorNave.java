public class MotorNave {
    private int potencia;
    private int durabilidade;
    boolean funcionando;

    public MotorNave(int potencia,int durabilidade){
        this.potencia = potencia;
        this.durabilidade = durabilidade;

    }
    public MotorNave(int potencia){
        this.potencia = potencia;
        this.durabilidade = 5;
        funcionando = true;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = this.potencia += potencia;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = this.durabilidade -= durabilidade;
    }

    public boolean isFuncionando() {
        return funcionando;
    }

    void testarMotor(){
        if (durabilidade <= 0){
            funcionando = false;
        }else {
            funcionando = true;
        }
    }



}
