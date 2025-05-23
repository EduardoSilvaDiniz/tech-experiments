package main

import (
	"fmt"
)

type pessoa struct {
	nome      string
	sobrenome string
	idade     int
}

type programador struct {
	pessoa
	linguagem string
	salario   float64
}

type medico struct {
	pessoa
	expecializacao string
	salario        float64
}

func (x programador) exibirInformacoes() {
	fmt.Println("meu nome é", x.nome, "minha linguagem de programação é", x.linguagem)
}

func (x medico) exibirInformacoes() {
	fmt.Println("meu nome é", x.nome, "eu sou expecialista em", x.expecializacao)
}

type gente interface {
	exibirInformacoes()
}

func serhumano(g gente) { // a interface torna independete do tipo, permitindo polimofismo
	g.exibirInformacoes()
}

func blbl() {
	junior := programador{pessoa: pessoa{nome: "rafael", sobrenome: "da silva", idade: 20},
		linguagem: "Golang", salario: 4.400}
	dentista := medico{pessoa: pessoa{nome: "lucas", sobrenome: "moura", idade: 32}, expecializacao: "dentista", salario: 5.200}

	serhumano(junior)
	serhumano(dentista)
}
