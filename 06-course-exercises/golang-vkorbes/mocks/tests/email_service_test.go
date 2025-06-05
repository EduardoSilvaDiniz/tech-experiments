package tests

import (
	"mocks/internal"
	"testing"
)

type EmailServiceMock struct {
	Enviou bool
}

func (e *EmailServiceMock) EnviarEmail(destinatario, mensagem string) error {
	e.Enviou = true
	return nil
}

func TestCriarPedido(t *testing.T)  {
	mock := &EmailServiceMock{}
	service := internal.PedidoService{Email: mock}

	service.CriarPedido("eduardo@exemple.com")

	if !mock.Enviou {
		t.Error("Esperava que o email fosse enviado")
	}
}
