package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Departamento;
import model.Usuario;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-10-19T22:14:26")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, String> nomeFun;
    public static volatile SingularAttribute<Funcionario, Double> salarioFun;
    public static volatile SingularAttribute<Funcionario, Departamento> idDep;
    public static volatile SingularAttribute<Funcionario, String> telefoneFun;
    public static volatile SingularAttribute<Funcionario, Usuario> usuario;
    public static volatile SingularAttribute<Funcionario, String> cargoFun;
    public static volatile SingularAttribute<Funcionario, String> emailFun;

}