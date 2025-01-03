package br.com.zedacarga.zedacarga_api.util.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;

@SuppressWarnings("serial")
@Getter
@Setter
@MappedSuperclass
public abstract class EntidadeAuditavel extends EntidadeNegocio {

    @JsonIgnore
    @Version
    private Long versao;

    @JsonIgnore
    @CreatedDate
    private LocalDate dataCriacao;

    @JsonIgnore
    @LastModifiedDate
    private LocalDate dataUltimaModificacao;

    @JsonIgnore
    @Column
    private Long criadoPor; // Id do usuário que o criou
    
    @JsonIgnore
    @Column
    private Long ultimaModificacaoPor; // Id do usuário que fez a última alteração
}
