/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author lanac
 */
@Entity
@Table(name = "departamento")
@NamedQueries({
    @NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d"),
    @NamedQuery(name = "Departamento.findByIdDep", query = "SELECT d FROM Departamento d WHERE d.idDep = :idDep"),
    @NamedQuery(name = "Departamento.findByNomeDep", query = "SELECT d FROM Departamento d WHERE d.nomeDep = :nomeDep"),
    @NamedQuery(name = "Departamento.findByTelefoneDep", query = "SELECT d FROM Departamento d WHERE d.telefoneDep = :telefoneDep")})
public class Departamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idDep")
    private String idDep;
    @Basic(optional = false)
    @Column(name = "nomeDep")
    private String nomeDep;
    @Column(name = "telefoneDep")
    private String telefoneDep;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDep", fetch = FetchType.EAGER)
    private List<Funcionario> funcionarioList;

    public Departamento() {
    }

    public Departamento(String idDep) {
        this.idDep = idDep;
    }

    public Departamento(String idDep, String nomeDep) {
        this.idDep = idDep;
        this.nomeDep = nomeDep;
    }

    public String getIdDep() {
        return idDep;
    }

    public void setIdDep(String idDep) {
        this.idDep = idDep;
    }

    public String getNomeDep() {
        return nomeDep;
    }

    public void setNomeDep(String nomeDep) {
        this.nomeDep = nomeDep;
    }

    public String getTelefoneDep() {
        return telefoneDep;
    }

    public void setTelefoneDep(String telefoneDep) {
        this.telefoneDep = telefoneDep;
    }

    public List<Funcionario> getFuncionarioList() {
        return funcionarioList;
    }

    public void setFuncionarioList(List<Funcionario> funcionarioList) {
        this.funcionarioList = funcionarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDep != null ? idDep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.idDep == null && other.idDep != null) || (this.idDep != null && !this.idDep.equals(other.idDep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Departamento_1[ idDep=" + idDep + " ]";
    }
    
}
