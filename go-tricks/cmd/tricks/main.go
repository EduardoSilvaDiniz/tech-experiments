package main

import "go-tricks/internal"

func main() {
	emailNotifier := internal.EmailNotificador{
		Email: "test@gmail.com",
	}
	servico := internal.ServicoUsuario{
		Notificador: emailNotifier,
	}

	servico.CriarConta("Eduardo")
}
