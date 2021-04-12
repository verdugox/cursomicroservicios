package clients.clients.products.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name ="client")
public class Client implements Serializable{
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      private String nombrecompleto;
      private Long dni;
      @Column(name = "create_at")
      @Temporal(TemporalType.DATE)
      private Date createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
