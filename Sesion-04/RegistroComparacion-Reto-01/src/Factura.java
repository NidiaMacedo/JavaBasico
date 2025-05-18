//Reto 01: Registro y comparación de facturas
import java.util.Objects;
public class Factura {

    private String folio;
    private String cliente;
    private double total;

    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;

    }

    // Sobrescribimos equals() para comparar contenido
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otro = (Factura) obj;
        return this.folio.equals(otro.folio);
                //this.cliente.equals(otro.cliente) &&
                //this.total == otro.total;
    }

    // hashCode() compatible con equals()
    @Override
    public int hashCode() {
        return Objects.hash(folio, cliente, total);
    }

    // toString() para mostrar la información
    @Override
    public String toString() {
        return "🎫 Factura[" +
                "folio='" + folio + '\'' +
                ", cliente='" + cliente + '\'' +
                ", total = $" + total +']';
    }
}
