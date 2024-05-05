import javax.swing.*;

public class Vehiculo {
    String nMotor;
    int nVentanas;
    int nPuertas;
    String marca;
    String modelo;
    float kmInicial;
    float kmFinal;
    float kmReco;

    public Vehiculo(){
        ingresoInformacion();
        kmRecorridos();
        imprimirInformacion();
    }
    public void ingresoInformacion(){
        JOptionPane.showMessageDialog(null, "Ingrese la información de su vehiculo");
        nMotor = JOptionPane.showInputDialog("Ingrese el numero de motor: ");
        nVentanas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventanas: "));
        nPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas: "));
        marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo: ");
        modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo: ");
        kmInicial = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el kilometraje inicial: "));
        kmFinal = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el kilometraje final"));
    }
    public void kmRecorridos(){
        this.kmReco = this.kmFinal - this.kmInicial;

    }
    public void imprimirInformacion(){
        JOptionPane.showMessageDialog(null, "Informacion del vehiculo");
        JOptionPane.showMessageDialog(null, "Numero de motor: "+nMotor);
        JOptionPane.showMessageDialog(null, "Numero de ventanas: "+nVentanas);
        JOptionPane.showMessageDialog(null, "Numero de puertas: "+nPuertas);
        JOptionPane.showMessageDialog(null, "Marca: "+marca);
        JOptionPane.showMessageDialog(null, "Modelo: "+modelo);
        JOptionPane.showMessageDialog(null, "Kilometros Recorridos: "+this.kmReco);

    }
}
