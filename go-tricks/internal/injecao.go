package internal

import "fmt"

type Notificador interface {
	Notificar(mensagem string)
}

type EmailNotificador struct {
	Email string
}

func (e EmailNotificador) Notificar(mensagem string) {
	fmt.Printf("enviado email para %s: %s\n", e.Email, mensagem)
}

type ServicoUsuario struct {
	Notificador Notificador
}

func (s ServicoUsuario) CriarConta(nome string) {
	fmt.Println("criando conta para", nome)
	s.Notificador.Notificar("Conta criada com sucesso")
}
