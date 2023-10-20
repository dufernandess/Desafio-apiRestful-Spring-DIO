package api.project.projectdioapi.model;

import jakarta.persistence.*;

import java.util.List;
@Entity(name = "tb_suplier")
public class Suplier{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String document;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ServicesProvided> servicesProvided;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ServicesProvided> getServicesProvided() {
        return servicesProvided;
    }

    public void setServicesProvided(List<ServicesProvided> servicesProvided) {
        this.servicesProvided = servicesProvided;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
