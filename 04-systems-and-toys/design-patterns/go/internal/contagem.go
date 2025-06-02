package internal

import (
	"fmt"
	"io"
)

const (
	ultimaPalavra  = "Vai!"
	inicioContagme = 3
)

func Contagem(saida io.Writer) {
	for i := inicioContagme; i > 0; i-- {
		fmt.Fprintln(saida, i)
	}
	fmt.Fprint(saida, ultimaPalavra)
}
