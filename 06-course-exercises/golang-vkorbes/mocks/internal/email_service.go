package internal

type EmailSerivce interface {
	EnviarEmail(destinatario string, conteudo string) error
}

type PedidoService struct {
	Email EmailSerivce
}

func (p PedidoService) CriarPedido(nome string) {
	p.Email.EnviarEmail(nome, "Seu pedido foi criado")
}
