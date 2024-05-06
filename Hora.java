import java.util.Scanner;

public class Hora {
    private int hora;
    private int min;
    private int seg;

    public Hora() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a hora:");
        int h = input.nextInt();
        setHor(h);

        System.out.println("Digite os minutos:");
        int m = input.nextInt();
        setMin(m);

        System.out.println("Digite os segundos:");
        int s = input.nextInt();
        setSeg(s);

        input.close();
    }

    public Hora(int h, int m, int s) {
        setHor(h);
        setMin(m);
        setSeg(s);
    }

    public void setHor(int h) {
        if (h >= 0 && h <= 23) {
            hora = h;
        } else {
            System.out.println("Hora inválida. Digite novamente.");
            setHor();
        }
    }

    public void setMin(int m) {
        if (m >= 0 && m <= 59) {
            min = m;
        } else {
            System.out.println("Minuto inválido. Digite novamente.");
            setMin();
        }
    }

    public void setSeg(int s) {
        if (s >= 0 && s <= 59) {
            seg = s;
        } else {
            System.out.println("Segundo inválido. Digite novamente.");
            setSeg();
        }
    }

    public void setHor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a hora:");
        int h = input.nextInt();
        setHor(h);

        input.close();
    }

    public void setMin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os minutos:");
        int m = input.nextInt();
        setMin(m);

        input.close();
    }

    public void setSeg() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os segundos:");
        int s = input.nextInt();
        setSeg(s);

        input.close();
    }

    public int getHor() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public String getHora1() {
        return String.format("%02d:%02d:%02d", hora, min, seg);
    }

    public String getHora2() {
        String periodo = (hora < 12) ? "AM" : "PM";
        int horaFormato12 = (hora > 12) ? hora - 12 : hora;
        return String.format("%02d:%02d:%02d %s", horaFormato12, min, seg, periodo);
    }

    public int getSegundos() {
        return hora * 3600 + min * 60 + seg;
    }

    public static void main(String[] args) {
        Hora hora1 = new Hora();
        System.out.println("Hora 1: " + hora1.getHora1());
        System.out.println("Hora 2: " + hora1.getHora2());
        System.out.println("Segundos em Hora 1: " + hora1.getSegundos());
    }
}