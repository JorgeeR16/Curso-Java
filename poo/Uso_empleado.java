import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_empleado {

    public static void main(String[] args) {

        Jefatura jefeRRHH = new Jefatura("Marina", 4500, 2010, 5, 1);
        jefeRRHH.estableceIncentivo(2570);
        Empleado[] misEmpleados = new Empleado[4];
        misEmpleados[0] = new Empleado("Jorge", 3000, 2000, 1, 10);
        misEmpleados[1] = new Empleado("Andres");
        misEmpleados[2] = jefeRRHH;
        misEmpleados[3] = new Jefatura("Carlos", 2, 2011, 1, 5);
        Jefatura jefeFinanzas = (Jefatura) misEmpleados[3];
        jefeFinanzas.estableceIncentivo(2510000);
        System.out.println(jefeFinanzas.tomar_decisiones("dar mas dias de vacaciones a los empleados"));
        
        
        System.out.println("El jefe "+ jefeFinanzas.dameNombre() +" tiene un bonus de: " + jefeFinanzas.establece_bonus(500) );

        Arrays.sort(misEmpleados);
        
        for (Empleado empleado : misEmpleados) {
            System.out.println("Nombre: " + empleado.dameNombre()
                    + " Sueldo: " + empleado.dameSueldo()
                    + " Fecha de alta: " + empleado.dameFechaContrato());
        }
    }
}

class Empleado implements  Trabajadores{//Comparable,
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int year;
    private int month;
    private int day;

    private static int IdSiguiente;
    private int Id;

    public int getId() {
        return Id;
    }

    public Empleado(String nombre, double sueldo, int year, int month, int day) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(year, month - 1, day);
        altaContrato = calendario.getTime();
        ++IdSiguiente;
        Id = IdSiguiente;
    }

    public Empleado(String nom) {
        this(nom, 3000, 2000, 01, 01);
    }

    public String dameNombre() {
        return nombre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double dameSueldo() {
        return sueldo;
    }

    public Date dameFechaContrato() {
        return altaContrato;
    }

    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo = +aumento;
    }

    public int compareTo(Object miObject) {
        Empleado otrEmpleado = (Empleado) miObject;
        if (this.sueldo < otrEmpleado.sueldo) {
            return -1;
        }
        if (this.sueldo > otrEmpleado.sueldo) {
            return 1;
        }
        return 0;
    }

    public double establece_bonus(double gratificacion){
    
        return Trabajadores.bonus_base + gratificacion;
    }

}

class Jefatura extends Empleado implements Jefes{

    private double incentivo;

    public Jefatura(String nombre, double sueldo, int year, int month, int day) {
        super(nombre, sueldo, year, month, day);
    }

    public void estableceIncentivo(double b) {
        incentivo = b;
    }

    public double dameSueldo() {
        double sueldoJefe = super.dameSueldo();
        return sueldoJefe + incentivo;
    }

    public String tomar_decisiones(String decision){
        return "Un miembro de la direccion ha tomado la decision: "+decision;
    }

    public double establece_bonus(double gratificacion){
        double prima = 2000;
        return Trabajadores.bonus_base + gratificacion + prima;
    }
}
