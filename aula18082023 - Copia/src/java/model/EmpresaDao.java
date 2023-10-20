/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;
import javax.persistence.TypedQuery;

public class EmpresaDao {

    private EntityManager manager;
    
    
      //Conectando com o banco de dados
    private void conectar() {
        manager = Persistence.createEntityManagerFactory("aula18082023PU").createEntityManager();
    }

    
        //Validando o Login
    public Usuario validarLogin(String u, String s) {
        conectar();
        try {
            TypedQuery<Usuario> query = manager.createNamedQuery("Usuario.findByEmailSenha", Usuario.class);
            query.setParameter("emailFun", u);
            query.setParameter("senhaUsu", s);
            return query.getSingleResult();
        } catch (NoResultException x) {
            return null;
        }
    }

     //Salvando no banco de dados
    public <T> int salvar(T obj) {
        conectar();
        try {
            manager.getTransaction().begin();
            manager.persist(obj);
            manager.getTransaction().commit();
            return 1;
        } catch (RollbackException erro) { // duplicação de PK   
            return 2;
        } catch (Exception erro) {
            return 0;
        }
    }

    
     //Mostrar os departamentos listados
    public List listarDepartamentos() {
        conectar();
        try {
            return manager.createNamedQuery("Departamento.findAll", Departamento.class).getResultList();
        } catch (NoResultException erro) {
            return null;
        }
    }

}
