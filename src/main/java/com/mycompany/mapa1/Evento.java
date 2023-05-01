package com.mycompany.mapa1;

import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Evento {
    
    private String nome;
    private Date data;
    private Double valor;

    public Evento() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
//    - Armazenar dados de Evento:
//    evento deverá ter como atributos, nome, data, valor único, capacidade máxima e uma lista de ingressos vendidos
//    essas informações são obrigatórias.
//    - Para evento deve existir um método vender ingresso, no qual irá adicionar o ingresso criado na lista,
//    verificando se não excede a capacidade máxima do evento
//    - Para evento deve existir também um método pra mostrar a quantidade de ingressos vendidos.
    
}
