/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author lanac
 */
@Entity
@Table(name = "funcionario")
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByEmailFun", query = "SELECT f FROM Funcionario f WHERE f.emailFun = :emailFun"),
    @NamedQuery(name = "Funcionario.findByNomeFun", query = "SELECT f FROM Funcionario f WHERE f.nomeFun = :nomeFun"),
    @NamedQuery(name = "Funcionario.findByTelefoneFun", query = "SELECT f FROM Funcionario f WHERE f.telefoneFun = :telefoneFun"),
    @NamedQuery(name = "Funcionario.findByCargoFun", query = "SELECT f FROM Funcionario f WHERE f.cargoFun = :cargoFun"),
    @NamedQuery(name = "Funcionario.findBySalarioFun", query = "SELECT f FROM Funcionario f WHERE f.salarioFun = :salarioFun")})
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "emailFun")
    private String emailFun;
    @Basic(optional = false)
    @Column(name = "nomeFun")
    private String nomeFun;
    @Column(name = "telefoneFun")
    private String telefoneFun;
    @Column(name = "cargoFun")
    private String cargoFun;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "salarioFun")
    private Double salarioFun;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "funcionario", fetch = FetchType.EAGER)
    private Usuario usuario;
    @JoinColumn(name = "idDep", referencedColumnName = "idDep")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Departamento idDep;

    public Funcionario() {
    }

    public Funcionario(String emailFun) {
        this.emailFun = emailFun;
    }

    public Funcionario(String emailFun, String nomeFun) {
        this.emailFun = emailFun;
        this.nomeFun = nomeFun;
    }

    public String getEmailFun() {
        return emailFun;
    }

    public void setEmailFun(String emailFun) {
        this.emailFun = emailFun;
    }

    public String getNomeFun() {
        return nomeFun;
    }

    public void setNomeFun(String nomeFun) {
        this.nomeFun = nomeFun;
    }

    public String getTelefoneFun() {
        return telefoneFun;
    }

    public void setTelefoneFun(String telefoneFun) {
        this.telefoneFun = telefoneFun;
    }

    public String getCargoFun() {
        return cargoFun;
    }

    public void setCargoFun(String cargoFun) {
        this.cargoFun = cargoFun;
    }

    public Double getSalarioFun() {
        return salarioFun;
    }

    public void setSalarioFun(Double salarioFun) {
        this.salarioFun = salarioFun;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Departamento getIdDep() {
        return idDep;
    }

    public void setIdDep(Departamento idDep) {
        this.idDep = idDep;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emailFun != null ? emailFun.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.emailFun == null && other.emailFun != null) || (this.emailFun != null && !this.emailFun.equals(other.emailFun))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Funcionario_1[ emailFun=" + emailFun + " ]";
    }
    
}
