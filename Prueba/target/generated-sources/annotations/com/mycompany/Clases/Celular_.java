package com.mycompany.Clases;

import com.mycompany.Clases.Cliente;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-05T19:47:06", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Celular.class)
public class Celular_ { 

    public static volatile SingularAttribute<Celular, String> estado;
    public static volatile SingularAttribute<Celular, String> numero;
    public static volatile SingularAttribute<Celular, Integer> idCel;
    public static volatile SingularAttribute<Celular, Double> saldo;
    public static volatile SingularAttribute<Celular, Double> Megas;
    public static volatile SingularAttribute<Celular, Cliente> cedulaCliente;

}