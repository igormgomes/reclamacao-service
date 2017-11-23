package br.com.reclamacao.service.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;


@ApiModel(value = "Dados referente a reclamação")
public class ReclamacaoRequest {

    @NotEmpty(message = "Titulo deve estar preenchido")
    @ApiModelProperty(value = "Titulo da reclamação", required = true, dataType = "String")
    private String titulo;


    @NotEmpty(message = "Descrição deve estar preenchida")
    @ApiModelProperty(value = "Descrição da reclamação", required = true, dataType = "String")
    private String descricao;


    @NotEmpty(message = "Local deve estar preenchido")
    @ApiModelProperty(value = "Local da reclamação", required = true, dataType = "String")
    private String local;


    @NotEmpty(message = "Nome da empresa deve estar preenchido")
    @ApiModelProperty(value = "Nome da empresa", required = true, dataType = "String")
    private String nomeEmpresa;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
}