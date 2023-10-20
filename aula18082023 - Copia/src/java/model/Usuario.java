/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author lanac
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByEmailSenha", query = "SELECT u FROM Usuario u WHERE u.emailFun = :emailFun AND u.senhaUsu = :senhaUsu"),
    @NamedQuery(name = "Usuario.findByEmailFun", query = "SELECT u FROM Usuario u WHERE u.emailFun = :emailFun"),
    @NamedQuery(name = "Usuario.findBySenhaUsu", query = "SELECT u FROM Usuario u WHERE u.senhaUsu = :senhaUsu")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "emailFun")
    private String emailFun;
    @Basic(optional = false)
    @Column(name = "senhaUsu")
    private String senhaUsu;
    @JoinColumn(name = "emailFun", referencedColumnName = "emailFun", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Funcionario funcionario;

    public Usuario() {
    }

    public Usuario(String emailFun) {
        this.emailFun = emailFun;
    }

    public Usuario(String emailFun, String senhaUsu) {
        this.emailFun = emailFun;
        this.senhaUsu = senhaUsu;
    }

    public String getEmailFun() {
        return emailFun;
    }

    public void setEmailFun(String emailFun) {
        this.emailFun = emailFun;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.emailFun == null && other.emailFun != null) || (this.emailFun != null && !this.emailFun.equals(other.emailFun))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Usuario_1[ emailFun=" + emailFun + " ]";
    }
    
}
