
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela BENEFICIARIO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"BENEFICIARIO\"")
@XmlRootElement
@CronappSecurity
@CronappSwagger
@JsonFilter("app.entity.Beneficiario")
@EntityListeners({cronapi.database.HistoryListener.class})
public class Beneficiario implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "Nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * @generated
    */
    @Column(name = "Sobrenome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String sobrenome;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "DataNascimento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataNascimento;


    /**
    * Construtor
    * @generated
    */
    public Beneficiario(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Beneficiario setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    public java.lang.String getNome() {
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Beneficiario setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém sobrenome
    * return sobrenome
    * @generated
    */
    public java.lang.String getSobrenome() {
        return this.sobrenome;
    }

    /**
    * Define sobrenome
    * @param sobrenome sobrenome
    * @generated
    */
    public Beneficiario setSobrenome(java.lang.String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }
    /**
    * Obtém dataNascimento
    * return dataNascimento
    * @generated
    */
    public java.util.Date getDataNascimento() {
        return this.dataNascimento;
    }

    /**
    * Define dataNascimento
    * @param dataNascimento dataNascimento
    * @generated
    */
    public Beneficiario setDataNascimento(java.util.Date dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Beneficiario object = (Beneficiario)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}