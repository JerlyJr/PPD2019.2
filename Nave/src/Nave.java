public class Nave {
    String nave;
    int passageiros;
    MotorNave motor;

    public Nave(String nave, int passageiros,int potencia){
        this.nave = nave;
        this.passageiros = passageiros;
        motor = new MotorNave(potencia);
    }
    void novoMotor(int potencia,int durabilidade){
        motor = new MotorNave(potencia,durabilidade);
    }
    void adicionarPotencia(){
        motor.setPotencia(100);
    }
    void reduzirPotencia(){
        motor.setPotencia(-100);
    }
    void acelerar(){
        if (motor.funcionando == true){
            if (passageiros >=1){
                System.out.println("ZOOOOOOOOOOOOm");
                motor.setDurabilidade(-1);
                motor.testarMotor();
            }else{
                System.out.println("Não há passageiros");
            }
        }else{
            System.out.println("motor quebrado");
        }
        }void addPassageiros(int valor){
        if (passageiros < 4){
            this.passageiros = valor;
        }else {
            System.out.println("Não há´vagas o suficente");
        }
    }

}
